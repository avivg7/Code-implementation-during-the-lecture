import java.util.concurrent.atomic.AtomicInteger;

public class Count {
	private AtomicInteger count = new AtomicInteger(0);
	
	public void setCount(int x) {
		this.count.set(x);;
	}
	
	public int getCount() {
		return this.count.get();
	}
	
	public void update() {
		this.count.incrementAndGet();
	}
}
