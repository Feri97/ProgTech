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
        return new WeightReduction(new Hp(new Rims(car, 18),100), 180);
    }
}
