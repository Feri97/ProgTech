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
abstract public class Extra extends Car{
	protected Car car;
	public Extra(Car car) { this.car = car; }
	@Override
	public String print() {
		return printExtra() + car.print();
	}
	public abstract String printExtra();
    
}
