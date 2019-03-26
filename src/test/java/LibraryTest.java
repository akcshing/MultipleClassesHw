import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Book1","Author1", "Genre1");
        book2 = new Book("Book2","Author2", "Genre2");
        book3 = new Book("Book3","Author3", "Genre3");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canCheckIfFull(){
        library.addBook(book1);
        assertEquals(false, library.checkIfFull());
        library.addBook(book2);
        assertEquals(true, library.checkIfFull());
    }

    @Test
    public void doesNotAddBookIfFullCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(0, library.countBooks());
    }
}
