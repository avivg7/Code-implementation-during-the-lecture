
public class Main {

	public static void main(String[] args) {
		Controller c = new MyController();
		View v = new MyView(c);
		Model m = new MyModel(c);
		
		c.setView(v);
		c.setModel(m);
		
		String[] files = {
				"number one",
				"number two",
				"number three",
				"number four",
			};
		
		v.start(files);
	}

}
