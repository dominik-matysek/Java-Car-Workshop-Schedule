/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.eng;

/**
 * Class that represents the owner (client) of vehicle, 
 * storing his name, surname, phone number and adress
 *
 * @author Dominik Matysek
 * @version 1.0
 */
public class Owner {

    /**
     * Represent name of the owner
     */
    private String name;
    /**
     * Represent surname of the owner
     */
    private String surname;
    /**
     * Represent phone number of the owner
     */
    int phone_number;
    /**
     * Represent address of the owner
     */
    private String address;
    
    /**
     * Class constructor with 4 parameters
     * @param n name
     * @param sn surname 
     * @param p_numb phone number
     * @param adr owner adress
     */
    public Owner(String n, String sn, int p_numb, String adr)
    {
        this.address = adr;
        this.name = n;
        this.surname = sn;
        this.phone_number = p_numb;
    }
    
    /**
     * Default constructor
     */
    public Owner(){};
    
    /**
     * Method that returns owner name
     * @return name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Method that returns owner surname
     * @return surname
     */
    public String getSurname()
    {
        return this.surname;
    }
    
    /**
     * Method that returns owner adress
     * @return adress
     */
    public String getAddress()
    {
        return this.address;
    }
    
    /**
     * Method that returns owner phone number
     * @return phone number
     */
    public int getPhoneNumber()
    {
        return this.phone_number;
    }
    
    /**
     * Method that sets name of vehicle owner
     * @param n name
     */
    public void setName(String n)
    {
        this.name = n;
    }
    
    /**
     * Method that sets surname of vehicle owner
     * @param sn surname
     */
    public void setSurname(String sn)
    {
        this.surname = sn;
    }
    
    /**
     * Method that sets adress of owner
     * @param adr adress
     */
    public void setAddress(String adr)
    {
        this.address = adr;
    }
    
    /**
     * Method that sets phone number of owner
     * @param phone_numb phone number
     */
    public void setPhoneNumber(int phone_numb)
    {
        this.phone_number = phone_numb;
    }
    
}
