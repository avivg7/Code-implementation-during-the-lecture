
import java.util.concurrent.*;

public class MyActiveModel implements Model {
	
	/// warning! Race condition may occur!
	
	volatile StringBuilder str;
	volatile boolean stop = false;
	BlockingQueue<Runnable> dispatchQueue = new LinkedBlockingQueue<Runnable>();
	
	public MyActiveModel() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(!stop) {
					try {
						dispatchQueue.take().run();
					} catch(InterruptedException e) {}
				}
			}	
		}).start();
	}
	
	@Override
	public void generateString() throws InterruptedException {
		dispatchQueue.put( () -> { // run () -> Runnable
				str = new StringBuilder("!dlroW olleH");
				System.out.println("The string has been initialized with: " + str.toString());				
		});
	}

	@Override
	public void solve() throws InterruptedException {
		dispatchQueue.put( () -> { // run () -> Runnable
			str = str.reverse();
			System.out.println("The string has been reversed into: " + str.toString());
		});
	}

	@Override
	public void stopRunning() throws InterruptedException {
		dispatchQueue.put( () -> {
			System.out.println("The Queue is empty!");
			stop = true;
		});
	}
}
