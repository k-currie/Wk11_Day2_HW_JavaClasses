import com.sun.xml.internal.ws.api.databinding.ClientCallBridge;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book = new Book();
    }

    @Test
    public void canGetCollectionCount(){
       assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addToCollection(book);
        assertEquals(1, borrower.getCollectionCount());
    }

    @Test
    public void canCheckOutBookAndAddToCollection(){
        borrower.checkoutBook(library);
        assertEquals(1, borrower.getCollectionCount());
    }


}
