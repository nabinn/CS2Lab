/*
15.3 (Move the ball) 
Write a program that moves the ball in a pane. You should define a pane class for 
displaying the ball and provide the methods for moving the ball left, right, up, and
down. Check the boundary to prevent the ball from moving out of sight completely.
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


class BallPane extends Pane {

    private Circle circle;

    public BallPane(double centerX, double centerY, double radius) {
        circle = new Circle(centerX, centerY, radius);
        circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
        getChildren().add(circle);
    }

    public void moveUp() {
        if (circle.getCenterY() - circle.getRadius()  - 10 < 0) return;
        circle.setCenterY(circle.getCenterY() - 10);
    }
    public void moveDown() {
        if (circle.getCenterY() + circle.getRadius() + 10 > getHeight()) return;

        circle.setCenterY(circle.getCenterY() + 10);
    }
    public void moveRight() {
        if (circle.getCenterX() + circle.getRadius() + 10 > getWidth()) return;
        circle.setCenterX(circle.getCenterX() + 10);
    }
    public void moveLeft() {
        if (circle.getCenterX() - circle.getRadius()  - 10 < 0) return;
        circle.setCenterX(circle.getCenterX() - 10);

    }
}


public class Exercise_15_03 extends Application {

    int width = 300;
    int height = 300;
    int padding = 10;
    int radius = 25;
	
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        BallPane ballPane = new BallPane(width/2, height/2, radius);
        
        Button leftButton = new Button("Left");
        leftButton.setOnAction(e -> ballPane.moveLeft());
        
        Button rightButton = new Button("Right");
        rightButton.setOnAction(e -> ballPane.moveRight());

        Button upButton = new Button("Up");
        upButton.setOnAction(e -> ballPane.moveUp());

        Button downButton = new Button("Down");
        downButton.setOnAction(e -> ballPane.moveDown());

        HBox menu = new HBox(leftButton, rightButton, upButton, downButton);
        menu.setAlignment(Pos.BOTTOM_CENTER);
        menu.setSpacing(padding);
        menu.setPadding(new Insets(padding, padding, padding, padding));

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(menu);

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_03");
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}