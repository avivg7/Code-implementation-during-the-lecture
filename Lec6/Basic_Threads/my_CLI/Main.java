package my_CLI;

public class Main {

	public static void main(String[] args) {
		CLI ui = new CLI(new MyTask());
		ui.start();
	}

}
