package exam.controller;

import exam.MainApp;
import exam.model.MainModel;

public class MainController {
	
	private MainApp mainApp;
	private MainModel mainModel;
	
	public MainController() {
		mainModel = new MainModel();
	}
	
	public void setMainApp(MainApp mainApp) {
    	this.mainApp = mainApp;
    }
}
