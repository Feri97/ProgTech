/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Template;

import CarAssembly.Car;
import CarAssembly.CarBase;
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
public class PartialPayTest {
    
    public PartialPayTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of thm method, of class PartialPay.
     */
    @Test
    public void testThm() throws NegativeException, EmptyStringException {
        System.out.println("thm");
        
        Car carInstance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        PartialPay payInstance = new PartialPay(carInstance, 12, 3, "asd", "qwe", 3000, "street 3", "asd@gmail.com");
        payInstance.thm();
        assertNotEquals(payInstance.price, carInstance.getPrice());
    }

    /**
     * Test of log method, of class PartialPay.
     */
    @Test
    public void testLog() throws NegativeException, EmptyStringException {
        System.out.println("log");
        Car carInstance = new Car("BMW","M3 E36", "Manual", 3, 240, 2500, 1500, 4, "Gasoline", 10000);
        PartialPay payInstance = new PartialPay(carInstance, 12, 3, "asd", "qwe", 3000, "street 3", "asd@gmail.com");
        
        assertDoesNotThrow(() -> {payInstance.log();});
    }
    
}
