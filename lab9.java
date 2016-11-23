/**
Lab 9
https://github.com/leederacola/Lab_9.git
Do the problem 14.21 (Page 582) - Two circles and their distance as explained in your test book. 
Turn in your Java source program(s) and a screen shot(s) of your outputs. 
You my turn in an image file or a pdf for your outputs.  
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import java.util.Random;

public class  lab9 extends Application
{
	@Override //override the start method in App class
	
	public void start(Stage primaryStage)
	{
		double x = Math.random()*300 +15;
		double y = Math.random()*300 + 15;
		double x2 = Math.random()*300 +15;
		double y2 = Math.random()*300 + 15;
		
		
		Pane pane = new Pane();
		//create circle 1
		Circle circle1 = new Circle();
		circle1.setCenterX(x);
		circle1.setCenterY(y);
		//circle1.centerXProperty().bind(pane.widthProperty().divide(2));
		//circle1.centerYProperty().bind(pane.heightProperty().divide(2));
		circle1.setRadius(15);
		circle1.setFill(Color.GREEN);
		pane.getChildren().add(circle1);
		
		//craete circle 2
		Circle circle2 = new Circle();
		circle2.setCenterX(x2);
		circle2.setCenterY(y2);
		//circle2.centerXProperty().bind(pane.widthProperty().divide(4));
		//circle2.centerYProperty().bind(pane.heightProperty().divide(4));
		circle2.setRadius(15);
		circle2.setFill(Color.RED);
		pane.getChildren().add(circle2);
		
		//line.......
		Line line = new Line();
		line.setStartX(x);
		line.setStartY(y);
		line.setEndX(x2);
		line.setEndY(y2);
		//line.endProperty().bind(circle2.centerXProperty());
		line.setStrokeWidth(2);
		line.setStroke(Color.BLUE);
		//Bind line end points to circle 
		pane.getChildren().add(line);
		
		//create scene and place in into the stage
		Scene scene = new Scene(pane, 300,  300);
		primaryStage.setTitle("Here is Lab 9!");
		primaryStage.setScene(scene); //placing scene in stage
		primaryStage.show();  //this display everything
	}
	
	/*
	public double ranoInt()
	{
		double x = (Math.random()*100);
		return x;
	}
	*/
}


