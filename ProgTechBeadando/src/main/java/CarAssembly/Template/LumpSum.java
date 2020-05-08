/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Template;

import CarAssembly.CarBase;
import java.io.IOException;

/**
 *
 * @author Feri
 */
public class LumpSum extends Order{
    
    public LumpSum(CarBase car, int warranty, String firstname, String lastname, int postalCode, String address, String email) {
        this.car = car;
        this.price = car.getPrice();
        this.warranty = warranty;
        this.firstname = firstname;
        this.lastname = lastname;
        this.postalCode = postalCode;
        this.address = address;
        this.email = email;
    }
    @Override
    protected void thm() {
        price = price * 1;
    }

    @Override
    protected void log(){
        try {
            log.logOrder(car.print(), price, firstname, lastname, email);
        } catch (Exception e) {
            log.logFailure(car.print() + price + firstname + lastname + email, e.getMessage());
        }
    }

    
}
