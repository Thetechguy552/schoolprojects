package assignment2_q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Assignment2_Q2 extends JPanel 
{

    public static void main(String[] args) throws FileNotFoundException 
    {
           Assignment2_Q2 fileApplication = new Assignment2_Q2();
           String userInput = getChoice();
           System.out.println();
           if(userInput.equalsIgnoreCase("Y"))
           {
               CompareTwoArrays();
           }
           System.out.println();
           System.out.println("Program Exited Successfully!");  
    } 
    private static String getChoice()
    {
     Scanner in = new Scanner(System.in);
        System.out.print("Would You Like To Compare Two Arrays From Files? (Y/N)");
        String choice =in.next();
        return choice;
    }
    private static void CompareTwoArrays() throws FileNotFoundException
    {
        System.out.println("Please choose file number 1: ");
        File file1 = getFile();
        int[] fileArray1 = createArrayFromFile(file1);
        Arrays.sort(fileArray1);
        
        System.out.println("Please choose file number 2: ");
        File file2 = getFile();
        int[] fileArray2 = createArrayFromFile(file2);
        Arrays.sort(fileArray2);
        
        boolean areEqual = Arrays.equals(fileArray1, fileArray2);
        
        System.out.println();
        System.out.println("Are The 2 Arrays Equal? " + areEqual);
                
    }
    private static File getFile()
    {
      JFileChooser fileChooser = new JFileChooser();
       File file = null;
       fileChooser.setDialogTitle("open A file with JFilechooser");
       if(fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
       {
           file = fileChooser.getSelectedFile();
       }
       return file;
    }
    
    private static int[] createArrayFromFile (File file)throws FileNotFoundException
    {
     Scanner in = new Scanner(file);
     int len = in.nextInt();
     int[] fileArray = new int[len];
        for (int i = 0; i < len; i++) 
        {
        fileArray[i] = in.nextInt();
        }
        return fileArray;
    }
}
