/*
 * Create own exception named NotExistingBook
 */
package library;

/**
 * Create own exception named NotExistingBook
 * @author mszuchan
 */
public class NotExistingBook extends Exception {

    public NotExistingBook() throws Exception {
        throw new Exception("Required book didn't exist in our bookstore.");  
    }
    
    
    
    
    
}
