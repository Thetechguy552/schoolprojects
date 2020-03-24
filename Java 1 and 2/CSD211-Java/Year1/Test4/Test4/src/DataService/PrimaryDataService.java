package DataService;

import Models.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class PrimaryDataService 
{
        public Student readStudentData() throws FileNotFoundException, IOException{
        File file = new File("C:/Test.txt");
        Student student = new Student();
        if(file.exists()){
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                student.setStudentID(Integer.parseInt(reader.readLine()));
                student.setFirstName(reader.readLine());
                student.setLastName(reader.readLine());
                student.setStudentAverage(Double.parseDouble(reader.readLine()));
            }
        }
        return student;
    }
    
    public void writeStudentData(Student student) throws IOException{
        
        try (FileWriter writer = new FileWriter(new File("C:/Test.txt"), false)) {
            writer.write(String.valueOf(student.getStudentID() + "\n"));
            writer.write(student.getFirstName() + "\n");
            writer.write(student.getLastName() + "\n");
            writer.write(String.valueOf(student.getStudentAverage() + "\n"));
        }
    }
    
    public void resetStudentData() throws IOException{
        
        try (FileWriter writer = new FileWriter(new File("C:/Test.txt"), false)) {
            writer.write(String.valueOf(0) + "\n");
            writer.write("N/A\n");
            writer.write("N/A\n");
            writer.write(String.valueOf(0.0) + "\n");
        }    
    }
}
