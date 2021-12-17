import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.execute(() ->{ 
					System.out.println("The first task is running");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
		});
		
		executor.execute(() ->{ 
				System.out.println("The second task is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
		});
		
		executor.execute(() ->{ 
				System.out.println("The third task is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
		});
		
		executor.execute(() ->{ 
				System.out.println("The forth task is running");
				try {
					Thread.sleep(7000);
					System.out.println("Main Thread is still blocked");
				} catch (InterruptedException e) {}
		});
		
		Future<String> f = executor.submit(new MyCallable());
		
		System.out.println("After submitting MyCallable (and all the other tasks)");
		
		String outputOfSubmit = f.get();
		System.out.println("The output is ready: " + outputOfSubmit);
	}
}
