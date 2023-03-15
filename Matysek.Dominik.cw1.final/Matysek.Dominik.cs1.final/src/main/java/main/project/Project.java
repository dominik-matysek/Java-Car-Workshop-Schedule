/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.project;
import java.util.Scanner;
import polsl.model.eng.Schedule;
import polsl.controller.eng.ScheduleController;
import polsl.view.eng.ScheduleView;


/**
 *Main class of the program, responsible for the interface
 * 
 * @author Dominik Matysek
 * @version 1.0
 */
public class Project 
{
    /**
     * Main metod of the application
     * @param args 
     */
    public static void main(String[] args) 
    {
        /**
         * Creating schedule view
         */
        ScheduleView view = new ScheduleView();
        /**
         * Creating schedule model
         */
        Schedule model = new Schedule("Maciej Skowron");
        /**
         * Creating controller
         */
        ScheduleController controller = new ScheduleController(model, view);
        boolean x = true;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Scheduler of " + controller.getEmployeeName());
        
        while(x)
        {
            System.out.println("");
            System.out.println("Choose an option: ");
            System.out.println("1.Add new activity to scheduler"); 
            System.out.println("2.Show scheduler");
            System.out.println("3.Exit ");
            int number;
            number = Integer.parseInt(keyboard.nextLine());
            
            /**
             * Adding new activity record to scheduler 
             */
                if(number == 1)
                {
                    System.out.println("");
                    String activity_name;
                    String year;
                    String month;
                    String day;
                    String registration_number;
                    String vehicle_model;
                    String production_year;
                    String client_name;
                    String client_surname;
                    String client_phone;
                    String client_address;
                    
                    System.out.println("Enter the name of an activity: ");
                    activity_name = keyboard.nextLine();
                    
                    System.out.println("Enter the year: ");
                    year = keyboard.nextLine();
                    
                    System.out.println("Enter the month: ");
                    month = keyboard.nextLine();
                    
                    System.out.println("Enter the day: ");
                    day = keyboard.nextLine();
                    
                    System.out.println("Enter vehicle's registration number: ");
                    registration_number = keyboard.nextLine();
                    
                    System.out.println("Enter model of the vehicle: ");
                    vehicle_model = keyboard.nextLine();
                    
                    System.out.println("Enter the year of vehicle's production: ");
                    production_year = keyboard.nextLine();
                    
                    System.out.println("Enter the name of the client: ");
                    client_name = keyboard.nextLine();
                    
                    System.out.println("Enter the surname of the client: ");
                    client_surname = keyboard.nextLine();
                    
                    System.out.println("Enter the phone number of the client: ");
                    client_phone = keyboard.nextLine();
                    
                    System.out.println("Enter the address of the client: ");
                    client_address = keyboard.nextLine();
                    
                    System.out.println("");
                    
                    if(controller.checkInput(activity_name, year, month, day, registration_number, vehicle_model, production_year, client_name,
                    client_surname, client_phone, client_address) == true)
                    {
                        controller.addData(activity_name, Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day),
                        registration_number, vehicle_model,Integer.parseInt(production_year), client_name,
                        client_surname, Integer.parseInt(client_phone), client_address);
                        System.out.println("Record has been added to the scheduler!");
                    }
                    else
                    {
                        System.out.println("Invalid input. Please try again.");
                        System.out.println("");
                    }
                }
                /**
                 * Displaying scheduler
                 */
                else if(number == 2)
                {
                    System.out.println("");
                    controller.updateScheduleView(model);
                }
                /**
                 * program exit
                 */
                else if(number == 3)
                {
                    System.out.println("Thank you for your cooperation. Have a great day!");
                    x = false;
                }
                else
                {
                    System.out.println("You have chosen an invalid number. Try again.");
                    System.out.println(" ");
                }
        }
    
    }
}

/**
 * Example of working input: Wymiana oleju 2022 11 15 ABCD1234 Ford Mondeo 2004 Maciej Maziarz 123456789 Akademicka
 */
