import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if (!this.checkIfFull()) {
            this.stock.add(book);
        }
    }

    public boolean checkIfFull(){
        return (this.stock.size() >= this.capacity);
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }
}
