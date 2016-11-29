/**
This will somehow launch lab9
This will dictate lab9 colors and scene size
Somehow............

This will somehow launch lab9
This will dictate lab9 colors and scene size
Somehow............
eventually.........
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import java.util.Random;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class xtraLab9 extends Application 
{
	String c1Color = "";
	String c2Color = "";
	String lnColor = "";
	int xhorz, yvert;
	int colorCode;
	
	//String[] color = new 
	
	//String[] color = new 
	
	TextField textX, textY, textCircle, textCircle2, textLine;
	Label labelX, labelY, labelCircle, labelCircle2, labelLine;
	Button launch, clear;
	
	@Override
    public void start(Stage primaryStage)
	{
		//make controls
		textX = new TextField();
		textX.setPromptText("X Axis for New Window.");
		textY = new TextField();
		textY.setPromptText("Y Axis for new Window.");
		textCircle = new TextField();
		textCircle.setPromptText("red=1, green=2, blue=3");
		textCircle2 = new TextField();
		textCircle2.setPromptText("red=1, green=2, blue=3");
		textLine = new TextField();
		textLine.setPromptText("red=1, green=2, blue=3");
		
		labelX = new Label("Scene X");
		
		labelY = new Label("Scene Y");
		
<<<<<<< HEAD
=======
		labelX = new Label("Scene X");
		
		labelY = new Label("Scene Y");
		
>>>>>>> 2a4c04596366f480dae2f8dcaa29f6d90814daef
		labelCircle = new Label("Circle 1 Color");
		labelCircle2 = new Label("Circle 2 Color");
		labelLine = new Label("Line Color");
		
		launch = new Button("Launch");
		launch.setPrefWidth(250);
		clear = new Button("clear");
		clear.setPrefWidth(250);
		//make container
		GridPane root = new GridPane();
		//put container in middle of scene
		root.setAlignment(Pos.CENTER);
		//spacing beteween controls and grid
		root.setHgap(10);
		root.setVgap(10);
		// making grid each cell and control (col, row)
		root.add(labelX, 0, 0);
		root.add(textX, 1, 0);
		root.add(labelY, 0, 1);
		root.add(textY, 1, 1);
		root.add(labelCircle, 0, 2);
		root.add(textCircle, 1, 2);
		root.add(labelCircle2, 0, 3);
		root.add(textCircle2, 1, 3);
		root.add(labelLine, 0, 4);
		root.add(textLine, 1, 4);
		//doubles.....(col, row, colSpan, rowSpan)
		root.add(clear, 0, 5, 2, 1);
		root.add(launch, 0, 6, 2, 1);
		
		Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Customize Lab 9!!!!!! Hopefully");
        primaryStage.setScene(scene);
        primaryStage.show();
		
		//understand this more thruoughly...........
		clear.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
				textX.clear();
				textY.clear();
				textCircle.clear();
				textCircle2.clear();
				textLine.clear();
				System.out.println(e.getSource());
				
			}
		});
		
		launch.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
				
				xhorz = (Integer.parseInt(textX.getText()));
				yvert =  (Integer.parseInt(textY.getText()));
				//c1Color = (textCircle.getText());
				c2Color = (textCircle2.getText());
				lnColor = (textLine.getText());
				//System.out.println("color 2 is " + c2Color);
				
				Random rand = new Random();
				// Range accoutn for scene and circel diameter =((max - min) + 1) + min;
				int x = rand.nextInt((xhorz - 15) + 1) + 15;
				int y = rand.nextInt((yvert - 15) + 1) + 15;
				int x2 = rand.nextInt((xhorz - 15) + 1) + 15;
				int y2 = rand.nextInt((yvert - 15) + 1) + 15;
		
				double xdif = Math.pow((x2-x),2);
				double ydif = Math.pow((y2-y),2);
				double length = Math.sqrt(xdif + ydif);
		
				Stage stage = new Stage(); // Create a new stage
				Pane pane = new Pane();
				//create circle 1
				Circle circle1 = new Circle();
				circle1.setCenterX(x);
				circle1.setCenterY(y);
			
				circle1.setRadius(15);
				circle1.setFill(Color.BLACK);
<<<<<<< HEAD
				circle1.setFill(getColor(Integer.parseInt(textCircle.getText())));
=======
>>>>>>> 2a4c04596366f480dae2f8dcaa29f6d90814daef
				//pane.getChildren().add(circle1);

				//craete circle 2
				Circle circle2 = new Circle();
				circle2.setCenterX(x2);
				circle2.setCenterY(y2);
		
				circle2.setRadius(15);
<<<<<<< HEAD
				circle2.setFill(getColor(Integer.parseInt(textCircle2.getText())));
=======
				circle2.setFill(Color.BLACK);
>>>>>>> 2a4c04596366f480dae2f8dcaa29f6d90814daef
				//pane.getChildren().add(circle2);
				
				//line.......
			
				Text text = new Text((((x+x2)/2)+10), (((y+y2)/2)+10),Double.toString(length));
				//Label label1 = new Label(Double.toString(length));
				Line line = new Line(); 
				line.setStartX(x);
				line.setStartY(y);
				line.setEndX(x2);
				line.setEndY(y2);
				//line.endProperty().bind(circle2.centerXProperty());
				line.setStrokeWidth(2);
				line.setStroke(getColor(Integer.parseInt(textLine.getText())));
				//Bind line end points to circle 
				pane.getChildren().addAll(line, circle1, circle2, text);
				
				//create scene and place in into the stage
				Scene scene = new Scene(pane, xhorz,  yvert);
				stage.setTitle("Here is Lab 9!");
				stage.setScene(scene); //placing scene in stage
				stage.show();  //this display everything
					}
				});
	
	}

 public Color getColor(int inputColor )
 {
	switch(inputColor)
	{
		case 1: return Color.RED;
		//break;
		case 2: return Color.GREEN;
		//break;
		case 3: return Color.BLUE;
		//break;
		
	}
	return Color.BLACK;
 }
	
	
}
		
		
		
		
		
		
		
		
		
		