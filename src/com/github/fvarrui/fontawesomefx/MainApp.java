package com.github.fvarrui.fontawesomefx;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TilePane root = new TilePane(5, 5);
		
		for (FontAwesomeIcon icon : FontAwesomeIcon.values()) {
			
			FontAwesomeIconView iconView = new FontAwesomeIconView(icon);
			iconView.setGlyphSize(48);
			
			VBox iconPane = new VBox(5);
			iconPane.setPadding(new Insets(5));
			iconPane.setAlignment(Pos.CENTER);
			iconPane.getChildren().add(iconView);
			iconPane.getChildren().add(new Label(icon.name()));
			
			root.getChildren().add(iconPane);
		}
		
		primaryStage.setTitle("FontAwesomeFX :: Demo");
		primaryStage.setScene(new Scene(new ScrollPane(root), 640, 480));
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
