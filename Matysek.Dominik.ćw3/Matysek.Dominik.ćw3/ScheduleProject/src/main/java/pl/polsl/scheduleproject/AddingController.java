/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.scheduleproject;
import pl.polsl.controller.ScheduleController;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import pl.polsl.annotations.UpdateAnnotation;
import pl.polsl.model.Schedule;


/**
 * FXML Controller class responsible for controlling
 * the Adding view which lets user add new activites to the 
 * scheduler
 * 
 * @author Dominik Matysek
 * @version 1.3
 */
@UpdateAnnotation
public class AddingController {
    
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField activityName;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField month;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField day;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField year;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField vehicleRegNumb;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField vehicleModel;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField vehicleYear;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField clientName;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField clientSurname;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField clientNumber;
    /**
     * Value represents object of the TextField class
     */
    @FXML
    private TextField clientAddress;
    
    /**
     * Values connected with user input
     */
    String actName,vehNumb,vehMod,clientN,clientSn,clientAdr;
    int vehYear,clientNumb,m,y,d;
    
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
    public void switchToSceneFirst(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("First.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Method for handling user input and checking whether it's correct
     * 
     * @param event An event for some sort of action
     * @throws IOException Signals that an I/O exception of some sort has
     * occurred
     */
    public void accept(ActionEvent event) throws IOException
    {  
        
        Schedule model = new Schedule("Maciej Skowron");
        ScheduleController controller = new ScheduleController(model);
        
        if(activityName.getText().matches("^[a-zA-Z ]+$") && vehicleModel.getText().matches("^[a-zA-Z0-9 ]+$") 
                && clientName.getText().matches("[a-zA-Z ]+") && clientSurname.getText().matches("[a-zA-Z ]+") 
                && clientAddress.getText().matches("^[a-zA-Z0-9. ]+$") 
                && vehicleRegNumb.getText().matches("[a-zA-Z0-9 ]+"))
        {
            actName = activityName.getText();
            vehNumb = vehicleRegNumb.getText();
            vehMod = vehicleModel.getText();
            clientN = clientName.getText();
            clientSn = clientSurname.getText();
            clientAdr = clientAddress.getText();

            try 
            {
                d = Integer.parseInt(day.getText());
                m = Integer.parseInt(month.getText());
                y = Integer.parseInt(year.getText());
                vehYear = Integer.parseInt(vehicleYear.getText());
                clientNumb = Integer.parseInt(clientNumber.getText());

                if(d < 1 || d > 31)
                {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Warning");
                    alert.setContentText("Invaild 'day' field input!");

                    alert.showAndWait();
                }

                else if(m < 1 || m > 12)
                {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Warning");
                    alert.setContentText("Invaild 'month' field input!");

                    alert.showAndWait();
                    }

                else if(y < 2022 || y > 2023)
                {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Warning");
                    alert.setContentText("Invaild 'year' field input!");

                    alert.showAndWait();
                }

                else if(vehYear < 1960 || vehYear > 2022)
                {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Warning");
                    alert.setContentText("Invaild 'vehicle's year of production' field input!");

                    alert.showAndWait();
                }
                
                // If everything is fine, add values to controller, print alert and show the data
                else
                {
                    controller.addData(actName, y, m, d, vehNumb, vehMod, vehYear, clientN, clientSn, clientNumb, clientAdr);

                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("SUCCESS");
                    alert.setContentText("Input has been saved!");

                    alert.showAndWait();  

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Adding2.fxml"));
                    root = loader.load();
        
                    Adding2Controller adding2Controller = loader.getController();
                    adding2Controller.display(actName, y, m, d, vehNumb, vehMod, vehYear, clientN, clientSn, clientNumb, clientAdr);
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    
                }

            }
            // If not numbers or empty
            catch(NumberFormatException e)
            {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("Fields such as: day, month, year, vehicle's production year, phone number"
                        + " must contain numbers only!\r\nFields cannot remain empty either");

                alert.showAndWait();

            }
//            catch(IOException e)
//            {
//                Alert alert = new Alert(AlertType.ERROR);
//                alert.setTitle("Error");
//                alert.setContentText("Error!");
//
//                alert.showAndWait(); 
//            }
        }
        // If incorrect input for String fields
        else
        {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setContentText("Fields such as: activity name, vehicle's registration number"
             + " vehicle's model, client's name, client's surname, client's address cannot contain illegal"
             + " characters such as '|, <, >...'!\r\nFields cannot remain empty either!");

            alert.showAndWait();
        }
    }
    
    // to be done
        public void finalize(ActionEvent event)
    {
              
    }
}
//    /**
//     * Method which returns name of the employee
//     * @return employee name
//     */
//    public String getEmployeeName()
//    {
//        return this.model.getEmployeeName();
//    }
//    

    
    


