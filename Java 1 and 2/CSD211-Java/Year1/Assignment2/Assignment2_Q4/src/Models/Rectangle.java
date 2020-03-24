package Models;
/**
 * Jonathan Kelly
 * @author 15015608
 */

public class Rectangle {
    
    private static int numberOfRectanglesCreated = 0;
    
    private double length, width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        numberOfRectanglesCreated++;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void printArea(){
        System.out.println("The Area of the Rectangle is " + this.length * this.width);
    }
    
    public void printDimensions(){
        System.out.println("The Dimensions of the Rectangle are Length = " + this.length + " and Width = " + this.width);
    }
    
    public static int rectangleCount(){
        return numberOfRectanglesCreated;
    }
    
}
