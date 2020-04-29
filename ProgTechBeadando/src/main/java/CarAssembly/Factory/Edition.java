/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Factory;

import CarAssembly.CarBase;

/**
 *
 * @author Feri
 */

public interface Edition {
    CarBase Create(CarBase car); 
}

