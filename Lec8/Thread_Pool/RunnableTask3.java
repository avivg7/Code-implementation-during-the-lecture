
public class RunnableTask3 implements Runnable {

	@Override
	public void run() {
		System.out.println("task3 started");
		try { Thread.sleep(4000);
			
		} catch (InterruptedException e) {}
		System.out.println("task3 finished");
		
	}

}
