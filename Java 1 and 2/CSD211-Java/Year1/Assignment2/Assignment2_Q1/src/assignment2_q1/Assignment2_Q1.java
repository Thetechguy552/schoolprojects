package assignment2_q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Assignment2_Q1 {

    public static void main(String[] args) {
    int number;
        try{
            number = Integer.parseInt(args[0]);
            if(number < 1) throw new IllegalArgumentException();
            String[] words = getWords(number);  
            String[] randomWords = randomizeWords(words);
            printRandomWordsByLetter(randomWords);
        }
        catch(NumberFormatException e){
            System.out.println("Input Must Be A Valid Number");
        }
        catch(IllegalArgumentException e){
            System.out.println("Input Must Be A Positive Number And Not Zero");
        }
        
    }
    
    private static String[] getWords(int number){
        Scanner in = new Scanner(System.in);
        String[] str = new String[number];
        System.out.println("Please enter a series of " + number + " words!");
        for(int i = 0;i < number;i++){
            String input = in.nextLine();
            str[i] = input;
        }
        return str;
    }
    
    private static String[] randomizeWords(String[] words){
        ArrayList<String> str = new ArrayList(Arrays.asList(words));
        Collections.shuffle(str);
        String[] randomWords = new String[str.size()];
        str.toArray(randomWords);
        return randomWords;
    }
    
    private static void printRandomWordsByLetter(String[] randomWords){
        for(String s : randomWords)
            for(int i = 0;i < s.length();i++)
                System.out.println(s.charAt(i));
    }
    
}
