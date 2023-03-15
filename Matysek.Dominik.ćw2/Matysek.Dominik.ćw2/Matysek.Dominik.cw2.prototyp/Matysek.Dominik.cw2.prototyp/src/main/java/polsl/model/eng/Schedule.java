/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.eng;
import java.util.ArrayList;

/**
 * 
 * Class for Schedule representation, storing activities planned
 * 
 * @author Dominik Matysek
 * @version 1.0
 */
public class Schedule {
    
    /**
     * Represents name of employee who follows specific schedule
     */
    private String employeeName;

    /**
    * ArrayList for storaging Activity objects
    */
    private ArrayList<Activity> activities = new ArrayList<>();

    /**
     * Class constructor with 1 parameter
     * @param emp_name name of an employee who follows this specific task schedule
     */
    public Schedule(String emp_name)
    {
        this.employeeName = emp_name;
    }
    
    /**
    * Default class constructor
    */
    public Schedule(){};
    
    // Methods
    
    /**
     * Method for setting an employee name
     * @param empl_name name of an employee
     */
    public void setEmployeeName(String empl_name)
    {
        this.employeeName = empl_name;
    }
    
    /**
     * Method that returns the employee name
     * @return employee name
     */
    public String getEmployeeName()
    {
        return this.employeeName;
    }
    
    /**
     * Method for checking if an activity ArrayList is empty
     * @return true if array is empty else false
     */
    public boolean isEmpty(){
        return this.getActivities().isEmpty();
    }
    
    /**
     * Method that returns size of an array
     * @return size of an array as 
     */
    public int getSize(){
        return this.activities.size();
    }
    
    /**
     * Method that adds Activity object to activities ArrayList
     * @param activity object of a Activity class 
     */
    public void addActivity(Activity activity){
            activities.add(activity);
    }
    
    /**
     * Method that return the ArrayList of Activity class objects
     * @return ArrayList of Activity objects
     */
    
    public ArrayList<Activity> getActivities(){
        return activities;
    }
    
    /**
     * Method that adds data to Schedule object
     * @param act_name name of the activity
     * @param d day of the planned activity
     * @param m month of the planned activity
     * @param y year of the planned activity
     * @param reg_numb registration number for a vehicle
     * @param mod model of a vehicle
     * @param prod_year production year of a vehicle
     * @param n name of the client (vehicle owner)
     * @param sn surname of the client
     * @param p_numb phone number of the client
     * @param adr adress of the client
     */
    public void addData(String act_name, int y, int m, int d, String reg_numb, String mod, int prod_year, String n, String sn, int p_numb, String adr)
    {
        Activity activity = new Activity(act_name);
        Date date = new Date(d, m, y);
        Vehicle vehicle = new Vehicle(reg_numb, mod, prod_year);
        Owner owner = new Owner(n, sn, p_numb, adr);
        
        owner.setName(n);
        owner.setSurname(sn);
        owner.setPhoneNumber(p_numb);
        owner.setAddress(adr);
        vehicle.addOwner(owner);
        date.addVehicle(vehicle);
        activity.addDate(date);
        this.addActivity(activity);
  
    }
    
}
