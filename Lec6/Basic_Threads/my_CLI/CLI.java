package my_CLI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CLI extends Thread {
	
	Task task;
	
	public CLI(Task t) {
		this.task = t;
	}
	
	@Override
	public void run() {
		System.out.println("1. start task");
		System.out.println("2. get X");
		System.out.println("3. stop task");
		System.out.println("4. exit");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 0;
		while(input!=4) {
			try {
				input = Integer.parseInt(in.readLine());
			} catch (Exception e) {}
			
			switch (input) {
			case 1:runTaskInThread(()->task.doTask());break;
			case 2:runTaskInThread(()->task.getX());break;
			case 3:runTaskInThread(()->task.stopTask());break;
			case 4:System.out.println("Main is terminated");java.lang.System.exit(0);

			}
		}
		
	}
	
	private void runTaskInThread(Runnable r) {
		new Thread(r).start();
	}

}
