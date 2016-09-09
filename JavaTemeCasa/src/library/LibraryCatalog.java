/*
 * Class LibraryCatalog manages the list of books adding, deleting, and showing
 * the content of the list of books 
 */
package library;

import java.util.LinkedList;

/**
 * Class LibraryCatalog manages the list of books adding, deleting, and showing
 * the content of the list of books 
 * @author mszuchan
 */
public class LibraryCatalog {
    
        private LinkedList listOfBooks = new LinkedList();

    /**
     * Get the value of listOfBooks
     *
     * @return the value of listOfBooks
     */
    public LinkedList getListOfBooks() {
        return listOfBooks;
    }

    /**
     * Set the value of listOfBooks
     *
     * @param listOfBooks new value of listOfBooks
     */
    public void setListOfBooks(LinkedList listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    /**
     * Add a book in the list of books 
     * @param carteNoua
    */
    public void addBook(Book carteNoua) {
        
        listOfBooks.add(carteNoua);
    }
    
    /**
     * Delete a book in the list of books 
     * @param carteExistenta
    */
    public void deleteBook(Book carteExistenta) {
        
        listOfBooks.remove(carteExistenta);
    }
    
    /**
     * Display info for all books in the list of books 
     * 
    */
    
    public void displayAllBooks(){
    
        Book actualBook;
        
        for (int i=0; i<listOfBooks.size() ;i++ ){
        
            actualBook = (Book)listOfBooks.get(i);
            actualBook.showBookInfo();
        }
    }
    
}
