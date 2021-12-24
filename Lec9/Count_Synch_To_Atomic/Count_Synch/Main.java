
public class Main {

	public static void main(String[] args) throws Exception {
		Count c = new Count();
		c.setCount(0);
		CountUpdater ca = new CountUpdater(c);
		
		Thread t = new Thread(ca);
		Thread t1 = new Thread(ca);
		
		long time = System.currentTimeMillis();
		
		t.start();
		t1.start();
		
		t.join();
		t1.join();

		System.out.println(c.getCount());
		long duration = (System.currentTimeMillis() - time) / 1000;
		System.out.println("Running time is: " + duration);
	}
}
