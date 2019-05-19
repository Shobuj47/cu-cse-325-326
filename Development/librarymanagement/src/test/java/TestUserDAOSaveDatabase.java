
import library.cse.cu.librarymanagement.config.SpringRootConfig;
import library.cse.cu.librarymanagement.dao.User.usersDAO;
import library.cse.cu.librarymanagement.domain.Users;
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
public class TestUserDAOSaveDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        usersDAO usrDao=ctx.getBean(usersDAO.class);
        Users user =new Users();
        user.setUsername("manik");
        user.setPassword("123");
        
        usrDao.saveUser(user);
        System.out.println("User Saved");
    }
    
}
