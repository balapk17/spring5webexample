package com.springcourse.example.spring5webexample.repository;

import com.springcourse.example.spring5webexample.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
