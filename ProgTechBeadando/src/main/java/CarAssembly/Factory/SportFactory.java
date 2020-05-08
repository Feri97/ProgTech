/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Factory;

import CarAssembly.CarBase;
import CarAssembly.Decorators.Hp;
import CarAssembly.Decorators.Rims;
import CarAssembly.Decorators.WeightReduction;
import CarAssembly.Exceptions.NegativeException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Feri
 */
public class SportFactory extends EditionFactory{
    @Override
    public Edition Classify() {
        return new SportsEdition(); 
    }
}

class SportsEdition implements Edition
{
    @Override
    public CarBase Create(CarBase car) { 
        try {
            return new WeightReduction(new Hp(new Rims(car, 18),100), 180);
        } catch (NegativeException ex) {
            Logger.getLogger(SportsEdition.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
