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

/**
 *
 * @author Feri
 */
public class SportPlusFactory extends EditionFactory{
    @Override
    public Edition Classify() {
        return new SportsPlusEdition(); 
    }
}

class SportsPlusEdition implements Edition
{
    @Override
    public CarBase Create(CarBase car) { 
        return new WeightReduction(new Hp(new Rims(car, 18), 200), 200);
    }
}
