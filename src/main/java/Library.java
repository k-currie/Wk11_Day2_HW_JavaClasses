import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library() {
        this.capacity = 4;
        this.stock = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (getBookCount() < this.capacity) {
            this.stock.add(book);
        }
    }

    public Book removeBookFromStock(){
        Book removedBook = null;
        if (getBookCount() > 0){
           removedBook = this.stock.remove(0);
        }
        return removedBook;
    }

//    public Book removeBook(){
//            return this.stock.remove(0);
//        }

}
