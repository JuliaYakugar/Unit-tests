package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    BookRepository mockedBookRepository;
    BookService bookService;
    @BeforeEach
    void initialization() {
        mockedBookRepository = mock(BookRepository.class);
        bookService = new BookService(mockedBookRepository);
    }
    @Test
    void testBookServiceFindBookById() {
        bookService.findBookById("001");
        verify(mockedBookRepository).findById("001");
    }

    @Test
    void testBookService() {
        bookService.findAllBooks();
        verify(mockedBookRepository).findAll();
    }
}