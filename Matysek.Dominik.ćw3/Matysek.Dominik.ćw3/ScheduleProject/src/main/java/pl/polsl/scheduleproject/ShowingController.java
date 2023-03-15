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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import pl.polsl.model.Activity;
import pl.polsl.model.Date;
import pl.polsl.model.Owner;
import pl.polsl.model.Vehicle;

/**
 * 
 * WORK IN PROGRESS
 * FXML Controller class responsible for the page with purpose of showing schedule data
 * 
 * 
 * @author Dominik Matysek
 * @version 1.3
 */
public class ShowingController{
    
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
    * Value represents object of the TableView class
    */
    @FXML
    private TableView<Activity> table;
    
   /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Activity, String> task;   
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Date, Integer> actDates;
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Owner, String> clientN;
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Owner, String> clientSn;
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Owner, String> clientAdr;
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Owner, Integer> clientNumb;
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Vehicle, String> vehMod;
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Vehicle, Integer> vehYear;
    /**
    * Value represents object of the TableColumn class
    */
    @FXML
    private TableColumn<Vehicle, String> vehNumb;
            
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
    
//    ObservableList<Activity> list;
//    
//    public ShowingController()
//    {
//        list = FXCollections.observableArrayList(model.getActivities());
//    }
//    
//    public void initialize(URL url, ResourceBundle rb)
//    {
//        //id.setCellValueFactory(new PropertyValueFactory<Schedule, Integer>("id"));
//        task.setCellValueFactory(new PropertyValueFactory("activityName"));
//        actDates.setCellValueFactory(new PropertyValueFactory("day"));
//        clientN.setCellValueFactory(new PropertyValueFactory("name"));
//        clientSn.setCellValueFactory(new PropertyValueFactory("surname"));
//        clientAdr.setCellValueFactory(new PropertyValueFactory("address"));
//        clientNumb.setCellValueFactory(new PropertyValueFactory("phone_number"));
//        vehMod.setCellValueFactory(new PropertyValueFactory("model"));
//        vehYear.setCellValueFactory(new PropertyValueFactory("production_year"));
//        vehNumb.setCellValueFactory(new PropertyValueFactory("registration_number"));
//    }

}
