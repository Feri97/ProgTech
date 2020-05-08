/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Factory;

import CarAssembly.CarBase;
import CarAssembly.Decorators.Clime;
import CarAssembly.Decorators.HeatedSeat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Feri
 */
public class FamilyFactory extends EditionFactory{
    @Override
    public Edition Classify() {
        return new FamilyEdition(); 
    }
}

class FamilyEdition implements Edition
{
    @Override
    public CarBase Create(CarBase car) { 
        try {
            return new Clime(new HeatedSeat(car));
        } catch (Exception e) {
            Logger.getLogger(FamilyEdition.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}