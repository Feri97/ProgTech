/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Template;

import CarAssembly.CarBase;
import CarAssembly.Decorators.Warranty;
import CarAssembly.Logger;

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
        this.car = new Warranty(car, warranty);
    }
    protected abstract void thm();
    protected abstract void log();
    
}