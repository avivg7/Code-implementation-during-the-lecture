import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		//ExecutorService executor = Executors.newFixedThreadPool(2);
		ExecutorService executor = Executors.newCachedThreadPool();

		executor.execute(new RunnableTask1());
		executor.execute(new RunnableTask2());
		executor.execute(new RunnableTask3());		
	}
}
