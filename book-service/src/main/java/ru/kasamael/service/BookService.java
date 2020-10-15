package ru.kasamael.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kasamael.model.jpa.Book;
import ru.kasamael.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
