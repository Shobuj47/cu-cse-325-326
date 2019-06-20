/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.services.book;

import library.cse.cu.librarymanagement.domain.Book;
import library.cse.cu.librarymanagement.exceptions.BookNotAvailableException;

/**
 *
 * @author Agent47
 */
public interface BookService {
    
    
    public void addBook(Book book);
    public void borrowBook() throws BookNotAvailableException;
    public void reciveBook();
    
}
