/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarModels;

import EngineModels.DieselEngine;

/**
 *
 * @author PC1
 */
public class DieselCar extends Car{
    
    private int litersInTank;
    
    public DieselCar(int litersInTank){
        super(new DieselEngine());
        this.litersInTank = litersInTank;
    }
    
    public DieselCar(String name, String color, int numberOfDoors, 
        int numberOfWheels, int wheelSizeInInches, int topSpeedInKm, int litersInTank){
        super(name, color, numberOfDoors, numberOfWheels, wheelSizeInInches, topSpeedInKm, new DieselEngine());
        this.litersInTank = litersInTank;
    }
    
    //Getters ------------------------------------------------------------------
    
    public int getLitersInTank(){
        return this.litersInTank;
    }
    
    //Setters ------------------------------------------------------------------
    
    public void setLitersInTank(int liters){
        this.litersInTank = liters;
    }
    
    @Override
    public boolean equals(Object car){
        if(car instanceof DieselCar /*will determine engine type equality*/) {
            return ((this.getCarName().equals(((DieselCar) car).getCarName())) 
                    && (this.getNumberOfDoors() == ((DieselCar) car).getNumberOfDoors()) 
                    && (this.getNumberOfWheels() == ((DieselCar) car).getNumberOfWheels()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.litersInTank;
        return hash;
    }
    
    //Overriden toString Method ------------------------------------------------
    
    @Override
    public String toString(){
        return super.toString()
                + "\nLiters In Tank: " + this.getLitersInTank();
    }
    
}
