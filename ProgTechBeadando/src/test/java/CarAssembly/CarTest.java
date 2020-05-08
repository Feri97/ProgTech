/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

import CarAssembly.Decorators.HeatedSeat;
import CarAssembly.Decorators.Hp;
import CarAssembly.Decorators.WeightReduction;
import CarAssembly.Exceptions.EmptyStringException;
import CarAssembly.Exceptions.NegativeException;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Feri
 */
public class CarTest {
    //Car car;
    
    
    @BeforeAll
    public void setUp() {
        //car = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
    }
    
    @AfterAll
    public void tearDown() {
        //car = null;
    }

    
    @Test
    public void testIstance() throws NegativeException, EmptyStringException {
        int i = -100;
        assertThrows(NegativeException.class, () -> { Car instance = new Car("BMW","M3 E36", "Manual", i, 240, 2500, 1500, 4, "Gasoline", i);});
        assertThrows(EmptyStringException.class, () -> { Car instance = new Car("","M3 E36", "", 3, 240, 2500, 1500, 4, "Gasoline", 10000);});
        
    }
    
    
    /**
     * Test of print method, of class Car.
     */
    @Test
    public void testPrint() throws NegativeException, EmptyStringException {
        System.out.println("print");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        String expResult = "BMW" +" "+ "M3 E36" + " VIN(" + instance.getVin() + ")";
        String result = instance.print();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVin method, of class Car.
     */
    @Test
    public void testGetVin() throws NegativeException, EmptyStringException {
        System.out.println("getVin");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        int expResultMin = 100000;
        int expResultMax = 999999;
        int result = instance.getVin();
        assertTrue(result >= expResultMin && result <= expResultMax);
    }

    /**
     * Test of getShift method, of class Car.
     */
    @Test
    public void testGetShift() throws NegativeException, EmptyStringException {
        System.out.println("getShift");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        String expResult = "Manual";
        String result = instance.getShift();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoors method, of class Car.
     */
    @Test
    public void testGetDoors() throws NegativeException, EmptyStringException {
        System.out.println("getDoors");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);;
        int expResult = 3;
        int result = instance.getDoors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHp method, of class Car.
     */
    @Test
    public void testGetHp() throws NegativeException, EmptyStringException {
        System.out.println("getHp");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        CarBase decInstance = new Hp(instance, 200);
        int expResult = instance.getHp()+200;
        int result = decInstance.getHp();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCc method, of class Car.
     */
    @Test
    public void testGetCc() throws NegativeException, EmptyStringException {
        System.out.println("getCc");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        CarBase decInstance = new Hp(instance, 200);
        int expResult = instance.getCc() + 200 * 10;
        int result = decInstance.getCc();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getWeight method, of class Car.
     */
    @Test
    public void testGetWeightNeg() throws NegativeException, EmptyStringException {
        System.out.println("getWeight");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
            
        assertThrows(NegativeException.class, () -> { CarBase decInstance = new WeightReduction(instance, -100000);});
        
    }
    
    /**
     * Test of getWeight method, of class Car.
     */
    @Test
    public void testGetWeight() throws NegativeException, EmptyStringException {
        System.out.println("getWeight");
        for (int i = 1; i < 100000; i+=153) {
            Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, i + 1500, 4, "Gasoline", 10000);
            CarBase decInstance = new WeightReduction(instance, i);
            int expResult = instance.getWeight() - i;
            int result = decInstance.getWeight();
            assertEquals(expResult, result);
        }
    }
    
    /**
     * Test of getSeats method, of class Car.
     */
    @Test
    public void testGetSeats() throws NegativeException, EmptyStringException {
        for (int i = 1; i < 100000; i+=132) {
            System.out.println("getSeats");
            Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, i, "Gasoline", 10000);
            int result = instance.getSeats();
            assertEquals(i, result);
        }
    }

    /**
     * Test of getFuel method, of class Car.
     */
    @Test
    public void testGetFuel() throws NegativeException, EmptyStringException {
        System.out.println("getFuel");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        String expResult = "Gasoline";
        String result = instance.getFuel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Car.
     */
    @Test
    public void testGetPrice() throws NegativeException, EmptyStringException {
        System.out.println("getPrice");
        Car instance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        CarBase decInstance = new HeatedSeat(instance);
        int expResult = instance.getPrice() + 500;
        int result = decInstance.getPrice();
        assertEquals(expResult, result);
    }
    
}
