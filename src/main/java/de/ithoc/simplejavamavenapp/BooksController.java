package de.ithoc.simplejavamavenapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class BooksController {


    @GetMapping("/books")
    public ResponseEntity<List<BookModel>> listAll() {
        System.out.println("listAll(): No args");

        return new ResponseEntity<>(Collections.emptyList(), HttpStatus.OK);
    }

    @PostMapping("/books")
    public ResponseEntity<Void> store(@RequestBody BookModel bookModel) {
        System.out.println("store(): bookModel = " + bookModel.toString());

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        System.out.println("remove(): id = " + id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<BookModel> find(@PathVariable Long id) {
        System.out.println("find(): id = " + id);

        BookModel bookModel = new BookModel();
        bookModel.setTitle("Zwischen Welten");
        bookModel.setAuthor("Juli Zeh");

        return new ResponseEntity<>(bookModel, HttpStatus.OK);
    }

}
