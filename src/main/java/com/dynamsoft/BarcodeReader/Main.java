package com.dynamsoft.BarcodeReader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.net.URL;


public class Main extends Application {
	
	private static Stage primaryStage; // **Declare static Stage**

    private void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    static public Stage getPrimaryStage() {
        return primaryStage;
    }
    
	@Override
	public void start(Stage primaryStage) {
		setPrimaryStage(primaryStage);
		try {
			URL url = getClass().getResource("/fxml/Main.fxml");
			System.out.println(url);
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root);
            primaryStage.setTitle("Barcode Reader");
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
