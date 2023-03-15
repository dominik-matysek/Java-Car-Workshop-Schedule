/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.eng;
import java.util.ArrayList;

/**
 * Class that represents vehicles, storing data about vehicles
 * and its owners
 *
 * @author Dominik Matysek
 * @version 1.0
 */
public class Vehicle {

    /**
     * Represents vehicle registration number
     */
    String registration_number;
    /**
     * Represents Vehicle model
     */
    private String model; 
    /**
     * Represents year of vehicle production
     */
    int production_year;
    
    /**
     * Represents the object of Client class connected with specific vehicle
     */
   private ArrayList<Owner> owners = new ArrayList<>(2);
    
    //Methods
    
    /**
     * Class constructor with 3 parameters
     * @param reg_numb registration number
     * @param mod vehicle model
     * @param prod_year year of production
     */
    public Vehicle(String reg_numb, String mod, int prod_year)
    {
        this.registration_number = reg_numb;
        this.model = mod;
        this.production_year = prod_year;
    }
    
    /**
     * Default constructor
     */
    public Vehicle(){};
    
    /**
     * Method that adds Owner object to ArrayList of the owners
     * @param own owner
     */
    public void addOwner(Owner own)
    {
        owners.add(own);
    }
    
    /**
     * Method that sets the registration number of a vehicle
     * @param reg_num registration number
     */
    public void setRegistrationNumber(String reg_num)
    {
        this.registration_number = reg_num;
    }
    
    /**
     * Method that sets vehicle model
     * @param mod model
     */
    public void setModel(String mod)
    {
        this.model = mod;
    }
    
    /**
     * Method that sets production year of a vehicle
     * @param prod_y production year
     */
    public void setProductionYear(int prod_y)
    {
        this.production_year = prod_y;
    }
    
    /**
     * Method that returns registration number
     * @return registration number
     */
    public String getRegistrationNumber()
    {
        return this.registration_number;
    }
    
    /**
     * Method that returns production year
     * @return production year
     */
    public int getProductionYear()
    {
        return this.production_year;
    }
    
    /**
     * Method that returns vehicle model
     * @return vehicle model
     */
    public String getModel()
    {
        return this.model;
    }
    
    /**
     * Method that returns the ArrayList of the Owner class objects
     * @return ArrayList of Owner objects
     */
    public ArrayList<Owner> getOwners(){
    return owners;
    }
    
}