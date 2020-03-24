package question1;
import java.util.Random;
import java.util.Scanner;
/**
 * Author Jonathan Kelly
 */

public class Question1 {
  
  public static void main(String[] aArgs){
   Scanner input = new Scanner(System.in);
    Random ran = new Random();
    //Declare varables
    int guess = 0;
    int sum = 0;
    int ran1 = ran.nextInt(10)+ 1;
    int ran2 = ran.nextInt(10)+ 1;
    int ran3 = ran.nextInt(10)+ 1;

      System.out.println("What is the sum of: " +ran1 +" + "+ran2 +" + " +ran3);
      
      System.out.print("= ");
      guess = input.nextInt();
      
      //Adds the random numbers
      sum = ran1+ran2+ran3;
      
      //Checks to see if number is true of false 
      if (guess == sum){
          System.out.println("true");
      }
      else {
          System.out.println("false");
      }
      
      //Prints out answer 
      System.out.println("The answer is "+ sum);
  }
}