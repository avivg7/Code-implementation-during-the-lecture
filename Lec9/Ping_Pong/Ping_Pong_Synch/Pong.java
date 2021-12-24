
public class Pong implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Pong");
			try {
				Thread.sleep(1000); } catch (Exception e) {}
		}		
	}
}
