package UserTests;

import library.cse.cu.librarymanagement.config.SpringRootConfig;
import library.cse.cu.librarymanagement.dao.User.usersDAO;
import library.cse.cu.librarymanagement.domain.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.lang.reflect.Field;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agent47
 */
public class TestUserDAOFindByIdDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        usersDAO usrDao=ctx.getBean(usersDAO.class);
        Users user =new Users();
        user.setId(2);
        
        
        user = usrDao.findById(user.getId());
        if (user != null){
            for (Field field : user.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(user);
            System.out.printf("%s: %s%n", name, value);
        }
        }else {
            System.out.println("User Not Found by id " + user.getId());
        }
    }
    
}
