/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.tests.eng;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import polsl.model.eng.Schedule;
import polsl.model.eng.Activity;

/**
 * Class containing test methods for Schedule class
 *
 * @author Dominik Matysek
 * @version 1.1
 */
public class ScheduleTest {
    
    
    /**
     * Represents schedule model
     */
    private Schedule schedule;
    
    
    /**
     * Method that creates schedule and adds data to it before each test
     */
    @BeforeEach
    public void setUp() {
        schedule = new Schedule("Guest ");
        schedule.addData("Wymiana oleju", 2023, 10, 24, "KOL 4P12J", 
                "Ford Mondeo Mk3", 2001, "Maciek", "Dabek", 123456789, "ul. Akademicka 12" );
    }
    
    /**
     * Method that tests Schedule function "addData((String act_name, int y, int m, int d,
     * String reg_numb, String mod, int prod_year, String n, String sn, int p_numb, String adr))"
     * Test checks if the sizes of activity arrays are the same. If so, all the data has been added correctly.
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
    @ParameterizedTest
    @CsvSource({"Opony zimowe,2023,10,24,KOL 4P12J,Ford Mondeo Mk3,2001,Maciek,Dabek,123456789,ul. Akademicka 12", 
        "Rozrusznik,2022,11,23,AMD123,ToyotaCoo2,1987,Pan,Andrzej,987654321,Zalesie"})
    public void shouldReturnSameSizeOfActivityArraylist(String act_name, int y, int m, int d, String reg_numb,
            String mod, int prod_year, String n, String sn, int p_numb, String adr)
    {
        Schedule schedule2 = new Schedule("Guest");
        schedule2.addData(act_name, y, m, d, reg_numb, mod, prod_year, n, sn, p_numb, adr);
        assertEquals(schedule.getSize(), schedule2.getSize());
    }
    
    /**
     * Method that tests Schedule function "addActivity(Activity activity)"
     * Test checks if the sizes of activity arrays are the same. If so, all the data has been added correctly.
     * @param activ object of a Activity class 
     */
    @ParameterizedTest
    @CsvSource({"Mycie", "Naprawa zderzaka", "Przegląd"})
    public void shouldReturnSameSizeOfActivityArrayList(Activity activ)
    {
        Schedule schedule2 = new Schedule("Guest");
        schedule2.addActivity(activ);
        assertEquals(schedule.getActivities().size(), schedule2.getActivities().size());
    }
    
    
//    @Test
//    public void testAddActivity()
//    {
//        
//    }
//    
//    @Test
//    public void testAddData()
//    {
//        
//    }
//    
//    @Test
//    public void testIsEmpty()
//    {
//        
//    }
    
    
}
