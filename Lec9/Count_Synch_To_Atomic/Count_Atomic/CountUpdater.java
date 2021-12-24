
public class CountUpdater implements Runnable {
	
	Count c;
	
	public CountUpdater(Count c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100000000; i++) {
			c.update();
		}
	}
}
