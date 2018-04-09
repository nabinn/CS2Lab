/*********************************************************************************
* (Game: eye-hand coordination) Write a program that displays a circle of        *
* radius 10 pixels filled with a random color at a random location on a pane.    *
* When you click the circle, it disappears and a new random                      *
* color circle is displayed at another random location. After twenty circles are *
* clicked, display the time spent in the pane.                                   * 
*********************************************************************************/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_15_19 extends Application {

	    static int numberOfClicks = 0;

	    @Override
	    public void start(Stage primaryStage) {

	        double width = 500;
	        double height = 500;
	        
	        Circle circle = new Circle(250, 250, 10);
	        updateCircle(circle);
	        Pane pane = new Pane(circle);
	        Text count = new Text(50,50,numberOfClicks + "");
	        pane.getChildren().add(count);
	        final long start = System.currentTimeMillis();
	        
	        circle.setOnMouseClicked(e-> {
	            if (numberOfClicks < 19) {
	                numberOfClicks++;
	                count.setText(numberOfClicks + "");
	                updateCircle(circle);
	                
	            } else {
	                final long stop = System.currentTimeMillis();
	                pane.getChildren().remove(circle);
	                pane.getChildren().add(new Text(width / 2, height / 2, "Time spent: " + (stop-start) + " milliseconds"));
	            }
	        });
	        
	        
	        primaryStage.setScene(new Scene(pane, width, height));
	        primaryStage.setTitle("Game: eye-hand coordination");
	        primaryStage.show();
	    }

	  
	    private void updateCircle(Circle circle) {
	        double min = circle.getRadius() + 5;
	        double max = 500 - circle.getRadius() - 5;
	        circle.setCenterX((Math.random() * (max - min) + min));
	        max = 500- circle.getRadius() - 5;
	        circle.setCenterY((Math.random() * (max - min) + min));
	        circle.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
	    }

	  public static void main(String[] args) {
	        Application.launch(args);
	    }
}