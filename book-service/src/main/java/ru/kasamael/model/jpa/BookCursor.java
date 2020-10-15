package ru.kasamael.model.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class BookCursor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer currentPage;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
