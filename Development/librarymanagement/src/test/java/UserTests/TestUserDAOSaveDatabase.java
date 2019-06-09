package UserTests;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                user.setUsername("Mehedi");
        user.setPassword("admin");
        user.setAddress("Dhaka");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date bdate =  new Date();
        try {
            bdate = sdf.parse("2000-01-01");
        } catch (ParseException ex) {
            Logger.getLogger(TestUserServiceSaveDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        user.setBirthdate(bdate);
        user.setBorrowedbookcount(0);
        user.setCardno("56A6545D");
        user.setEmail("mehedi@bd.com");
        user.setFname("Mehedi hasan");
        user.setLname("Shobuj");
        Date logindate = new Date();
        user.setLastlogin(logindate);
        
        
        
        usrDao.saveUser(user);
        System.out.println("User Saved");
    }
    
}
