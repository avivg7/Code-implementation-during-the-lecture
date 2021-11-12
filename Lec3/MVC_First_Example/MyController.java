
public class MyController implements Controller {
	
	View view;
	Model model;
	
	public MyController() {}

	@Override
	public void display(String fileName) {
		this.view.display(fileName); 

	}

	@Override
	public void convert(String fileName) {
		this.model.convert(fileName);

	}

	@Override
	public void setModel(Model model) {
		this.model = model; 

	}

	@Override
	public void setView(View view) {
		this.view = view;

	}

}
