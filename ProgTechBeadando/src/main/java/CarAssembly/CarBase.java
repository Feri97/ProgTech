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
abstract public class CarBase {
    private String Brand;
    private String model;
    private int vin;
    
    private String shift;
    private int doors;
    private int hp;
    private int cc;
    private int weight;
    private int seats;
    private String fuel;
    private int price;
    
    public abstract int getVin();
    public abstract String getShift();
    public abstract int getDoors();
    public abstract int getHp();
    public abstract int getCc();
    public abstract int getWeight();
    public abstract int getSeats();
    public abstract String getFuel();
    public abstract int getPrice();
    
    public abstract String print();
}
