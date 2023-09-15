package com.example.OnetoOneSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/savebook")
	public Book saveBook(@RequestBody Book book) {
		Book bookResponse=bookService.saveBook(book);
		return bookResponse;
	}
	
	@GetMapping("/bookId")
	public Book getBookById(@PathVariable int bookId) {
		Book bookResponse=bookService.finByBookId(bookId);
		return bookResponse;
	}

}
