package org.isdb.firstSpring.controller;


import org.isdb.firstSpring.model.Book;
import org.isdb.firstSpring.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController {
	private BookService service;
	
	public BookController( BookService service) {
		this.service =service;
	} 
	
	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		Book saved = service.saveBook(book);
		return saved;
	}

}
