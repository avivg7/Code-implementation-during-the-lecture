
public class Main {

	public static void main(String[] args) {
		Ping ping = new Ping();
		Pong pong = new Pong();
		
		Thread t = new Thread(ping, "thread 1");
		Thread t1 = new Thread(pong, "thread 2");
		
		t.start();	
		try {
			Thread.sleep(500);} catch (Exception e) {}
		t1.start();
	}
}
