package my_CLI;

public class MyTask implements Task {
	
	long x;
	volatile boolean stop;
	
	public MyTask() {
		this.x = 0;
		this.stop = false;
	}

	@Override
	public void doTask() {
			System.out.println("Task has started");
			while(!stop) {
				x++;
			}

	}

	@Override
	public void stopTask() {
		System.out.println("Task stoped");
		this.stop = true;

	}

	@Override
	public long getX() {
		System.out.println("x returned. The current value of x is : "+x);
		return this.x;

	}

}
