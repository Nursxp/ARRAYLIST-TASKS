package service.serviceImpl;

import models.Book;
import models.Database;
import service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Override
    public Book saveBook(Book book) {
        Database.books.add(book);
        return null;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {

        return Database.books;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        Database.books.addAll(Database.books);
        for (Book book : Database.books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        Database.books.remove(bookId);
        return "Успешно удален: " + bookId;
    }

    @Override
    public boolean clearBooksByLibraryId(Long libraryId) {
        Database.books.clear();
        return libraryId != null;
    }

    @Override
    public String toString() {
        return "BookServiceImpl{}";
    }
}
