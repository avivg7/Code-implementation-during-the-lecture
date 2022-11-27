package my_basic_thread;

public class Main {

	public static void main(String[] args) {
		
		MyRunnable m0 = new MyRunnable("Zero");
		MyRunnable m1 = new MyRunnable("One");
		MyRunnable m2 = new MyRunnable("Two");
		MyRunnable m3 = new MyRunnable("Three");
		
		Thread t0 = new Thread(m0);
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();

	}

}
