package org.isdb.firstSpring.service;

import java.util.List;
import java.util.Optional;

import org.isdb.firstSpring.dto.BookDTO;

import org.isdb.firstSpring.model.Book;
import org.isdb.firstSpring.model.StudentClass;

import org.isdb.firstSpring.repository.BookRepository;

import org.springframework.stereotype.Service;

@Service
public class BookService {

   private final BookRepository bookRepository;

    private final StudentClassService StudentClassService;


    public BookService(BookRepository bookRepository,StudentClassService studentClassService) {

        this.bookRepository = bookRepository;
        this.StudentClassService = studentClassService;
       
    }


    public Book saveBook(BookDTO bookDTO) {
      Integer classId = bookDTO.getClazzId();
      StudentClass clazz = StudentClassService.getStudentClass(classId);
     
      Book book = new Book();
      book.setName(bookDTO.getName());
      book.setAuthor(bookDTO.getAuthor());
      book.setPublisher(bookDTO.getPublisher());
      if (clazz != null)
      book.setClazz(clazz);

      return bookRepository.save(book);
        
    }

    public List<Book> getAllBook;

   

    public void deleteBook(Integer id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }

    public Book updateBook(Integer id, Book book) {
        Optional<Book> bookById = bookRepository.findById(id);

        if(bookById.isPresent()) {
            Book aBook = new Book();
            if (book .getName() != null) {
                aBook.setName(book.getName());
            }
            if (book .getAuthor() != null) {
                aBook.setAuthor(book.getAuthor());
            }
            if (book .getPublisher() != null) {
                aBook.setPublisher(book.getPublisher());
            }
            if (book .getClazz() != null) {
                Integer classId = book.getClazz().getId();
                StudentClass clazz = StudentClassService.getStudentClass(classId);
                if (clazz == null) {
                    throw new IllegalArgumentException("Class not found");
                }
                aBook.setClazz(clazz);
            }
            return bookRepository.save(aBook);

        } else {
            throw new IllegalArgumentException("book not found");
        }
    }
       

   

    public List<Book> getAllBook() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getAllBook'");
    }

    public Book getBook(Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'getBook'");
    }
    
}
