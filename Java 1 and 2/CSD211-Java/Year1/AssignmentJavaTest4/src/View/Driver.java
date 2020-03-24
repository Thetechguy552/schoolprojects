/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Driver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrimaryView view = new PrimaryView();
        view.showApplication();
    }
    
}
