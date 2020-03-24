/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import CarModels.DieselCar;
import CarModels.GasCar;
import EngineModels.DieselEngine;
import EngineModels.GasEngine;

/**
 *
 * @author PC1
 */
public class Assignment4Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create Cars ----------------------------------------------------------
        
        GasCar gasCar1 = new GasCar(100);
        GasCar gasCar2 = new GasCar("MyFirstGasCar", "Black", 4, 4, 25, 120, 50);
        
        DieselCar dieselCar1 = new DieselCar(110);
        DieselCar dieselCar2 = new DieselCar("MyFirstDieselCar", "Green", 6, 4, 30, 90, 75);
        
        //Display Engine Utilization -------------------------------------------
        
        gasCar1.getEngineType().engineUtilization();
        dieselCar1.getEngineType().engineUtilization();
        
        //Create Bugatti Object And Add Cars -----------------------------------
        
        Bugatti bugatti = new Bugatti();
        bugatti.addCar(gasCar1);
        bugatti.addCar(gasCar2);
        bugatti.addCar(dieselCar1);
        bugatti.addCar(dieselCar2);
        
        //Display Gas And Diesel Cars ------------------------------------------
        
        System.out.println("\n------------- Gas Cars ----------------");
        bugatti.displayList(bugatti.getGasCars());
        System.out.println("\n------------- Diesel Cars -------------");
        bugatti.displayList(bugatti.getDieselCars());
        
        //Sort Cars By Top Speed -----------------------------------------------
        
        System.out.println("\n------------- Cars Diplayed By Top Speed ---------------");
        bugatti.displayCarsByTopSpeed();
        
        //Remove One Of Each Car Type ------------------------------------------
        
        bugatti.removeCar(new GasCar(100));
        bugatti.removeCar(new DieselCar(110));
        
        //Display Cars After Removal -------------------------------------------
        
        System.out.println("\n------------- Gas Cars ----------------");
        bugatti.displayList(bugatti.getGasCars());
        System.out.println("\n------------- Diesel Cars -------------");
        bugatti.displayList(bugatti.getDieselCars());
        
        //Test Equality Of Engines ---------------------------------------------
        
        GasEngine gasEngine1 = new GasEngine(6, 6, 6);
        GasEngine gasEngine2 = new GasEngine(6, 6, 6);
        GasEngine gasEngine3 = new GasEngine();        
        DieselEngine dieselEngine1 = new DieselEngine(6, 6, 6);
        DieselEngine dieselEngine2 = new DieselEngine(6, 6, 6);
        
        System.out.println();
        System.out.println("gasEngine1 Is Equal To gasEngine2: " + gasEngine1.equals(gasEngine2));
        System.out.println("gasEngine1 Is Equal To gasEngine3: " + gasEngine1.equals(gasEngine3));
        System.out.println("gasEngine1 Is Equal To dieselEngine1: " + gasEngine1.equals(dieselEngine1));
        System.out.println("dieselEngine1 Is Equal To dieselEngine2: " + dieselEngine1.equals(dieselEngine2));
        
    }
    
}
