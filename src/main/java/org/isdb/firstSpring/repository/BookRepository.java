package org.isdb.firstSpring.repository;

import java.util.HashMap;
import java.util.Map;

import org.isdb.firstSpring.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	private final JdbcTemplate jdbcTemplate;
	private final SimpleJdbcInsert bookInsert;
	
	public BookRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
		
		this.bookInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("book_sb").usingGeneratedKeyColumns("id");
	}

	public int savedBook(Book book) {
		Map<String,Object> pm = new HashMap<>(); 
			pm.put("name", book.getName());
			pm.put("author_name", book.getAuthor_name());
			pm.put("price", book.getPrice());
		
			Number key = bookInsert.executeAndReturnKey(pm);
		return key.intValue();
	}

}
