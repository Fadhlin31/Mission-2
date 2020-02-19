package CRUDMissionTwo.demo;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private List<Book> BookList = new ArrayList<>(Arrays.asList());

    public List<Book> getAllBooksList() {

        return BookList;

    }

    public Book getBook(Integer bookID) {

        return BookList.stream()
                .filter(book -> book.getBookID().equals(bookID)).findFirst().get();

    }

    public void addBook(Book book) {

        BookList.add(book);

    }

    public void updateBook(Book book, Integer bookID) {

        int counter = 0;
        for (Book bookUpdate: BookList) {

            if (bookUpdate.getBookID().equals(bookID)) {
                BookList.set(counter, book);

            }
            counter++;
        }
    }

    public void deleteBook(Integer bookID) {

        BookList.removeIf(book -> book.getBookID().equals(bookID));

    }
}


