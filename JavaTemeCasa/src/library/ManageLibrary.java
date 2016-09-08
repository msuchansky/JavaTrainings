/**
 * File contains class ManageLibrary which tests our library
 * 
 */
package library;

/**
 * File contains class ManageLibrary which tests our library
 * @author mszuchan
 */
public class ManageLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates library catalogue 
        LibraryCatalog raft = new LibraryCatalog();
    
        // Create two novel books 
        
        Novel novela1 = new Novel(Novel.NovelType.SF, "Dune", "111225841", 250);
        Novel novela2 = new Novel(Novel.NovelType.SF, "Star Wars", "151225841", 200);
        
        // create 3 art albums 
        
        ArtAlbum album1 = new ArtAlbum(ArtAlbum.PaperQuality.GLOSSY, "Picasso", "154122455841", 30);
        ArtAlbum album2 = new ArtAlbum(ArtAlbum.PaperQuality.LAMINATED , "Renoire", "1551225841", 35);
        ArtAlbum album3 = new ArtAlbum(ArtAlbum.PaperQuality.REGULAR , "Van Gogh", "1541225841", 40);
        
        // add all books on the raft 
        
        raft.addBook(album3);
        raft.addBook(novela1);
        raft.addBook(album2);
        raft.addBook(novela2);
        raft.addBook(album1);
        
        // dispaly books from raft 
        
        raft.displayAllBooks();
        
        // delete a book and siaply again 
        
        raft.deleteBook(album3);
        
        raft.displayAllBooks();
        

    }
    
}
