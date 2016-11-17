/**
 * this class contains method main that instantiates 3 note pad instances 
 */


package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * this class has a main method that instantiates 3 note pad instances 
 * @author miroslavszuchanszki
 */
public class Multiprocess {
    public static void main(String[] args){
        try {
            ProcessBuilder pb;
            // Use process builder to start 2 processes multithreading.SayHello with parameter
            pb= new ProcessBuilder(
                    "java",
                    "-classpath",
                    "C:\\Users\\Miro\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Accessories",
                    "Notepad.exe");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (Exception ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}