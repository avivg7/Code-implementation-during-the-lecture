import java.util.Iterator;

public class MyView implements View {
	Controller controller;
	
	public MyView(Controller c) {
		this.controller = c;
	}
	
	@Override
	public void start(String[] files) {
		
		
		for (String file : files) {
			controller.convert(file);
		}

	}
	
	@Override
	public void display(String fileName) {
		System.out.println(fileName + " has displayed");

	}



}
