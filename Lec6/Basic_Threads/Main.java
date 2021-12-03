
public class Main {

	public static void main(String[] args) {
		
		MyRunnable m0 = new MyRunnable("zero");
		MyRunnable m1 = new MyRunnable("one");
		MyRunnable m2 = new MyRunnable("two");
		MyRunnable m3 = new MyRunnable("three");
		
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
