import java.util.Observable;
import java.util.Observer;

public class MyController implements Controller, Observer {
	
	View view;
	Model model;
	
	public MyController(View v, Model m) {
		this.view = v;
		this.model = m;
	}


	@Override
	public void update(Observable o, Object arg) {
		
		if (o == view) {
			this.model.convert(this.view.getUserRequest());
		}
		
		if (o == model) {
			this.view.display(this.model.getData());
		}
		
	}

}
