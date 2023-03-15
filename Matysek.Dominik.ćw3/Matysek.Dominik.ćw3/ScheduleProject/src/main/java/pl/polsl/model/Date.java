/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;
import java.util.ArrayList;

/**
 * Class that represents dates, storing data about the date
 * and specific vehicles that will be repaired this day
 * @author Dominik Matysek
 * @version 1.0
 */

public class Date {

    /**
     * Represents day
     */
    private int day;
    /**
     * Represents month
     */
    private int month;
    /**
     * Represents year
     */
    private int year;
    
    /** 
     * ArrayList storing vehicles that will be repaired
     * on a specific day
     */
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    
    // Methods
    
    /**
     * Class constructor with 3 parameters.
     * @param d day
     * @param m month
     * @param y year
     * 
     */
   public Date(int d, int m, int y){
       this.day = d;
       this.month = m;
       this.year = y;
   }
   
   /**
     * Default constructor
     */
    public Date(){};
    
    /**
     * Method that adds Vehicle object to vehicles ArrayList
     * @param vehicle Vehicle object
     */
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    
    /**
     * Methods returning day
     * @return day
     */
    
    public int getDay()
    {
        return this.day;
    }
    
    /**
     * Methods returning month
     * @return month
     */
    public int getMonth()
    {
        return this.month;
    }
    
    /**
     * Methods returning year
     * @return year
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * Methods setting the day
     * @param day day
     */
    public void setDay(int day)
    {
        this.day = day;
    }
    
    /**
     * Methods setting the month
     * @param month month
     */
    public void setMonth(int month)
    {
        this.month = month;
    }
    
    /**
     * Methods setting the year
     * @param year year
     */
    public void setYear(int year)
    {
        this.year = year;
    }
    
    /**
     * Method that returns the ArrayList of the Vehicle class objects
     * @return ArrayList of vehicle objects
     */
    public ArrayList<Vehicle> getVehicles(){
    return vehicles;
    }
}
