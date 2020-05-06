package com.springcourse.example.spring5webexample.bootstrap;

import com.springcourse.example.spring5webexample.domain.Author;
import com.springcourse.example.spring5webexample.domain.Book;
import com.springcourse.example.spring5webexample.domain.Publisher;
import com.springcourse.example.spring5webexample.repository.AuthorRepository;
import com.springcourse.example.spring5webexample.repository.BookRepository;
import com.springcourse.example.spring5webexample.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BoootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BoootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author a1 = new Author("Bala","Pothuluri");
        Book b1 = new Book("Coding interview","123123123");
        Publisher p1 = new Publisher();
        p1.setCity("Austin");
        p1.setName("McGraw hill");
        p1.setState("TX");

        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);
        p1.getBooks().add(b1);
        authorRepository.save(a1);
        bookRepository.save(b1);
        publisherRepository.save(p1);

        Author a2 = new Author("Kishore","Potluri");
        Book b2 = new Book("Programming interview","123123123");
        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);
        p1.getBooks().add(b2);
        authorRepository.save(a2);
        bookRepository.save(b2);
        publisherRepository.save(p1);

        System.out.println("In the Bootstrap");
        System.out.println("Total books counts : "+bookRepository.count());
System.out.println("Total Publishers : "+publisherRepository.count());
    }
}
