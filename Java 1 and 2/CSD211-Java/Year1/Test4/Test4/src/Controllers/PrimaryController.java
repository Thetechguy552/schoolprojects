package Controllers;

import DataService.PrimaryDataService;
import Models.Student;
import java.io.IOException;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class PrimaryController 
{
    private final PrimaryDataService service;
    
    public PrimaryController()
    {
        service = new PrimaryDataService();
    }
    public Student getStudentData() throws IOException
    {
        return service.readStudentData();
    }
    public void setStudentData(Student student) throws IOException{
        service.writeStudentData(student);
    }
    
    public void resetStudentData() throws IOException{
        service.resetStudentData();
    }   
}
