package com.example.OnetoOneSpringBoot;

import org.springframework.stereotype.Component;


public interface BookService {
	public Book saveBook(Book book);
	public Book finByBookId(int bookId);

}
