package ru.kasamael.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kasamael.model.jpa.Book;
import ru.kasamael.service.BookService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookstore/")
public class BookController {

    private final BookService bookService;

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(Book book) {
        return bookService.createBook(book);
    }

    @PutMapping
    public Book updateBook(Book book) {
        return bookService.createBook(book);
    }

    @DeleteMapping
    public void deleteBook(Long id) {
        bookService.deleteBook(id);
    }
}
