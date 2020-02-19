package CRUDMissionTwo.demo;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService booksService;

    @RequestMapping("/books")
    public List<Book> allBooks() {

        return booksService.getAllBooksList();
    }

    @GetMapping("/books/{bookID}")
    public Book getBook(@PathVariable("bookID") Integer bookID) {

        return booksService.getBook(bookID);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {

        booksService.addBook(book);
    }

    @PutMapping("/books/{bookID}")
    public void updateBook(@RequestBody Book book, @PathVariable("bookID") Integer bookID) {

        booksService.updateBook(book, bookID);
    }

    @DeleteMapping ("/books/{bookID}")
    public void deleteBook(@PathVariable("bookID") Integer bookID) {

        booksService.deleteBook(bookID);
    }
}
