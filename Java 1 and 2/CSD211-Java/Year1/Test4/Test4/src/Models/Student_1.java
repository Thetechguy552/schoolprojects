package Models;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Student 
{ 
    private int studentID;
    private String firstName;
    private String lastName;
    private double studentAverage;
    
    public Student(){
        this(0, "N/A", "N/A", 0.0);
    }
    
    public Student(int studentID, String firstName, String lastName, double studentAverage){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAverage = studentAverage;
    }
    
    public int getStudentID(){
        return studentID;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public double getStudentAverage(){
        return this.studentAverage;
    }
    
    public void setStudentID(int id){
        this.studentID = id;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setStudentAverage(double average){
        this.studentAverage = average;
    }    
}
