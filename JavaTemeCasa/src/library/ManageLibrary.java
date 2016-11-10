/**
 * File contains class ManageLibrary which tests our library
 * 
 */
package library;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.log4j.Logger;
//import org.apache.log4j.lf5.DefaultLF5Configurator;

/**
 * File contains class ManageLibrary which tests our library
 * @author mszuchan
 */
public class ManageLibrary {
    // create a logger or logging manager for my class 
    private static final Logger LOGGER = Logger.getLogger("ManageLibrary");
    // creates library catalogue 
    static LibraryCatalog raft = new LibraryCatalog();
    
    private static void saveBooks() throws IOException {
        BufferedWriter r = null;
        try {    
            r = new BufferedWriter (new FileWriter("Books.txt"));
            LinkedList<Book>  listaDeCarti = raft.getListOfBooks();
            int numarDeCarti = listaDeCarti.size();
            for (int carteCurenta = 0; carteCurenta<numarDeCarti; carteCurenta++){
                Book carte = listaDeCarti.get(carteCurenta);
                r.write("Book Title: " + carte.getTitle() + "\n" );
                r.write("Page number: " + carte.getNumberOfPages() + "\n");
                r.write("ISBN: " + carte.getIsbn()+ "\n");
                r.write("----------------" + "\n");
                LOGGER.info("New Book Saved: " + carte.getTitle());
            }
        }
        catch (IOException ex) {
            System.out.println("Cannot read first line from text.txt: " + ex.getMessage());
        } 
        finally {
            r.close();
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        
    
        // Create 5 novel books 
        
        Novel novela1 = new Novel(Novel.NovelType.SF, "Dune", "111225841", 250);
        LOGGER.info("New Novel Created: " + novela1.getTitle());

        Novel novela2 = new Novel(Novel.NovelType.SF, "Star Wars", "151225841", 200);
        LOGGER.info("New Novel Created: " + novela2.getTitle());
        
        Novel novela3 = new Novel(Novel.NovelType.SF, "Dune2", "11122545841", 260);
        LOGGER.info("New Novel Created: " + novela3.getTitle());
        
        Novel novela4 = new Novel(Novel.NovelType.SF, "Star Wars 2", "155225841", 230);
        LOGGER.info("New Novel Created: " + novela4.getTitle());
        
        Novel novela5 = new Novel(Novel.NovelType.SF, "Star Wars 3", "455225841", 280);
        LOGGER.info("New Novel Created: " + novela5.getTitle());
        
        // create 5 art albums 
        
        ArtAlbum album1 = new ArtAlbum(ArtAlbum.PaperQuality.GLOSSY, "Picasso", "154122455841", 30);
        LOGGER.info("New Art Album Created: " + album1.getTitle());
        ArtAlbum album2 = new ArtAlbum(ArtAlbum.PaperQuality.LAMINATED , "Renoire", "1551225841", 35);
        LOGGER.info("New Art Album Created: " + album2.getTitle());
        ArtAlbum album3 = new ArtAlbum(ArtAlbum.PaperQuality.REGULAR , "Van Gogh", "1541225841", 40);
        LOGGER.info("New Art Album Created: " + album3.getTitle());
        ArtAlbum album4 = new ArtAlbum(ArtAlbum.PaperQuality.REGULAR , "Van Gogh Reincarcat ", "1551225841", 45);
        LOGGER.info("New Art Album Created: " + album4.getTitle());
        ArtAlbum album5 = new ArtAlbum(ArtAlbum.PaperQuality.REGULAR , "Van Gogh Ureche Fara", "15541225841", 50);
        LOGGER.info("New Art Album Created: " + album5.getTitle());
        
        // add all books on the raft 
        
        raft.addBook(album3);
        raft.addBook(novela1);
        raft.addBook(album2);
        raft.addBook(novela2);
        raft.addBook(album1);
        
        raft.addBook(album4);
        raft.addBook(album5);
        raft.addBook(novela3);
        raft.addBook(novela4);
        raft.addBook(novela5);
        // dispaly books from raft 
        
        raft.displayAllBooks();
        
        // delete a book and siaply again 
        
        raft.deleteBook(album3);
        //LOGGER.warn("Art Album Deleted: " + album3.getTitle());
       
        // Display all books  
        raft.displayAllBooks();
        
        try {
            // Save all books
            saveBooks();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManageLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
    
}
