package pl.polsl.scheduleproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App - main class of the application realizing the operations
 * on Scheduler.
 * 
 * @author Dominik Matysek
 * @version 1.3
 */
public class App extends Application {

    /**
     * Represents object of the Scene class
     */
    private static Scene scene;
    
    /**
     * The start method runs once the application is ready to run
     *
     * @param stage The primary stage for this application
     * @throws IOException Signals that an I/O exception of some sort has
     * occurred
     */
    @Override
    public void start(Stage stage) throws IOException 
    { 
        Parent root = FXMLLoader.load(getClass().getResource("First.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main method of the application
     *
     * @param args arguments entered into command line when the program 
     * starts running
     */
    public static void main(String[] args) 
    {
        launch();
    }

}