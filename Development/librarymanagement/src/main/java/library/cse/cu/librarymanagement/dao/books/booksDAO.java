/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao.books;

import java.util.List;
import library.cse.cu.librarymanagement.domain.Book;
/**
 *
 * @author Agent47
 */
public interface booksDAO {
    public void saveBook(Book u);
    public void updateBook(Book u);
    public void deleteBook(int id);
    public void deleteBook(Book book);
    public Book findById(Integer id);
    public List<Book> findALL();
    public List<Book> findByProperty(String propertyName, Object obj);
}
