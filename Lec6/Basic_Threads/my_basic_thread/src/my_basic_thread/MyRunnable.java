package my_basic_thread;

import java.util.Random;

public class MyRunnable implements Runnable {
	String name;
	int time;
	Random r;
	
	public MyRunnable(String n) {
		this.name = n;
		this.r = new Random();
		this.time = r.nextInt(1000);
	}

	@Override
	public void run() {
		try {
			System.out.println(name + " is sleeping for "+time+" MiliSec");
			Thread.sleep(this.time);
			System.out.println(name+" is done \n");
		} catch (Exception e) {}

	}

}
