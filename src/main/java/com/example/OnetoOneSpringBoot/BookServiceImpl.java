package com.example.OnetoOneSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		Story story=book.getStory();
		story.setBook(book);
		book=bookRepository.save(book);
		
		return book;
	}

	@Override
	public Book finByBookId(int bookId) {
		Book book=bookRepository.findByBookId(bookId);
		return book;
	}

}
