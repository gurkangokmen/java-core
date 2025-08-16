import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
    public void start(Stage primaryStage) {
        // Create a label with your desired text
        Label label = new Label("Hello, this is a simple text window app!");

        // Create a StackPane layout and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a Scene with the layout and set the dimensions
        Scene scene = new Scene(root, 400, 300);

        // Set the scene on the primary stage (window) and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Text Window App");
        primaryStage.show();
    }

}
