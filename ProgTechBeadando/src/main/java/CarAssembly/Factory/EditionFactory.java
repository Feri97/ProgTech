/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Factory;

import CarAssembly.CarBase;
import CarAssembly.Decorators.Clime;
import CarAssembly.Decorators.Rims;
import CarAssembly.Decorators.Hp;
import CarAssembly.Decorators.HeatedSeat;
import CarAssembly.Decorators.WeightReduction;

/**
 *
 * @author Feri
 */
public abstract class EditionFactory
{
    public Edition CreateClassification(){
        // itt a gyártás előtt lehet ezt-azt csinálni, pl. logolni
        return Classify();
    }
 
    public abstract Edition Classify();
}
