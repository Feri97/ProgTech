/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

import CarAssembly.Decorators.Clime;
import CarAssembly.Decorators.Rims;
import CarAssembly.Decorators.Hp;
import CarAssembly.Decorators.HeatedSeat;
import CarAssembly.Decorators.WeightReduction;

/**
 *
 * @author Feri
 */
abstract class EditionFactory
{
    public Edition CreateClassification(){
        // itt a gyártás előtt lehet ezt-azt csinálni, pl. logolni
        return Classify();
    }
 
    public abstract Edition Classify();
}

class SportFactory extends EditionFactory{
    @Override
    public Edition Classify() {
        return new SportsEdition(); 
    }
}

class SportPlusFactory extends EditionFactory{
    @Override
    public Edition Classify() {
        return new SportsPlusEdition(); 
    }
}

class FamilyFactory extends EditionFactory
{
    @Override
    public Edition Classify() {
        return new FamilyEdition();
    }
}


interface Edition {
    CarBase Create(CarBase car); 
}


class SportsEdition implements Edition
{
    @Override
    public CarBase Create(CarBase car) { 
        return new WeightReduction(new Hp(new Rims(car, 18),100), 180);
    }
}

class SportsPlusEdition implements Edition
{
    @Override
    public CarBase Create(CarBase car) { 
        return new WeightReduction(new Hp(new Rims(car, 18), 200), 200);
    }
}

class FamilyEdition implements Edition
{
    @Override
    public CarBase Create(CarBase car) { 
        return new Clime(new HeatedSeat(car));
    }
}

