package view;

import java.util.Observable;
import java.util.Observer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view_model.ViewModel;

public class MainWindowController implements View, Observer {
	
	ViewModel vm;
	@FXML
	TextField varX, varY;
	@FXML
	Label resultLabel;

	@Override
	public void setViewModel(ViewModel vm) {
		this.vm = vm;
		this.vm.x.bind(varX.textProperty());
		this.vm.y.bind(varY.textProperty());
		this.resultLabel.textProperty().bind(vm.result.asString());
	}

	@Override
	public void onCalc() {vm.plus();}
	
	@Override
	public void update(Observable o, Object arg) {}

}
