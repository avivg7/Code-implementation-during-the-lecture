import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("MyCallable task is running\nString in making");
		Thread.sleep(10000);
		return "Hello World!";
	}
}
