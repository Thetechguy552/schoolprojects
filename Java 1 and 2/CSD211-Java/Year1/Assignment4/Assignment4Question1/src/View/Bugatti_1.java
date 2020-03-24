/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import CarModels.Car;
import CarModels.DieselCar;
import CarModels.GasCar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author PC1
 */
public class Bugatti {
    
    private ArrayList gasCars;
    private ArrayList dieselCars;
    
    //Constructor --------------------------------------------------------------
    
    public Bugatti(){
        this.gasCars = new ArrayList();
        this.dieselCars = new ArrayList();
    }
    
    //Getters ------------------------------------------------------------------
    
    public ArrayList getGasCars(){
        return this.gasCars;
    }
    
    public ArrayList getDieselCars(){
        return this.dieselCars;
    }
    
    //Methods that uses Car as param to reduce number of methods needed --------
    
    public void addCar(Car car){
        if(car instanceof GasCar){
            gasCars.add(car);
        }
        else if(car instanceof DieselCar){
            dieselCars.add(car);
        }
        else System.out.println("Error: Not A Valid Car Type");
    }
    
    public void removeCar(Car car){
        if(car instanceof GasCar){
            gasCars.remove(car);
        }
        else if(car instanceof DieselCar){
            dieselCars.remove(car);
        }
        else System.out.println("Error: Not A Valid Car Type");
    }
    
    //Can pass either list to this method to reduce code -----------------------
    
    public void displayList(ArrayList list){
        list.stream().forEach(car -> System.out.println(car));
    }
    
    public void displayCarsByTopSpeed(){
        ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(gasCars);
        cars.addAll(dieselCars);
       
        Car[] carsBySpeed = new Car[cars.size()];
        cars.toArray(carsBySpeed);
        
        //Sort Based On compareTo Method In Car Class
        
        Arrays.sort(carsBySpeed);
        
        Arrays.stream(carsBySpeed).forEach(car -> System.out.println(car));
         
    }
    
}
