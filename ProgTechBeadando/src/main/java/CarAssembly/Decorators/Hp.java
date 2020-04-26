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
public class Hp extends Extra{
    private int hp;
	public Hp(CarBase car, int hp) {
            super(car);
            this.hp = hp;
        }
        
	@Override
	public String printExtra() { 
		return " Extra HP: " + hp;
	}

        @Override
        public int getHp(){
            return super.getHp() + hp;
        }
        
        @Override
        public int getCc(){
            return super.getCc() + hp * 10;
        }
        @Override
        public int getPrice(){
            return (int)(super.getPrice() * 1.3);
        }
}