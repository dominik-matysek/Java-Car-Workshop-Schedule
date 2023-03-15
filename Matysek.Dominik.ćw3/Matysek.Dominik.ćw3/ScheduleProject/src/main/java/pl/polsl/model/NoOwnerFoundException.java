/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;

/**
 * Exception class for object of Vehicle class.
 * Thrown when there is no owner of the vehicle
 */
public class NoOwnerFoundException extends Exception {
    
    /**
     * Default class constructor
     */
    public NoOwnerFoundException()
    {
        
    }
    /**
     * Class constructor with 1 parameter.
     * @param message message to show
    */
    public NoOwnerFoundException(String message)
    {
        super(message);
    }
}
