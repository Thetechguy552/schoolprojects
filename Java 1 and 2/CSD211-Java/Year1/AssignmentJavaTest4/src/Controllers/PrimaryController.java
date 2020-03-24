/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataService.PrimaryDataService;
import Models.Student;
import java.io.IOException;

/**
 *
 * @author User
 */
public class PrimaryController {
    
    private final PrimaryDataService service;
    
    public PrimaryController(){
        service = new PrimaryDataService();
    }
    
    public Student getStudentData() throws IOException{
        return service.readStudentData();
    }
    
    public void setStudentData(Student student) throws IOException{
        service.writeStudentData(student);
    }
    
    public void resetStudentData() throws IOException{
        service.resetStudentData();
    }
    
}
