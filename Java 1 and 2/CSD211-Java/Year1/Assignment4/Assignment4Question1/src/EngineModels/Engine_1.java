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
public abstract class Engine {
    
    private int numberOfSparkPlugs, numberOfValves, numberOfPistons;
    
    //Constructors -------------------------------------------------------------
    
    public Engine(){
        this(4, 4, 4);
    }
    
    public Engine(int numberOfSparkPlugs, int numberOfValves, int numberOfPistons){
        this.numberOfSparkPlugs = numberOfSparkPlugs;
        this.numberOfValves = numberOfValves;
        this.numberOfPistons = numberOfPistons;
    }
    
    //Getters ------------------------------------------------------------------
    
    protected int getNumberOfSparkPlugs(){
        return this.numberOfSparkPlugs;
    }
    
    protected int getNumberOfValves(){
        return this.numberOfValves;
    }
    
    protected int getNumberOfPistons(){
        return this.numberOfPistons;
    }
    
    //Abstract Method ----------------------------------------------------------
    
    public abstract void engineUtilization();
    
    //Overriden toString Method
    
    @Override
    public String toString(){
        return "\nSpark Plugs: " + this.getNumberOfSparkPlugs() 
              +"\nValves: " + this.getNumberOfValves()
              +"\nPistons: " + this.getNumberOfPistons() + "\n";
    }
    
}
