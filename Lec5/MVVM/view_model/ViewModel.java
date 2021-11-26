package view_model;

import java.util.Observable;
import java.util.Observer;
import javafx.beans.property.*;

import model.CalcModel;

public class ViewModel extends Observable implements Observer {
	CalcModel m;
	public StringProperty x, y;
	public DoubleProperty result;

	public ViewModel(CalcModel m) {
		this.m = m;
		this.x = new SimpleStringProperty();
		this.y = new SimpleStringProperty();
		this.result = new SimpleDoubleProperty();
	}

	public void plus() {
		try {
			m.plus(Double.parseDouble(x.get()), Double.parseDouble(y.get()));
		} catch (Exception e) {
			System.out.println("Only Numbers!!!");
			this.result.set(0);
		}
	}
	@Override
	public void update(Observable o, Object arg) {
		if (o == m) {
			this.result.set(this.m.getResult());
		}
	}

}
