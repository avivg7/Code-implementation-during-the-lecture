package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view_model.ViewModel;

public class MainWindowController {

	ViewModel vm;
	@FXML
	TextField varX, varY;
	@FXML
	Label resultLabel;

	public void setViewModel(ViewModel vm) {
		this.vm = vm;
		this.vm.x.bind(varX.textProperty());
		this.vm.y.bind(varY.textProperty());
		this.resultLabel.textProperty().bind(vm.result.asString());
	}

	public void onCalc(){ this.vm.plus();}

}
