/*
 * This class test the logging capacity of log4j based on official documentation 
 */
package logging;

import java.io.IOException;
import java.util.logging.Logger;
//import org.apache.log4j.Logger;
//import org.apache.log4j.lf5.DefaultLF5Configurator;


/**
 * This class test the logging capacity of log4j based on official documentation 
 * @author mszuchan
 */
    
public class HelloWorld {
    // create a logger or logging manager for my class 
    private static final Logger LOGGER = Logger.getLogger("HelloWorld");
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // Configure default configurator 
        //DefaultLF5Configurator.configure();
        // Call Different log4j methods 

        LOGGER.info("Hello, World!");
        LOGGER.warning("Hello, my name is Homer Simpson.");
        LOGGER.warning("Hello, my name is Lisa Simpson.");
        LOGGER.warning("Hello, my name is Marge Simpson.");
        LOGGER.warning("Hello, my name is Bart Simpson.");
        LOGGER.warning("Hello, my name is Maggie Simpson.");

        LOGGER.info("We are the Simpsons!");
        LOGGER.info("Mmmmmm .... Chocolate.");
        LOGGER.info("Homer likes chocolate");
        LOGGER.info("Doh!");
        LOGGER.info("We are the Simpsons!");

        LOGGER.warning("Bart: I am through with working! Working is for chumps!" +
                "Homer: Son, I'm proud of you. I was twice your age before " +
                "I figured that out.");
        LOGGER.warning("Mmm...forbidden donut.");
        LOGGER.warning("D'oh! A deer! A female deer!");
        LOGGER.warning("Truly, yours is a butt that won't quit." +
                "- Bart, writing as Woodrow to Ms. Krabappel.");

        LOGGER.severe("Dear Baby, Welcome to Dumpsville. Population: you.");
        LOGGER.severe("Dear Baby, Welcome to Dumpsville. Population: you.");
        LOGGER.severe("Mr. Hutz, are you aware you're not wearing pants?");
        LOGGER.severe("Mr. Hutz, are you aware you're not wearing pants?");


        LOGGER.severe("Eep.");
        LOGGER.severe("Mmm...forbidden donut.");
        LOGGER.severe("D'oh! A deer! A female deer!");
        LOGGER.severe("Mmmmmm .... Chocolate.");
    }
    
}
