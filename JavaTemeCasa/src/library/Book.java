/* 
* Class Book, superclass for ArtAlbum and Novel 
*/
package library;

/**
 *
 * @author mszuchan
 */
public abstract class Book {
    
    private String title;
    
    private String isbn;
    
    private int numberOfPages;

    public Book(String title, String isbn, int numberOfPages) {
        this.title = title;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
    }

    /**
     * Get the value of numberOfPages
     *
     * @return the value of numberOfPages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Set the value of numberOfPages
     *
     * @param numberOfPages new value of numberOfPages
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    /**
     * Get the value of isbn
     *
     * @return the value of isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Set the value of isbn
     *
     * @param isbn new value of isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Method shows information of book
     * 
     */
    public abstract void showBookInfo ();
    

}
