import java.util.concurrent.atomic.AtomicInteger;

public class Count {
	private int count;
	
	public void setCount(int x) {
		this.count = x;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public synchronized void update() {
		this.count++;
	}
}
