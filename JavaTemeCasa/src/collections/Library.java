/*
 *  Starting from your already implemented homework about Books, BooksCollection, Novels and ArtAlbumes do following: 
    Create an object container by type map (HashMap), named “soldBooks” in which you store pairs:<Evaluation, Book>. 
    Evaluation is a class with 3 attributes: 
    stars (float between 1 and 5 with possible “half of stars” as 3.5 stars or 4.5 stars) - it is mandatory
    user_id (int representing a unique ID of a user that evaluated that book) - it is mandatory
    description (a “”string of max. 255 characters, “string” that can be changed)
    For all Books created in the Books collection do following:
    Add elements in the map (consider all books as sold)
    Print all values of their attributes based on the key (create report about all sold books)
 * 
 */
package collections;

import java.util.Hashtable;
import library.ArtAlbum;
import library.Book;
import library.Novel;

/**
 * We have used name EbookRating in place of Evaluation and because we have to 
 * use our types for a web application, we changed the type HashMap, which is 
 * not synchronized with type Hashtable based on javadoc from Oracle.    
 * @author admin
 */
public class Library {
        static Novel novela1;
        static Novel novela2;
        
        // create 3 art albums 
        
        static ArtAlbum album1;
        static ArtAlbum album2;
        static ArtAlbum album3;
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        // create collection of books 
        Hashtable<Book,EbookRating> raftColector = new Hashtable<>();
        
        novela1 = new Novel(Novel.NovelType.SF, "Dune", "111225841", 250);
        novela2 = new Novel(Novel.NovelType.SF, "Star Wars", "151225841", 200);
        
        // create 3 art albums 
        
        album1 = new ArtAlbum(ArtAlbum.PaperQuality.GLOSSY, "Picasso", "154122455841", 30);
        album2 = new ArtAlbum(ArtAlbum.PaperQuality.LAMINATED , "Renoire", "1551225841", 35);
        album3 = new ArtAlbum(ArtAlbum.PaperQuality.REGULAR , "Van Gogh", "1541225841", 40);
        
        // create ratings for all 5 books 
        
        EbookRating evaluareNovela1 = new EbookRating((float) 2.5, "1840829020111", "It was acceptable");
        EbookRating evaluareNovela2 = new EbookRating((float) 4.5, "1840829020111", "It was more then acceptable");
        
        EbookRating evaluareAlbum1 = new EbookRating((float) 1.5, "1840829020111", "It was unacceptable");
        EbookRating evaluareAlbum2 = new EbookRating((float) 2.5, "1840829020111", "It was ehm acceptable");
        EbookRating evaluareAlbum3 = new EbookRating((float) 3.5, "1840829020111", "It was pretty acceptable");
        
        // add books and their ratings in raftColector
        
        raftColector.put(album1, evaluareAlbum1);
        raftColector.put(album2, evaluareAlbum2);
        raftColector.put(album3, evaluareAlbum3);
        
        raftColector.put(novela1, evaluareNovela1); 
        raftColector.put(novela2, evaluareNovela2);        
        
        // display all books from collection 
        
        displayAll(raftColector);
        
        // delete album3
        System.out.println("Stergem album3");
        raftColector.remove(album3);
        
        // display all books from collection 
        
        displayAll(raftColector);
     
    }
    
    private static void displayAll(Hashtable<Book,EbookRating> varza){
        
        // display all books from collection 
        if (null != varza.get(album1)){        
            EbookRating curentRating1 = varza.get(album1);
            System.out.println("Pentru cartea cu titlul " + album1.getTitle() + " ratingul este: " + curentRating1.getStars() );
        }
        if (null != varza.get(album2)){        
            EbookRating curentRating2 = varza.get(album2);
            System.out.println("Pentru cartea cu titlul " + album2.getTitle() + " ratingul este: " + curentRating2.getStars() );
        }
        if (null != varza.get(album3)){        
            EbookRating curentRating3 = varza.get(album3);
            System.out.println("Pentru cartea cu titlul " + album2.getTitle() + " ratingul este: " + curentRating3.getStars() );
        }
        if (null != varza.get(novela1)){        
            EbookRating curentRating4 = varza.get(novela1);
            System.out.println("Pentru cartea cu titlul " + novela1.getTitle() + " ratingul este: " + curentRating4.getStars() );
        }
        if (null != varza.get(novela2)){        
            EbookRating curentRating5 = varza.get(novela2);
            System.out.println("Pentru cartea cu titlul " + novela2.getTitle() + " ratingul este: " + curentRating5.getStars() );
        }
        
    
    }
}
