package ru.kasamael.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kasamael.model.jpa.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
