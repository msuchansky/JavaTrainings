/*
 * Novel class extends class Book
 */
package library;

/**
 * Novel class extends class Book
 * @author mszuchan
 */
public class Novel extends Book {

    @Override
    public void showBookInfo() {
        System.out.println("Title of book: " + super.getTitle());
        System.out.println("Number of pages: " + super.getNumberOfPages());
        System.out.println("The ISBN: " + super.getIsbn());
        System.out.println("Novel type: " + type);
    }
    public enum NovelType {MISTERY, SF, HYSTORY,}; 
    
        private NovelType type;

    public Novel(NovelType type, String title, String isbn, int numberOfPages) {
        super(title, isbn, numberOfPages);
        this.type = type;
    }
        
        

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public NovelType getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(NovelType type) {
        this.type = type;
    }

}
