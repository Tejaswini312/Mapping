package com.example.OnetoOneSpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface BookRepository extends JpaRepository<Book, String>{
  public Book findByBookId(int bookId);
}
