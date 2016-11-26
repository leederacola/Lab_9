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
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class gridAction extends Application 
{
	String c1Color = "";
	String c2Color = "";
	String lnColor = "";
	int xhorz, yvert;
	
	TextField textX, textY, textCircle, textCircle2, textLine;
	Label labelX, labelY, labelCircle, labelCircle2, labelLine;
	Button launch, clear;
	
	@Override
    public void start(Stage primaryStage)
	{
		//make controls
		textX = new TextField();
		textY = new TextField();
		textCircle = new TextField();
		textCircle2 = new TextField();
		textLine = new TextField();
		
		labelX = new Label("X Pixels");
		labelY = new Label("Y Pixels");
		labelCircle = new Label("Circle 1 Color");
		labelCircle2 = new Label("Circel 2 Color");
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
		
		//understand this more thruoughly...........the method is 
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
				
			}
		});
		
		launch.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
				xhorz = Integer.parseInt(textX.getText());
				yvert =  Integer.parseInt(textY.getText());
			
				c1Color = (textCircle.getText());
				c2Color = (textCircle2.getText());
				lnColor = (textLine.getText());
				
			}
		});
	
	}
	
	
	
}
		
		
		
		
		
		
		
		
		
		