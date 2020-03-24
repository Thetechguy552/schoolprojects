package assignment2_q4;

import Models.Rectangle;
import static Models.Rectangle.rectangleCount;
import Models.Triangle;
import static Models.Triangle.triangleCount;
import Models.Circle;
import static Models.Circle.circleCount;
/**
 * Jonathan Kelly
 * @author 15015608
 */

public class Assignment2_Q4 {

    public static void main(String[] args) {
createAndTestRectangles();
        System.out.println();
        
        createAndTestTriangles();
        System.out.println();
        
        createAndTestCircles();  
        System.out.println();
        
    }
    
    public static void createAndTestRectangles(){
        Rectangle rect1 = new Rectangle(12, 15);
        Rectangle rect2 = new Rectangle(120, 25);
        
        System.out.println("The Current Number of Rectangles Created is " + rectangleCount());
        rect1.printArea();
        rect1.printDimensions();
        rect2.printArea();
        rect2.printDimensions();
        
    }
    
    public static void createAndTestTriangles(){
        Triangle tri1 = new Triangle(30, 15);
        Triangle tri2 = new Triangle(12, 6);
        
        System.out.println("The Current Number of Triangles Created is " + triangleCount());
        tri1.printArea();
        tri1.printDimensions();
        tri2.printArea();
        tri2.printDimensions();

    }
    
    public static void createAndTestCircles(){
        Circle circ1 = new Circle(50);
        Circle circ2 = new Circle(101);
        
        System.out.println("The Current Number of Circles Created is " + circleCount());
        circ1.printArea();
        circ1.printDimensions();
        circ2.printArea();
        circ2.printDimensions();

    }
    
}

