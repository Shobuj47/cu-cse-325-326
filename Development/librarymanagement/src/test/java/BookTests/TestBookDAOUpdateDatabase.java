package BookTests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class TestBookDAOUpdateDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        booksDAO bookdao=ctx.getBean(booksDAO.class);
        Book book =new Book();
        book.setId(2);
        book.setBookname("Systems Analysis Design UML Version 1.1 ");
        book.setPublishername("John Wiley");
        book.setSerialno("4DE2A978F");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date pdate =  new Date();
        try {
            pdate = sdf.parse("2005-05-05");
        } catch (ParseException ex) {
            Logger.getLogger(TestBookDAOSaveDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        book.setPublishdate(pdate);
        
        bookdao.updateBook(book);
        System.out.println("Book Updated");
    }
    
}
