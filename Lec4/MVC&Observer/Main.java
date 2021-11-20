
public class Main {

	public static void main(String[] args) {
		
		View v = new MyView();
		Model m = new MyModel();
		Controller c = new MyController(v,m);
		
		((MyView)v).addObserver((MyController)c);
		((MyModel)m).addObserver((MyController)c);
		
		String useRequest = "upper-case-request";
		v.start(useRequest);
	
	}

}
