package org.isdb.firstSpring.service;

import org.isdb.firstSpring.model.Book;
import org.isdb.firstSpring.repository.BookRepository;
import org.springframework.stereotype.Service;
@Service
public class BookService {
	
	private final BookRepository repository;
	
	public BookService(BookRepository repository) {
		this.repository=repository;
	}

	public Book saveBook(Book book) {
		 int saveAll = repository.savedBook(book);
	
		return null;
	}
	
	

}
