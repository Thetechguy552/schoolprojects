package test2;
import java.util.Scanner;
/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Question_1 
{

public static void main (String [] Args)
    {

    int q = 0;
    double grades = 0;
    double total = 0;

    Scanner in = new Scanner(System.in);
    // user input how many students they would like to enter
    System.out.println("How many students: ");
    q = in.nextInt();
    double[] scores = new double[q];//initialize here
    
    // user enters number of grades they would like to enter
    for (int i = 0; i < scores.length; i++) {
        System.out.println("Enter your grades: ");
        grades = in.nextInt();

        scores[i] = grades;//append values to each index
        // adds up all the grades)
        total += scores[i]; //sums up entered grades
    }
    total = total / q; //calcs average 
    System.out.println("average : " + total);
    //iterate through the scores array with filled values
    for (int i = 0; i < scores.length; i++) {
        System.out.println("Grade #" + i + ": " + scores[i]);
        
        }
    }
}       

    

