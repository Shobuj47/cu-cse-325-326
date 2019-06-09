package BookTests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class TestBookDAOSaveDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        booksDAO bookDao=ctx.getBean(booksDAO.class);
        
        Book book =new Book();
        book.setBookname("Systems Analysis Design UML Version 1.0 ");
        book.setSerialno("4DE2A978D");
        book.setPublishername("John Wiley & Sons");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date pdate =  sdf.parse("2005-05-01");
        book.setPublishdate(pdate);
   
        bookDao.saveBook(book);
        System.out.println("Book Saved");
    }
    
}
