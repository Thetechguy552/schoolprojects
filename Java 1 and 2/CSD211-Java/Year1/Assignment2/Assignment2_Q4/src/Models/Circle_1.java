package Models;
/**
 * Jonathan Kelly
 * @author 15015608
 */

public class Circle {
    
    private static int numberOfCirclesCreated = 0;
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
        numberOfCirclesCreated++;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void printArea(){
        System.out.println("The Area of the Circle is " + (Math.PI * (this.radius * this.radius)));
    }
    
    public void printDimensions(){
        System.out.println("The Radius of the Circle is Radius = " + this.radius);
    }
    
    public static int circleCount(){
        return numberOfCirclesCreated;
    }
    
}
