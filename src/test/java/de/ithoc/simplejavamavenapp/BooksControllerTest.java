package de.ithoc.simplejavamavenapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooksControllerTest {


    @Test
    public void addBook() {
        BookModel bookModel = new BookModel();
        bookModel.setAuthor("Juli Zeh");
        bookModel.setTitle("Zwischen Welten");

        BooksController booksController = new BooksController();
        booksController.returnBook(bookModel);

        BookModel zwischenWelten = booksController.lendBook("Zwischen Welten");

        Assertions.assertEquals("Zwischen Welten", zwischenWelten.getTitle());
    }


}
