/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;
import java.util.ArrayList;

/**
 * Class that represents activity, storing data about name of activity
 * and related dates
 *
 * @author Dominik Matysek
 * @version 1.0
 */
public class Activity {

    /**
     * Represents the name of the activity
     */
    private String activityName;
    
    /**
     * ArrayList for storaging dates objects related to specific
     * activity
     */
    private ArrayList<Date> dates = new ArrayList<>();
    
    // Methods
    
    /**
     * Class constructor with 1 parameter.
     * @param act_name is the name of the activity
     */
    public Activity(String act_name){
        this.activityName = act_name;
    }
    
    /**
     * Default class constructor 
     */
    public Activity(){};
    
    /**
     * Method that adds Date object to dates ArrayList
     * @param date Date object
     */
    public void addDate(Date date){
        dates.add(date);
    }
    
    /**
     * Method that sets the name of the activity
     * @param act_name is the name of the activity
     */
    public void setActName(String act_name){
        this.activityName = act_name;
    }
    
     /**
     * Method that returns the name of the activity
     * @return name of the activity
     */
    public String getActName(){
        return this.activityName;
    }
    
    
    /**
     * Method that returns the ArrayList of the Date class objects
     * @return ArrayList of date objects
     */
    public ArrayList<Date> getDates(){
    return dates;
    }
    
}
