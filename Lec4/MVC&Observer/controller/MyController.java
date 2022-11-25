package controller;

import java.util.Observable;
import java.util.Observer;
import model.Model;
import view.View;

public class MyController implements Controller, Observer {
	
	View view;
	Model model;
	
	public MyController(View v, Model m) {
		this.model = m;
		this.view = v;
	}

	@Override
	public void update(Observable o, Object arg) {
		
		if (o == view) {
			this.model.convert(view.getUserRequest());
		}
		
		if(o == model) {
			this.view.display(model.getData());
		}
		
	}

	

	

}
