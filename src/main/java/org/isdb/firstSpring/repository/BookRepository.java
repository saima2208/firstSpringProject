package org.isdb.firstSpring.repository;

import org.isdb.firstSpring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

    
} 
    

