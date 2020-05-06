package com.springcourse.example.spring5webexample.repository;

import com.springcourse.example.spring5webexample.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
