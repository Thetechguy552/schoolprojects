package question2;
import java.util.Random;
/**
 * Author Jonathan Kelly
 */
public class Question2 {
    
    // Gets negative numbers 
    public static int negatives(int[] list) {
        
        int negNums = 0;
        for(int i = 0; i < list.length; i++) {
            if (list[i] < 0) {
                negNums += 1;
            }
        }
        return negNums;
    }
    
    // Gets positive numbers
    public static int positives(int[] list) {
        
        int posNums = 0;
        for(int i = 0; i < list.length; i++) {
            if (list[i] >= 0) {
                posNums += 1;
            }
        }
        return posNums;
    }
    
    // Calculates average 
    public static double averageNeg(int[] list, int negNums) {
        
        double average = 0.00;
        int negTotal = 0;
        for(int i = 0; i < list.length; i++) {
            if (list[i] < 0) {
                negTotal += list[i];
            }
        }
        average = (double) negTotal / negNums;
        return average;
    }
    
    // Calculates average 
    public static double averagePos(int[] list, int posNums) {
        
        double average = 0.00;
        int posTot = 0;
        for(int i = 0; i < list.length; i++) {
            if (list[i] >= 0) {
                posTot += list[i];
            }
        }
        average = (double) posTot / posNums;
        return average;
    }
    
    // Determine smallest number 
    public static int smallNum(int[] list) {
        
        int smallest = 0;
        for(int i = 0; i < list.length; i++) {
            
            if (list[i] < smallest) {
                smallest = list[i];
            }
        }
        return smallest;
    }   
    
    // Determine largest number
    public static int largeNum(int[] list) {
        
        int largest = 0;
        for(int i = 0; i < list.length; i++) {
            
            if (list[i] > largest) {
                largest = list[i];
            }
        }
        return largest;
    }
    public static double averageSum(int[] list) {
        
        double average = 0.00;
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            
            sum += list[i];
        }
        average = (double) sum / 50;
        return average;
    }
    public static void main(String[] args) {
        
        // Create list of 50 values, myList
        int[] myList = new int[50];
        
        // Fill myList with random numbers between -500, 500, print on screen
        Random rand = new Random();
        
        for(int i = 0; i < myList.length; i++) {
            
            myList[i] = rand.nextInt(1001) - 500;
           
            if (i != 49)
                System.out.print(myList[i]+", ");
            else
                System.out.print(myList[i]+" ");
        }
        
        int negNums = negatives(myList);
        int posNums = positives(myList);
        double negAverage = averageNeg(myList, negNums);
        double posAverage = averagePos(myList, posNums);
        int largest = largeNum(myList);
        int smallest = smallNum(myList);
        double sumAverage = averageSum(myList);
        
        // Prints everything
        System.out.println("\n");
        System.out.println("There are " + negNums + " negative numbers.");
        System.out.println("There are " + posNums + " positive numbers.");
        System.out.println("");
        
        System.out.println("The average value of the negative numbers is " + negAverage);
        System.out.println("The average value of the positive numbers is " + posAverage);
        System.out.println("");
        
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
        System.out.println("");
        
        System.out.println("The total average of the summ of all the numbers is " + sumAverage); 
    }  
}