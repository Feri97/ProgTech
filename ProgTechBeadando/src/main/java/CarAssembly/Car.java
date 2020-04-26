/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

import java.util.Random;

/**
 *
 * @author Feri
 */
public class Car extends CarBase {
    
    private String Brand;
    private String model;
    private int price;
    
    Random rnd = new Random();
    
    
    public Car(String Brand, String model, String shift, int doors, int hp, int cc, int weight, int seats, String fuel, int price) {
        this.Brand = Brand;
        this.model = model;
        this.shift = shift;
        this.doors = doors;
        this.hp = hp;
        this.cc = cc;
        rnd.nextInt(99999);
        this.vin = rnd.hashCode();
        this.weight = weight;
        this.seats = seats;
        this.fuel = fuel;
        this.price = price;
    }
    
    private int vin;
    
    private String shift;
    private int doors;
    private int hp;
    private int cc;
    private int weight;
    private int seats;
    private String fuel;
    
    
    @Override
    public String print() {
        return Brand +" "+ model + " VIN(" + vin + ")"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVin() {
        return vin;
    }
    
    @Override
    public String getShift() {
        return shift;
    }

    @Override
    public int getDoors() {
        return doors;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getCc() {
        return cc;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public String getFuel() {
        return fuel;
    }
    
    @Override
    public int getPrice() {
        return price;
    }

    
}
