import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibraryStock(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canStopBookBeingAddedIfCapacityIsMet(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.getBookCount());
    }

    @Test
    public void canRemoveBookIfStockIsGreaterThan0(){
        library.addBook(book);
        library.addBook(book);
        library.removeBookFromStock();
        assertEquals(1, library.getBookCount());
    }



}
