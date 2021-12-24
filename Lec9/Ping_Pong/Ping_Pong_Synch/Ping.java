
public class Ping implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Ping");
			try {
				Thread.sleep(1000); } catch (Exception e) {}
		}
	}
}
