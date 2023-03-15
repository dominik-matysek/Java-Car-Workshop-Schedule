/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.scheduleproject;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class responsible for the primary page (main menu)
 * of the application
 * 
 * @author Dominik Matysek
 * @version 1.3
 */
public class FirstController {
    
    
    /**
     * Represents object of Stage class
     */
    private Stage stage;
    /**
     * Represents object of Scene class
     */
    private Scene scene;
    /**
     * Represents object of Parent class
     */
    private Parent root;
    
    
    /**
     * Method for changing scene on button click
     * 
     * @param event An event for some sort of action
     * @throws IOException Signals that an I/O exception of some sort has
     * occurred
     */
    public void switchToSceneAdd(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Adding.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Method for closing app on button click
     * 
     * @param event An event for some sort of action
     */
     public void closeApp(ActionEvent event)
    {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }
    
     /**
     * Method for changing scene on button click
     * 
     * @param event An event for some sort of action
     * @throws IOException Signals that an I/O exception of some sort has
     * occurred
     */
    public void switchToSceneShow(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Showing.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
