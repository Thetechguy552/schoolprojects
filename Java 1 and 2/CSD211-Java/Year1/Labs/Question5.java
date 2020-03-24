package question5;
import java.util.Scanner;
/**
 * Author Jonathan Kelly
 */

public class Question5 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String mystr = input.nextLine();
    
    while(mystr.trim().length() == 0){
    System.out.println("You didn't enter anything.: ");
    System.out.print("Enter a string: ");
    mystr = input.nextLine();
    }
    System.out.println("The number of characters in the string is: " + mystr.length());
    System.out.println("The first character of the string is: " + mystr.charAt(0));
    System.out.println("The last character of the string is: " + mystr.charAt(mystr.length()-1));
    System.out.println("The string reversed is: " + new StringBuffer (mystr).reverse().toString());
    for (int i = 0; i < mystr.length(); i++){
    System.out.println("The decimal value of(" +mystr.charAt(i)+") is: "+ (int)mystr.charAt(i));
    }
    System.out.println("The upper case version of the string is: " + mystr.toUpperCase());
    System.out.println("The lower case version of the string is: " + mystr.toLowerCase());
        
    }
    
}
