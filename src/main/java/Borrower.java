import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int getCollectionCount() {
        return this.collection.size();
    }

    public void addToCollection(Book book){
        this.collection.add(book);
    }

    public void checkoutBook(Library library) {
        Book removedBook = library.removeBookFromStock();
        this.addToCollection(removedBook);
    }

}
