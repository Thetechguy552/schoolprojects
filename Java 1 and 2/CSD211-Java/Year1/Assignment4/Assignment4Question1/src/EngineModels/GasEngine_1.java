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
public class GasEngine extends Engine{
    
    //Constructors -------------------------------------------------------------
    
    public GasEngine(){
        super();
    }
    
    public GasEngine(int numberOfSparkPlugs, int numberOfValves, int numberOfPistons){
        super(numberOfSparkPlugs, numberOfValves, numberOfPistons);
    }

    //Display Information About How The Engine Works ---------------------------
    
    @Override
    public void engineUtilization() {
        System.out.println(" -----------Gas Engine-------------\n\n" +
                           "Intake stroke – fuel is mixed with air.\n" +
                           "Compression stroke – piston goes up, mixture of fuel and air is compressed.\n" +
                           "Ignition stroke – fuel/air is ignited through the use of a spark plug.\n" +
                           "Exhaust stroke – piston goes up, pushes exhaust through the exhaust valve.\n");
    }
    
    //Overriden Equals Method --------------------------------------------------
    
    @Override
    public boolean equals(Object engine){
        if(engine instanceof GasEngine /*will determine engine type equality*/) {
            return ((this.getNumberOfSparkPlugs() == ((GasEngine) engine).getNumberOfSparkPlugs()) 
                    && (this.getNumberOfValves() == ((GasEngine) engine).getNumberOfValves()) 
                    && (this.getNumberOfPistons() == ((GasEngine) engine).getNumberOfPistons()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
}
