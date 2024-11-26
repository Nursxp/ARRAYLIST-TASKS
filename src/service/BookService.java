package service;

import models.Book;

import java.util.List;

public interface BookService {
    Book saveBook( Book book);

    List<Book> getAllBooks(Long libraryId);

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    boolean clearBooksByLibraryId(Long libraryId);
}
