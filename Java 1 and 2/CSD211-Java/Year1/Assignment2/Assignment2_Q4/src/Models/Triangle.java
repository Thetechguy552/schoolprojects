package Models;
/**
 * Jonathan Kelly
 * @author 15015608
 */

public class Triangle {
    
    private static int numberOfTrianglesCreated = 0;
    
    private double base, height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
        numberOfTrianglesCreated++;
    }
    
    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void printArea(){
        System.out.println("The Area of the Triangle is " + this.base * this.height / 2);
    }
    
    public void printDimensions(){
        System.out.println("The Dimensions of the Triangle are Base = " + this.base + " and Height = " + this.height);
    }
    
    public static int triangleCount(){
        return numberOfTrianglesCreated;
    }
    
}
