/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Decorators;

import CarAssembly.CarBase;
import CarAssembly.Exceptions.NegativeException;
import CarAssembly.Extra;

/**
 *
 * @author Feri
 */
public class Rims extends Extra{
    private int size;
	public Rims(CarBase car, int size) throws NegativeException {
            super(car);
            if(size <= 0){
                throw new NegativeException("Rim size must be a positive number");
            }
            this.size = size;
        }
        
	@Override
	public String printExtra() { 
		return "Rims size: " + size;
	}

        @Override
        public int getPrice(){
            return (int)(super.getPrice() + size * 100);
        }
    
}
