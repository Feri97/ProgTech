/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Template;

import CarAssembly.CarBase;
import CarAssembly.Decorators.Warranty;
import CarAssembly.Exceptions.NegativeException;
import CarAssembly.Logger;
import java.util.logging.Level;

/**
 *
 * @author Feri
 */
public abstract class Order {
    CarBase car;
    int warranty;
    Logger log = Logger.getInstance();
    String firstname; 
    String lastname; 
    int postalCode;
    String address;
    String email;
    int price;
    public void MakeOrder()
    {
        warranty();
        thm();
        log();
    }
    private void warranty()
    {
        try {
            this.car = new Warranty(car, warranty);
        } catch (NegativeException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected abstract void thm();
    protected abstract void log();
    
}