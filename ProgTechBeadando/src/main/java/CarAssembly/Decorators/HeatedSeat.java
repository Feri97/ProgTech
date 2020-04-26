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
public class HeatedSeat extends Extra{
    
	public HeatedSeat(CarBase car) {
            super(car); 
        }
        
	@Override
	public String printExtra() { 
		return " Heated Seat";
	}

        @Override
        public int getPrice(){
            return (int)(super.getPrice() + 500);
        }
    
}
