/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EngineModels;

/**
 *
 * @author PC1
 */
public class DieselEngine extends Engine{
    
    public DieselEngine(){
        super();
    }
    
    public DieselEngine(int numberOfSparkPlugs, int numberOfValves, int numberOfPistons){
        super(numberOfSparkPlugs, numberOfValves, numberOfPistons);
    }

    //Display Information About How The Engine Works ---------------------------
    
    @Override
    public void engineUtilization() {
        System.out.println(" -----------Diesel Engine----------\n\n" +
                           "Intake stroke – intake valve opens, air in, piston goes down.\n" +
                           "Compression stroke – piston goes up, air compressed (heated in excess of 540°C).\n" +
                           "ICombustion stroke – fuel is injected (right time), ignition, piston goes down.\n" +
                           "Exhaust – piston goes up, pushes exhaust through the exhaust valve."); 
    }
    
    //Overriden Equals Method --------------------------------------------------
    
    @Override
    public boolean equals(Object engine){
        if(engine instanceof DieselEngine /*will determine engine type equality*/) {
            return ((this.getNumberOfSparkPlugs() == ((DieselEngine) engine).getNumberOfSparkPlugs()) 
                    && (this.getNumberOfValves() == ((DieselEngine) engine).getNumberOfValves()) 
                    && (this.getNumberOfPistons() == ((DieselEngine) engine).getNumberOfPistons()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
}
