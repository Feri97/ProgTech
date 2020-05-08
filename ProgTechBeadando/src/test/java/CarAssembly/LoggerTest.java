/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

import CarAssembly.Exceptions.EmptyStringException;
import CarAssembly.Exceptions.NegativeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Feri
 */
public class LoggerTest {
    
    public LoggerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class Logger.
     */
    @Test
    public void testGetInstance() {
        Logger expResult = Logger.getInstance();
        System.out.println("Mem. cím2: "+expResult);
        Logger result = Logger.getInstance();
        System.out.println("Mem. cím1: "+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of logOrder method, of class Logger.
     */
    @Test
    public void testLogOrder() throws NegativeException, EmptyStringException {
        
        System.out.println("logOrder");
        Car carInstance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        String car = carInstance.print();
        int price = carInstance.getPrice();
        String firstname = "Pal";
        String lastname = "Pelda";
        String email = "p.pali@gmail.com";
        Logger instance = Logger.getInstance();
        assertDoesNotThrow( () -> {instance.logOrder(car, price, firstname, lastname, email);});
    }

    /**
     * Test of logOrderPartialPay method, of class Logger.
     */
    @Test
    public void testLogOrderPartialPay() throws NegativeException, EmptyStringException {
        System.out.println("logOrderPartialPay");
        Car carInstance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        String car = carInstance.print();
        int price = carInstance.getPrice();
        int parts = 12;
        String firstname = "Pal";
        String lastname = "Pelda";
        String email = "p.pali@gmail.com";
        Logger instance = Logger.getInstance();
        assertDoesNotThrow( () -> {instance.logOrderPartialPay(car, price, parts, firstname, lastname, email);});
    }

    /**
     * Test of logFailure method, of class Logger.
     */
    @Test
    public void testLogFailure() {
        try {
            System.out.println("logFailure");
            Car carInstance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
            Logger instance = null;
            instance.logOrder(carInstance.print(), carInstance.getPrice(), "", "", "");
        } catch (Exception e) {
            Logger instance = Logger.getInstance();
            instance.logFailure("" , "<"+e.toString()+">");
        }
        
        
    }
    
}
