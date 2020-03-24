package assignment3_q2;
import java.util.Random;
import java.util.Scanner;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Assignment3_Q2 
{
    public static void main(String[] args)
    {
        int[] nums = createRandomArray();
        int choice = getUserChoice();
        int value = getIndexByValue(nums, choice);
        printValue(choice, value);
    }
    
    static int[] createRandomArray()
    {
        return new Random().ints(100, 0, 1000).toArray();
    }
    
    static int getUserChoice()
    {
        Scanner in = new Scanner(System.in);
        int choice;
        while(true){
            System.out.print("Enter the index of the array: ");
            try{
                choice = Integer.parseInt(in.next());
                if(choice < 0 || choice > 99) throw new IllegalArgumentException();
                break;
            }
            catch(NumberFormatException exc)
            {
                System.out.println("Not a valid index! Please enter an integer!");
            }
            catch(IllegalArgumentException exc)
            {
                System.out.println("Index out of bounds!");
            }
        }
        return choice;
    }
    
    static int getIndexByValue(int[] nums, int index)
    {
        return nums[index];
    }
    
    static void printValue(int choice, int value)
    {
        System.out.println("Value At Index " + choice + " Is " + value);
    }
}   


