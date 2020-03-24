/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarModels;

import EngineModels.GasEngine;

/**
 *
 * @author PC1
 */
public class GasCar extends Car{
    
    private int litersInTank;
    
    public GasCar(int litersInTank){
        super(new GasEngine());
        this.litersInTank = litersInTank;
    }
    
    public GasCar(String name, String color, int numberOfDoors, 
        int numberOfWheels, int wheelSizeInInches, int topSpeedInKm, int litersInTank){
        super(name, color, numberOfDoors, numberOfWheels, wheelSizeInInches, topSpeedInKm, new GasEngine());
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
        if(car instanceof GasCar /*will determine engine type equality*/) {
            return ((this.getCarName().equals(((GasCar) car).getCarName())) 
                    && (this.getNumberOfDoors() == ((GasCar) car).getNumberOfDoors()) 
                    && (this.getNumberOfWheels() == ((GasCar) car).getNumberOfWheels()));
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
