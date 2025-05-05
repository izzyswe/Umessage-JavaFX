package org;

import javax.swing.text.PlainView;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class App extends Application {
    @Override
	  public void start(Stage primaryStage) {
		  try {
			  AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/UmessageSplashScreen.fxml"));
			  Scene scene = new Scene(root,1000,820);
        //splash screen
        primaryStage.setResizable(false);
        primaryStage.setOnHidden(e -> {
            e.consume();
        });
        primaryStage.setOnShowing(e -> {
            e.consume();
          final Stage splashStage = new Stage(new PlainView(ele;
        });
        //set the timer to the splash screen for the main application
        primaryStage.setOnShowing(e -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
			  scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
			  primaryStage.setScene(scene);
        primaryStage.setTitle("Umessage");
			  primaryStage.show();
		  } catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
    public static void main(String[] args) {
      launch(args);
    }

}
