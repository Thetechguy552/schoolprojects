package View;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Driver {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        PrimaryView view = new PrimaryView();
        view.showApplication();   
    }    
}
