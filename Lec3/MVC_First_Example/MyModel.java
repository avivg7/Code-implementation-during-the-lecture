
public class MyModel implements Model {
	Controller controller;
	
	public MyModel(Controller c) {
		this.controller = c;
	}

	@Override
	public void convert(String fileName) {
		System.out.println(fileName + " has converted by Model"); 
		String upper = fileName.toUpperCase();
		controller.display(upper);

	}

}
