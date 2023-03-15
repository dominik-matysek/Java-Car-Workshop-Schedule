/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.tests.eng;
import static org.junit.jupiter.api.Assertions.assertEquals;
import polsl.model.eng.Date;
import polsl.model.eng.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


/**
 * Class containing test methods for Date class
 *
 * @author Dominik Matysek
 * @version 1.1
 */
public class DateTest {
    
    /**
     * Represents Date model
     */
    private Date date;
    
    /**
     * Method that creates date and vehicle connected to it before each test.
     * Used for comparison needed for following tests
     */
    @BeforeEach
    public void setUp()
    {
        date = new Date(2,3,2022);
        Vehicle vehicle = new Vehicle("KOL 4P12J","Ford Mondeo Mk3",2003);
        date.addVehicle(vehicle);
    }
    
    /**
     * Method that tests Date function "addVehicle(Vehicle vehicle)"
     * Test checks if the sizes of Vehicle arrays are the same. If so, all the data has been added correctly.
     * @param reg_numb registration number
     * @param mod vehicle model
     * @param prod_year year of production
     */
    @ParameterizedTest
    @CsvSource({"KOL 123,Wrum wrum, 1995","ABCD1234,Texas,1980"})
    public void shouldReturnSameSizeOfVehicleArrayList(String reg_numb, String mod, int prod_year)
    {
        Date date2 = new Date(1,2,2023);
        Vehicle vehicle2 = new Vehicle(reg_numb, mod, prod_year);
        
        date2.addVehicle(vehicle2);
        assertEquals(date.getVehicles().size(), date2.getVehicles().size());
    }
    
//    @Test
//    public void testAddVehicle()
//    {
//        
//    }
    
}
