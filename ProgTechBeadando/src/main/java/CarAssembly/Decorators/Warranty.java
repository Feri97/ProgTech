/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Decorators;

import CarAssembly.CarBase;
import CarAssembly.Extra;

/**
 *
 * @author Feri
 */
public class Warranty extends Extra{
        int warranty;
	public Warranty(CarBase car, int warranty) {
            super(car); 
            this.warranty = warranty;
        }
        
	@Override
	public String printExtra() { 
		return warranty + " years warranty";
	}

        @Override
        public int getPrice(){
            return (int)(super.getPrice() + warranty * 1000);
        }
}
