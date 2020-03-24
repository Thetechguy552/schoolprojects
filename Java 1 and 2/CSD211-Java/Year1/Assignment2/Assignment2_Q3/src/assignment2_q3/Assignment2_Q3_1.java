package assignment2_q3;
import java.util.Scanner;
/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Assignment2_Q3 {

    public static void main(String[] args) {
        int[][] studentData = populateData();
        printTestGrades(studentData);
        printTestAverages(studentData);
        printStudentAverages(studentData);
    }
    
    private static int[][] populateData(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please Enter The Number Of Students: ");
        int numberOfStudents = in.nextInt();
        System.out.print("Please Enter The Number Of Tests In The Course: ");
       
        int numberOfTests = in.nextInt();
        
        int[][] studentData = new int[numberOfStudents][numberOfTests];
        System.out.println();
        System.out.println("Please Enter A Grade for each student. The grade percentage must be 0-100%");
        for(int i = 0;i < numberOfStudents;i++)
            for(int j = 0;j< numberOfTests;j++){ 
                System.out.print("Please Enter A Grade for Student " + (i+1) + ", Test " + (j+1) + ": ");
                int grade = in.nextInt();
                while(grade > 100 || grade < 0){
                    System.out.println();
                    System.err.print("That grade is invalid.The grade must be 0-100%");
                    System.out.print("Please Enter A Grade for Student " + (i+1) + ", Test " + (j+1) + ": ");  System.out.println();
                    System.out.println();
                    grade = in.nextInt();                    
                }
                studentData[i][j] = grade;
            }
      
        return studentData;
    }
    
    private static void printTestGrades(int[][] studentData){
        for(int i = 0;i < studentData.length;i++)
            for(int j = 0;j < studentData[i].length;j++)
                System.out.println("Grade for Student " + (i+1) + ", Test " + (j+1) + " is " + studentData[i][j]);
        System.out.println();
    }
    
    private static void printTestAverages(int[][] studentData){
        System.out.println("The test averages are as follows: ");
        for(int i = 0;i < studentData.length;i++){
            double sum = 0.0;
            for(int j = 0;j < studentData[i].length;j++)
                sum += studentData[j][i];
            System.out.println("The Average for Test " + (i+1) + " is " + sum / (studentData.length));
        }
        System.out.println();
      
    }
    
    private static void printStudentAverages(int[][] studentData){
        System.out.println("The student averages are as follows: ");
        for(int i = 0;i < studentData.length;i++){
            double sum = 0;
            for(int j = 0;j < studentData[i].length;j++){
                sum += studentData[i][j];
            }
            System.out.println("The Overall Average Grade for Student " + (i+1) + " is " + sum / (studentData[0].length));
        }
        System.out.println();
    }
    
}