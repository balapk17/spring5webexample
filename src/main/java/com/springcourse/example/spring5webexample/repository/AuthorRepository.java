package com.springcourse.example.spring5webexample.repository;

import com.springcourse.example.spring5webexample.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
