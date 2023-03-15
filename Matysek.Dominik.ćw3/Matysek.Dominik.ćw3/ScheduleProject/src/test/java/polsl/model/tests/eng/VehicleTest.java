/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polsl.model.tests.eng;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.model.Vehicle;
import pl.polsl.model.Owner;

/**
 * Class containing test methods for Vehicle class
 *
 * @author Dominik Matysek
 * @version 1.1
 */
public class VehicleTest {
    
    /**
     * Represents Vehicle model
     */
    private Vehicle vehicle;
    
    /**
     * Method that creates vehicle and owners connected to it before each test.
     * Used for comparison needed for following tests
     */
    @BeforeEach
    public void setUp()
    {
        vehicle = new Vehicle("KOL 4P12J","Ford Mondeo Mk3",2003);
        Owner owner = new Owner("Marek", "Maziarz", 123456789, "ul. Stawowa 11");
        Owner owner2 = new Owner("Marta", "Skarab", 123456789, "Osiedle Młodych");
        
        vehicle.addOwner(owner);
        vehicle.addOwner(owner2);
    }
    
    /**
     * Method that tests Vehicle function "addOwner(Owner owner)"
     * Test checks if the sizes of Owner arrays are the same. If so, all the data has been added correctly.
     * @param n name
     * @param sn surname 
     * @param p_numb phone number
     * @param adr owner adress
     */
    @ParameterizedTest
    @CsvSource({"Marek, Sieraczek, 123456987, Aleje Ujazdowskie","Kacper, Wiewior, 546377122, Bagno 25"})
    public void shouldReturnSameSizeOfOwnerArrayList(String n, String sn, int p_numb, String adr)
    {
        Vehicle vehicle2 = new Vehicle("KRK OL233","Toyota Corolla",1996);
        Owner owner = new Owner("Sebastian", "Piton", 124456719, "ul. Stalowa 9");
        Owner owner2 = new Owner("Ohmar", "Szepet", 950950123, "Rynek 4");
        
        vehicle2.addOwner(owner);
        vehicle2.addOwner(owner2);
        assertEquals(vehicle.getOwners().size(), vehicle2.getOwners().size());
    }
    
//    @Test
//    public void testAddOwner()
//    {
//        
//    }
    
}
