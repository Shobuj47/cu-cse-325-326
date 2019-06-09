package BookTests;

import library.cse.cu.librarymanagement.config.SpringRootConfig;
import library.cse.cu.librarymanagement.dao.books.booksDAO;
import library.cse.cu.librarymanagement.domain.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agent47
 */
public class TestBookDAODeleteDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        booksDAO bookDao=ctx.getBean(booksDAO.class);
        Book book =new Book();
        book .setId(2);
        bookDao.deleteBook(book );
        System.out.println("Book "+ book .getId()+" Deleted");
    }
    
}
