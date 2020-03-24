package question_2;
import java.util.Scanner;
/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Question_4 
{
//    public static int count(String str, char a){}


    public static void main(String[] args) 
   {   
        Scanner Keyboard = new Scanner(System.in);
        String word;
        String character;
        
        System.out.println(" Enter a word");
        word = Keyboard.nextLine();
        System.out.println("Enter the character you would like to count");
        character = Keyboard.nextLine();
        
        char letter = character.charAt(0);
        
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
          if (word.charAt(i) == letter)
            counter++;
        }
        System.out.println(counter + " letters.");

    }
}
