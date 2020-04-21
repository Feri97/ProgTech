/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

/**
 *
 * @author Feri
 */
public class HeatedSeat extends Extra{
	public HeatedSeat(Car car) { super(car); }
	@Override
	public String printExtra() { 
		return "Ülésfűtés ";
	}
    
}
