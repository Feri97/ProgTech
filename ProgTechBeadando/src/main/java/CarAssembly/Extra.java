/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

abstract public class Extra extends CarBase{
	protected CarBase car;
	public Extra(CarBase c) { 
            this.car = c; 
        }
        
        @Override
        public int getVin() {
            return car.getVin();
        }
    
        @Override
        public String getShift() {
            return car.getShift();
        }

        @Override
        public int getDoors() {
            return car.getDoors();
        }

        @Override
        public int getHp() {
            return car.getHp();
        }

        @Override
        public int getCc() {
            return car.getCc();
        }

        @Override
        public int getWeight() {
            return car.getWeight();
        }

        @Override
        public int getSeats() {
            return car.getSeats();
        }   

        @Override
        public String getFuel() {
            return car.getFuel();
        }
        @Override
        public int getPrice() {
            return car.getPrice();
        }
        
	public abstract String printExtra();
	
        @Override
	public String print() {
		return car.print() + printExtra();
	}
    
}
