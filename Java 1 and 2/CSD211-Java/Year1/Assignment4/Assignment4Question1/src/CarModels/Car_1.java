/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarModels;

import EngineModels.Engine;

/**
 *
 * @author PC1
 */
public abstract class Car implements Comparable<Car>{
    
    private String name, color;
    private int numberOfDoors, numberOfWheels, wheelSizeInInches, topSpeedInKm;
    private Engine engineType;
    
    //Constructors -------------------------------------------------------------
    
    public Car(Engine engineType){
        this("Test Car", "White", 4, 4, 20, 100, engineType);
    }
    
    public Car(String name, String color, int numberOfDoors, 
            int numberOfWheels, int wheelSizeInInches, int topSpeedInKm, Engine engineType){
        this.name = name;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.wheelSizeInInches = wheelSizeInInches;
        this.topSpeedInKm = topSpeedInKm;
        this.engineType = engineType;
    }
    
    //Getters ------------------------------------------------------------------
    
    public final String getCarName(){
        return this.name;
    }
    
    public final String getCarColor(){
        return this.color;
    }
    
    public final int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    
    public final int getNumberOfWheels(){
        return this.numberOfWheels;
    }
    
    public final int getWheelSizeInInches(){
        return this.wheelSizeInInches;
    }
    
    public final int getTopSpeedInKm(){
        return this.topSpeedInKm;
    }
    
    public final Engine getEngineType(){
        return this.engineType;
    }
    
    //Setters ------------------------------------------------------------------
    
    public final void setCarName(String name){
        this.name = name;
    }
    
    public final void setCarColor(String color){
        this.color = color;
    }
    
    public final void setWheelSizeInInches(int wheelSizeInInches){
        this.wheelSizeInInches = wheelSizeInInches;
    }
    
    //Overriden toString Method ------------------------------------------------
    @Override
    public String toString(){
        return "\nCar Name: " + this.getCarName() 
              +"\nCar Color: " + this.getCarColor()
              +"\nNumber Of Doors: " + this.getNumberOfDoors() 
              +"\nNumber Of Wheels: " + this.getNumberOfWheels()
              +"\nWheel Size In Inches: " + this.getWheelSizeInInches()
              +"\nTop Speed In Km: " + this.getTopSpeedInKm()
              +"\nEngine Type: " + this.getEngineType().getClass().getSimpleName();
    }

    //CompareTo Method dictates how Arrays.sort(carsBySpeed) sorts
    
    @Override
    public int compareTo(Car car) {
        return Integer.compare(car.getTopSpeedInKm(), this.getTopSpeedInKm());
    }
    
}

