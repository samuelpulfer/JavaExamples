package exam;

import java.io.IOException;

import exam.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private BorderPane rootLayout;
	private Stage primaryStage;

	public void initRootLayout() {
		// Load root layout from fxml file
		try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("view/MainView.fxml"));
		rootLayout = (BorderPane) loader.load();
		
		// Show the scene
		Scene scene = new Scene(rootLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Give the controller access to the app
		MainController controller = loader.getController();
		controller.setMainApp(this);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Exam Project");
		
		initRootLayout();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
