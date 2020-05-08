/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

import CarAssembly.Exceptions.EmptyStringException;
import CarAssembly.Exceptions.NegativeException;
import java.util.Random;

/**
 *
 * @author Feri
 */
public class Car extends CarBase {
    
    private String brand;
    private String model;
    private int price;
    
    Random rnd = new Random();
    int low = 100000;
    int high = 999999;
    
    public Car(String brand, String model, String shift, int doors, int hp, int cc, int weight, int seats, String fuel, int price) 
            throws NegativeException, EmptyStringException{
        if (doors<=0 || hp<=0 || cc<=0 || weight<=0 || seats<=0 || price<=0) {
            throw new NegativeException("The numbers cannot be negative");
        }
        if (brand == "" || model == "" || shift == "" || fuel == "") {
            throw new EmptyStringException("Strings cannot be empty");
        }
        this.brand = brand;
        this.model = model;
        this.shift = shift;
        this.doors = doors;
        this.hp = hp;
        this.cc = cc;
        this.vin = rnd.nextInt(high-low) + low;
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
        return brand +" "+ model + " VIN(" + vin + ")"; //To change body of generated methods, choose Tools | Templates.
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
