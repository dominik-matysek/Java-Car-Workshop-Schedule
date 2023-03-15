/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.tests.eng;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.lab.model.Activity;
import pl.polsl.lab.model.Date;

/**
 * Class containing test methods for Activity class
 *
 * @author Dominik Matysek
 * @version 1.1
 */
public class ActivityTest {
    
    /**
     * Represents Activity model
     */
    private Activity activity;
    
    
    /**
     * Method that creates activity and date connected to it before each test.
     * Used for comparison needed for following tests
     */
    @BeforeEach
    public void setUp()
    {
        activity = new Activity("Odetkanie wydechu");
        Date date = new Date(21,11,2022);
        activity.addDate(date);
    }
    
    /**
     * Method that tests Activity function "addDate(Date date)"
     * Test checks if the sizes of Date arrays are the same. If so, all the data has been added correctly.
     * @param d day
     * @param m month
     * @param y year
     */
    @ParameterizedTest
    @CsvSource({"1,12,2022","21,11,2023","1,9,2023"})
    public void shouldReturnSameSizeOfDateArrayList(int d, int m, int y)
    {
        Activity activity2 = new Activity("Zakladanie boxa");
        Date date2 = new Date(d,m,y);
        
        activity2.addDate(date2);
        assertEquals(activity.getDates().size(), activity2.getDates().size());
    }
    
//    @Test
//    public void testAddDate()
//    {
//        
//    }
    
}
