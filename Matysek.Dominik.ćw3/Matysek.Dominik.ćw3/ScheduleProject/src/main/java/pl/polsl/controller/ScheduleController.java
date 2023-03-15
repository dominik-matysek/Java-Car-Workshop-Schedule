/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.controller;

import pl.polsl.annotations.UpdateAnnotation;
import pl.polsl.model.Schedule;

/**
 * Controller class which keeps control on inputs provided by the user 
 * aswell as the data flow in program in general.
 * @author Dominik Matysek
 * @version 1.0
 */
@UpdateAnnotation
public class ScheduleController {
    
    /**
     * Represents Schedule object
     */
    private Schedule model;
    
    /**
     * Class constructor with 1 parameter
     * @param s Schedule object
     */
    public ScheduleController (Schedule s)
    {
        this.model = s;
    }
    
//    /**
//     * Method which returns name of the employee
//     * @return employee name
//     */
//    public String getEmployeeName()
//    {
//        return this.model.getEmployeeName();
//    }
    
    /**
     * Method updating data
     * @param act_name name of activity
     * @param y year
     * @param m month
     * @param d day
     * @param reg_numb vehicle registration number
     * @param mod vehicle model
     * @param prod_year year of production
     * @param n client's name
     * @param sn client's surname
     * @param p_numb client's phone number
     * @param adr client's address
     */
    public void addData(String act_name, int y, int m, int d, String reg_numb, String mod, int prod_year, String n, String sn, int p_numb, String adr)
    {
        this.model.addData(act_name, y, m, d, reg_numb, mod, prod_year, n, sn, p_numb, adr);
    }
    
    /**
     * Method checking data input from the user
     * @param act_name name of activity
     * @param y year
     * @param m month
     * @param d day
     * @param reg_numb vehicle registration number
     * @param mod vehicle model
     * @param prod_year year of production
     * @param n client's name
     * @param sn client's surname
     * @param p_numb client's phone number
     * @param adr client's address
     * @return true if input is correct, false if it's invalid
     */
    public boolean checkInput(String act_name, String y, String m, String d, String reg_numb, String mod, String prod_year, String n, String sn, String p_numb, String adr)
    {
        if(act_name.matches("^[a-zA-Z ]+$") && mod.matches("^[a-zA-Z0-9 ]+$") && n.matches("[a-zA-Z ]+") && sn.matches("[a-zA-Z ]+") && adr.matches("^[a-zA-Z0-9. ]+$"))
        {
            if(y.matches("(2022|2023)")&& m.matches("\\b([1-9]|1[0-2])\\b")&& d.matches("\\b([1-9]|[12][0-9]|3[01])\\b"))
            {
                if(reg_numb.matches("[a-zA-Z0-9 ]+"))
                {
                    if(prod_year.matches("\\b(195[0-9]|19[6-9][0-9]|20[01][0-9]|202[01])\\b"))
                    {
                        if(p_numb.matches("[0-9]+"))
                        {
                            return true;
                        }
                        else
                        {
                            System.out.println("Phone number is invalid!");
                            return false;
                        }
                    }
                    else
                    {
                        System.out.println("Production date is invalid!");
                        return false;
                    }
                }
                else
                {
                    System.out.println("Vehicle registration number is invalid!");
                    return false;
                }
            }
            else
            {
                System.out.println("Date is invalid!");
                return false;
            }
        }
        else
        {
            System.out.println("Values such as: activity name, vehicle model, client name, client surname, client address must be string values!");
            return false;
        }
    }

}

