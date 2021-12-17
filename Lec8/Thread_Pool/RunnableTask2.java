
public class RunnableTask2 implements Runnable {

	@Override
	public void run() {
		System.out.println("task2 started");
		try { Thread.sleep(4000);
			
		} catch (InterruptedException e) {}
		System.out.println("task2 finished");
		
	}

}
