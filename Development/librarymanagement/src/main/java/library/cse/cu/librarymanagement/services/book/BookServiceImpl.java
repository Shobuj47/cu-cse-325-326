/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.services.book;

import library.cse.cu.librarymanagement.dao.baseDAO;
import library.cse.cu.librarymanagement.dao.books.booksDAO;
import library.cse.cu.librarymanagement.domain.Book;
import library.cse.cu.librarymanagement.exceptions.BookNotAvailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Agent47
 */
@Service
public class BookServiceImpl extends baseDAO implements BookService {
    
    @Autowired
    booksDAO bookdao;
    
    
    @Override
    public void borrowBook() throws BookNotAvailableException {
       
    }

    @Override
    public void reciveBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBook(Book book) {
        bookdao.saveBook(book);
    }
    
    
    
    
    
}
