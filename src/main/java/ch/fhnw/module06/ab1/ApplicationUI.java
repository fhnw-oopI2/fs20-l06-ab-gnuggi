package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
	
	private Button hwButton;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		hwButton = new Button("Hello World");
		this.getChildren().add(hwButton);
	}
	
	private void layoutControls() {
		
	}
}
