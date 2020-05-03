/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Template;

import CarAssembly.CarBase;
import CarAssembly.Logger;

/**
 *
 * @author Feri
 */
public class PartialPay extends Order{
    int parts;

    public PartialPay(CarBase car, int parts, int warranty, String firstname, String lastname, int postalCode, String address, String email) {
        this.car = car;
        this.price = car.getPrice();
        this.warranty = warranty;
        this.parts = parts;
        this.firstname = firstname;
        this.lastname = lastname;
        this.postalCode = postalCode;
        this.address = address;
        this.email = email;
    }
    
    @Override
    protected void thm()
    {
        price = (int)(price * 1.08 / parts);
    }
    
    @Override
    protected void log()
    {
        log.logOrderPartialPay(car.print(), price, parts, firstname, lastname, email);
    }

}
