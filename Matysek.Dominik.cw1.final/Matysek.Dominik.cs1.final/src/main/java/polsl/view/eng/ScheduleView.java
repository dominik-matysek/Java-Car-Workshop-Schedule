/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.view.eng;
import polsl.model.eng.Schedule;

/**
 * View class basing on MVC pattern. Used for displaying the data.
 * 
 * @author Dominik Matysek
 * @version 1.0
 */
public class ScheduleView {
    
    /**
     * Method displaying data of the scheduler.
     * @param sch Schedule object
     */
    public void showSchedule(Schedule sch) 
    {   
        
        System.out.println(sch.getEmployeeName() +"'s schedule: ");
        System.out.println("");
        
        // Printing planned activities
        
        for (int i = 0; i < sch.getActivities().size(); i++)
        {
            System.out.println("");
            System.out.println("Task: "+sch.getActivities().get(i).getActName());
            
            // Printing date connected with planned activities
            for(int j = 0; j < sch.getActivities().get(i).getDates().size(); j++)
            {
                System.out.print("Date: "+sch.getActivities().get(i).getDates().get(j).getDay() + "." 
                + sch.getActivities().get(i).getDates().get(j).getMonth() + "." + 
                sch.getActivities().get(i).getDates().get(j).getYear() + "\n");
                
                // Printing vehicles
                for(int k = 0; k < sch.getActivities().get(i).getDates().get(j).getVehicles().size();k++)
                {
                    // Printing clients
                    for(int l = 0; l < sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getOwners().size();l++)
                    {
                        System.out.print("Client: " + sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getOwners().get(l).getName()
                        + " " + sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getOwners().get(l).getSurname()
                        + " | +48 " + sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getOwners().get(l).getPhoneNumber()
                        + " | " + sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getOwners().get(l).getAddress()+ "\n");
                    }
                    
                    System.out.print("Vehicle: " + sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getModel() 
                    + " | " + sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getProductionYear() 
                    + " | " + sch.getActivities().get(i).getDates().get(j).getVehicles().get(k).getRegistrationNumber());
                }
            }
  
        }
        System.out.println("");
   }
    
}
