//package lab7;

/*********************************************************************************
 * 14.13 (Display a pie chart) Write a program that uses a pie chart to display 
 * the percentages of the overall grade represented by projects, quizzes, mid-term 
 * exams, and the final exam, as shown in Figure 14.46c(below). Suppose that 
 * projects take 20 percent and are displayed in red, 
 * quizzes take 10 percent and are displayed in blue, 
 * mid-term exams take 30 percent and are displayed in green, 
 * and the final exam takes 40 percent and is displayed in orange. 
 * Use the Arc class to display the pies. 
 * Interested readers may explore the JavaFX PieChart class for further study.
*********************************************************************************/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.ArrayList;



public class Exercise14_13 extends Application {
	
    @Override
    public void start(Stage primaryStage) {
    	
    	Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
    	double[] percentages = {0.20, 0.10, 0.30, 0.40};
    	String[] labels = new String[] {
                "Project -- " + String.format("%d%s", (int)(100 * percentages[0]), "%"),
                "Quiz -- " + String.format("%d%s", (int)(100 * percentages[1]), "%"),
                "Midterm -- " + String.format("%d%s", (int)(100 * percentages[2]), "%"),
                "Final -- "+ String.format("%d%s", (int)(100 * percentages[3]), "%")
        };
    	
        double radius = 100;
        double centerX = 200;
        double centerY = 200;
     
    	
        Pane pane = new Pane();
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle c = new Circle(centerX, centerY, radius, Color.TRANSPARENT);
        c.setStroke(Color.BLACK);
        shapes.add(c);
        double angle = 0;
        for (int i = 0; i < labels.length; i++) {
            double length = percentages[i] * 100 * 3.6;
            Arc arc = new Arc(centerX, centerY, radius, radius, angle, length);
            arc.setFill(colors[i]);
            arc.setType(ArcType.ROUND);
            shapes.add(arc);

            double x = centerX + radius * Math.cos(Math.toRadians(angle * -1 - (length / 2)));
            double y = centerY + radius * Math.sin(Math.toRadians(angle * -1 - (length / 2)));
            if (y > centerY) {
                y -= radius / 2;
                x -= radius / 2;
            }
            Text text = new Text(x, y, labels[i]);
            shapes.add(text);

            angle += length;
        }

        pane.getChildren().addAll(shapes);
        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("Pie chart");
        primaryStage.show();
    }

    public static void main(String[] args) {
    	
        Application.launch(args);
    
    }

}
