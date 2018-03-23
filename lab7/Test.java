package lab7;

//14.4 Show the output of the following JavaFX program.
import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {      
  public Test() {
    System.out.println("Test constructor is invoked");
  }

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    System.out.println("start method is invoked");
  }

  public static void main(String[] args) {
    System.out.println("launch application");
    Application.launch(args);
  }
}


/*
	The output of the above program is:
 
	launch application
	Test constructor is invoked
	start method is invoked
*/