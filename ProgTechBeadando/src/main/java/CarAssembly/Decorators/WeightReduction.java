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
public class WeightReduction extends Extra{
    private int amount;
	public WeightReduction(CarBase car, int amount) throws NegativeException {
            super(car);
            if(amount <= 0){
                throw new NegativeException("The amount of weight must be a positive number");
            }
            if ((car.getWeight() - amount)<=0) {
                throw new NegativeException("The amount of weight must remain a positive number");
            }
            this.amount = amount;
        }
        
	@Override
	public String printExtra() { 
		return "Weight: " + (super.getWeight()-amount);
	}

        @Override
        public int getWeight(){
            return (super.getWeight() - amount);
        }
        
        @Override
        public int getPrice(){
            return (int)(super.getPrice() + amount * 10);
        }
        
}
