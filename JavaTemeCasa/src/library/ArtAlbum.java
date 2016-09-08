/*
 *  ArtAlbum class extends class Book
 */
package library;

/**
 * ArtAlbum class extends class Book
 * @author mszuchan
 * 
 */
public class ArtAlbum extends Book {

    public ArtAlbum(PaperQuality pq, String title, String isbn, int numberOfPages) {
        super(title, isbn, numberOfPages);
        paperQuality = pq;
        
    }

    @Override
    public void showBookInfo() {
        System.out.println("Title of book: " + super.getTitle());
        System.out.println("Number of pages: " + super.getNumberOfPages());
        System.out.println("The ISBN: " + super.getIsbn());
        System.out.println("Paper quality : " + paperQuality );
    }
    public enum PaperQuality { GLOSSY, REGULAR, LAMINATED };
    
        private PaperQuality paperQuality;

    /**
     * Get the value of paperQuality
     *
     * @return the value of paperQuality
     */
    public PaperQuality getPaperQuality() {
        return paperQuality;
    }

    /**
     * Set the value of paperQuality
     *
     * @param paperQuality new value of paperQuality
     */
    public void setPaperQuality(PaperQuality paperQuality) {
        this.paperQuality = paperQuality;
    }
 
}
