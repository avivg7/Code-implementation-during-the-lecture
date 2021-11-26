package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.MyCalcModel;
import view_model.ViewModel;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			MyCalcModel m = new MyCalcModel(); // Model
			ViewModel vm = new ViewModel(m); // View Model
			m.addObserver(vm);

			FXMLLoader fxl = new FXMLLoader();
			BorderPane root = (BorderPane)fxl.load(getClass().getResource("MainWindow.fxml").openStream());

			MainWindowController mwc = fxl.getController(); // View
			mwc.setViewModel(vm);

			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
