import enums.Gender;
import enums.Genre;
import models.*;
import service.BookService;
import service.LibraryService;
import service.ReaderService;
import service.serviceImpl.BookServiceImpl;
import service.serviceImpl.LibraryServiceImpl;
import service.serviceImpl.ReaderServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryService service = new LibraryServiceImpl();

        ArrayList<Library> libraries = new ArrayList<>(List.of(
                new Library(2L, "a2", "a2"),
                new Library(3L, "a3", "a3"),
                new Library(4L, "a4", "a4")));

        System.out.println(service.saveLibrary(libraries));

        System.out.println("Get all libraries");
        System.out.println(service.getAllLibraries());

        System.out.println("\nGet livrary by id");
        System.out.println(service.getLibraryById(1L));

        System.out.println("\nUpdate library by id");

        System.out.println("'\nDelete  libraries");
        System.out.println(service.deleteLibrary(1L));

        System.out.println("'\nGet all libraries");
        System.out.println(service.getAllLibraries());

        BookService bookService = new BookServiceImpl();

        ArrayList<Book> books = new ArrayList<>(List.of(
                new Book(1L, "Samanchynyn jolu", "Chyngyz Ayitmatov\n", Genre.DRAMA),
                new Book(2L, "Bely Parahod", "Chyngyz Ayitmatov\n", Genre.DRAMA),
                new Book(3L, "Jamilya", "Chyngyz Ayitmatov\n", Genre.DRAMA)));
        System.out.println(books);
        System.out.println("Save method book");
        System.out.println(bookService.saveBook(new Book(4L, "Kyzyl alma", "Chyngyz Ayitmatov", Genre.DRAMA)));
        System.out.println("GetAll method book");
        System.out.println(bookService.getAllBooks(2L));
        System.out.println("GetById method book");
        System.out.println(bookService.getBookById(1L, 2L));
        System.out.println("Delete method book");
        System.out.println(bookService.deleteBook(1L, 2L));
        System.out.println("Clear method book");
        System.out.println(bookService.clearBooksByLibraryId(1L));
        System.out.println("Reader");
        ReaderService readerService = new ReaderServiceImpl();
        ArrayList<Reader> readers = new ArrayList<>(List.of(
                new Reader(1L, "Ali1", "aliev1@gmail.com", "0999199661", Gender.MALE),
                new Reader(2L, "Ali2", "aliev2@gmail.com", "0999199662", Gender.MALE),
                new Reader(3L, "Ali3", "aliev3@gmail.com", "0999199663", Gender.MALE)));
        System.out.println(readers);
        System.out.println("Save method reader");
        System.out.println(readerService.saveReader(new Reader(4L, "ali4", "aliev4", "0999199664", Gender.MALE)));
        System.out.println("GetAll method reader");
        System.out.println(readerService.getAllReaders());
        System.out.println("GetById method reader");
        System.out.println(readerService.getReaderById(3L));
    }
}