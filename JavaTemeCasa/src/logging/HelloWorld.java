/*
 * This class test the logging capacity of log4j based on official documentation 
 */
package logging;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.lf5.DefaultLF5Configurator;


/**
 * This class test the logging capacity of log4j based on official documentation 
 * @author mszuchan
 */
    
public class HelloWorld {
    // create a logger or logging manager for my class 
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // Configure default configurator 
        DefaultLF5Configurator.configure();
        // Call Different log4j methods 

        LOGGER.info("Hello, World!");
        LOGGER.debug("Hello, my name is Homer Simpson.");
        LOGGER.debug("Hello, my name is Lisa Simpson.");
        LOGGER.debug("Hello, my name is Marge Simpson.");
        LOGGER.debug("Hello, my name is Bart Simpson.");
        LOGGER.debug("Hello, my name is Maggie Simpson.");

        LOGGER.info("We are the Simpsons!");
        LOGGER.info("Mmmmmm .... Chocolate.");
        LOGGER.info("Homer likes chocolate");
        LOGGER.info("Doh!");
        LOGGER.info("We are the Simpsons!");

        LOGGER.warn("Bart: I am through with working! Working is for chumps!" +
                "Homer: Son, I'm proud of you. I was twice your age before " +
                "I figured that out.");
        LOGGER.warn("Mmm...forbidden donut.");
        LOGGER.warn("D'oh! A deer! A female deer!");
        LOGGER.warn("Truly, yours is a butt that won't quit." +
                "- Bart, writing as Woodrow to Ms. Krabappel.");

        LOGGER.error("Dear Baby, Welcome to Dumpsville. Population: you.");
        LOGGER.error("Dear Baby, Welcome to Dumpsville. Population: you.",
                new IOException("Dumpsville, USA"));
        LOGGER.error("Mr. Hutz, are you aware you're not wearing pants?");
        LOGGER.error("Mr. Hutz, are you aware you're not wearing pants?",
                new IllegalStateException("Error !!"));


        LOGGER.fatal("Eep.");
        LOGGER.fatal("Mmm...forbidden donut.",
                new SecurityException("Fatal Exception"));
        LOGGER.fatal("D'oh! A deer! A female deer!");
        LOGGER.fatal("Mmmmmm .... Chocolate.",
                new SecurityException("Fatal Exception"));
    }
    
}
