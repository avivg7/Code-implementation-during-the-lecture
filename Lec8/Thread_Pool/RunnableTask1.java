
public class RunnableTask1 implements Runnable {

	@Override
	public void run() {
		System.out.println("task1 started");
		try { Thread.sleep(4000);
			
		} catch (InterruptedException e) {}
		System.out.println("task1 finished");
		
	}

}
