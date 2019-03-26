import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        book = new Book("Book1","Author1", "Genre1");
        library = new Library(5);
        borrower = new Borrower();
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.collectionCount());
    }
}
