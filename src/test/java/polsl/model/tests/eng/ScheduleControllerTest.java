/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.tests.eng;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.lab.model.Schedule;
import pl.polsl.lab.view.ScheduleView;
import pl.polsl.lab.controller.ScheduleController;

/**
 * Class containing test methods for ScheduleController class
 *
 * @author Dominik Matysek
 * @version 1.1
 */
public class ScheduleControllerTest {
    
    /**
     * Represents schedule controller
     */
    private ScheduleController controller;
    
    /**
     * Represents schedule model
     */
    private Schedule model;
    
    /**
     * Represents schedule view
     */
    private ScheduleView view;
    
    /**
     * Method that creates schedule controller before each test
     */
    @BeforeEach
    public void setUp()
    {
        controller = new ScheduleController(model, view);
    }
    
    /**
     * Method that tests ScheduleController function "checkInput(String act_name, String y, String m, 
     * String d, String reg_numb, String mod, String prod_year, String n, String sn, String p_numb, String adr)"
     * Test checks if the a function tested returns true if parameters are correct
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
    @ParameterizedTest
    @CsvSource({"Opony zimowe,2023,10,24,KOL 4P12J,Ford Mondeo Mk3,2001,Maciek,Dabek,123456789,ul. Akademicka 12",
        "Rozrusznik,2022,11,23,AMD123,ToyotaCoo2,1987,Pan,Andrzej,987654321,Zalesie"})
    public void shouldReturnTrueIfInputIsCorrect(String act_name, String y, String m, 
        String d, String reg_numb, String mod, String prod_year, String n, String sn, String p_numb, String adr)
    {
       assertTrue(controller.checkInput(act_name, y, m, d, reg_numb, mod, prod_year, n, sn, p_numb, adr));
    }
    
    /**
     * Method that tests ScheduleController function "checkInput(String act_name, String y, String m, 
     * String d, String reg_numb, String mod, String prod_year, String n, String sn, String p_numb, String adr)"
     * Test checks if the a function tested returns false if parameters are incorrect
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
    @ParameterizedTest
    @CsvSource({"243,2001,11,23,AMD123,7997,1987,Pan,Andrzej,abcd,Zalesie",
        "Rozrusznik,2022,11,23,..,ToyotaCoo2,1987,Pan,Andrzej,987654321,Zalesie"})
    public void shouldReturnFalseIfInputIsIncorrect(String act_name, String y, String m, 
        String d, String reg_numb, String mod, String prod_year, String n, String sn, String p_numb, String adr)
    {
       assertFalse(controller.checkInput(act_name, y, m, d, reg_numb, mod, prod_year, n, sn, p_numb, adr));
    }
}
