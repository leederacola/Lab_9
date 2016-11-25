import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.*;

import javafx.stage.Stage;

import javafx.scene.layout.HBox;

 

public class lol extends Application {

    @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {

        // Create a button and place it in the scene

        

        Label label1 = new Label("Name:");

        TextField textField = new TextField ();

        HBox hb = new HBox();

        hb.getChildren().addAll(label1, textField);

        hb.setSpacing(10);

        

        //Button btOK = new Button("OK");

        Scene scene = new Scene(hb, 300, 100);

        primaryStage.setTitle("MyJavaFX"); // Set the stage title

        primaryStage.setScene(scene); // Place the scene in the stage

        primaryStage.show(); // Display the stage

    }

    

    /**

     * The main method is only needed for the IDE with limited

     * JavaFX support. Not needed for running from the command line.

     */

    public static void main(String[] args) {

        launch(args);

    }

}