/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.scheduleproject;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class responsible for the Adding2 view which prints input
 * recently provided by user 
 * 
 * 
 * @author Dominik Matysek
 * @version 1.3
 */
public class Adding2Controller {

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
     * Represents object of the Label class
     */
    @FXML
    /**
     * Represents object of the Label class
     */        
    Label taskLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label dateLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label nameLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label surnameLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label addressLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label phoneLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label modelLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label regLabel;
    /**
     * Represents object of the Label class
     */
    @FXML
    Label yearLabel;

    /**
     * Method for displaying input recently provided by user
     * @param name name of activity
     * @param y year
     * @param m month
     * @param d day
     * @param vehNumb vehicle registration number
     * @param vehMod vehicle model
     * @param vehYear vehicle year of production
     * @param clientN client name
     * @param clientSn client surname
     * @param clientNumb client phone number
     * @param clientAdr client address
     */
    public void display(String name, int y, int m, int d, String vehNumb, String vehMod, int vehYear, String clientN, String clientSn, int clientNumb, String clientAdr)
    {
        taskLabel.setText("Task: " + name);
        dateLabel.setText("Date: " + d + "." + m + "." + y);
        nameLabel.setText("Client name: " + clientN);
        surnameLabel.setText("Client surname: " + clientSn);
        addressLabel.setText("Client adress: " + clientAdr);
        phoneLabel.setText("Client phone: +48 " + clientNumb);
        modelLabel.setText("Vehicle model: " + vehMod);
        regLabel.setText("Vehicle registration number: " + vehNumb);
        yearLabel.setText("Vehicle year of production: " + vehYear);
    }
    
    /**
     * Method for changing scene on button click
     * 
     * @param event An event for some sort of action
     * @throws IOException Signals that an I/O exception of some sort has
     * occurred
     */
    public void switchToSceneFirst(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("First.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
