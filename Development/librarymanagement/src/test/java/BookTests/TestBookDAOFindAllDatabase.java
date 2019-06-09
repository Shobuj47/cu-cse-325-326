package BookTests;

import library.cse.cu.librarymanagement.config.SpringRootConfig;
import library.cse.cu.librarymanagement.dao.books.booksDAO;
import library.cse.cu.librarymanagement.domain.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.lang.reflect.Field;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agent47
 */
public class TestBookDAOFindAllDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        booksDAO bookdao=ctx.getBean(booksDAO.class);
        
        
        List<Book> book = bookdao.findALL();
        
        for(Book b : book ){
        if (book != null){
            for (Field field : b.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(b);
                System.out.printf("%s: %s%n", name, value);
            }
        }else {
            System.out.println("User Not Found by id " + b.getId());
        }
        }
    }
    
}
