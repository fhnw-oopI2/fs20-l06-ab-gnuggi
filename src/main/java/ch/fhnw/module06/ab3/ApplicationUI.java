package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;


public class ApplicationUI extends BorderPane {
	
	private TextArea textArea;
	private Button top;
	private Button right;
	private Button bottom;
	private Button left;

	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		textArea = new TextArea();
		top = new Button("top");
		right = new Button("right");
		bottom = new Button("bottom");
		left = new Button("left");
		
	}
	
	private void layoutControls() {
		
		int margin = 10;
		
		setCenter(textArea);
		setTop(top);
		setRight(right);
		setBottom(bottom);
		setLeft(left);
		
	 	setAlignment(top, Pos.CENTER);
	 	setAlignment(bottom, Pos.CENTER);
	 	
	 	setMargin(top, new Insets(margin));
		setMargin(right, new Insets(margin));
		setMargin(bottom, new Insets(margin));
		setMargin(left, new Insets(margin));
	 	
	 	bottom.setMaxWidth(1000);
	 	top.setMaxWidth(1000);
	 	

	}
}
