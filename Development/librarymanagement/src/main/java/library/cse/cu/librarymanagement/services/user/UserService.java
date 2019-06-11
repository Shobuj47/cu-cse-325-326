/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.services.user;
import java.util.List;
import library.cse.cu.librarymanagement.domain.Users;
import library.cse.cu.librarymanagement.exceptions.UserBlockedException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Agent47
 */
public interface UserService {
    
    
    /**
     * User Registration Method. This Method takes a User object to save into the database
     * @param user 
     */
    public void RegisterUser(Users user);
    
    /**
     * Login Method returns a User Object if the authentication is success. Otherwise returns null if failed
     * @param username
     * @param password
     * @return 
     * @throws library.cse.cu.librarymanagement.exceptions.UserBlockedException 
     */
    public Users login(String username, String password) throws UserBlockedException;
    
    /**
     * Returns a List of All User
     * @return 
     */
    public List<Users> getAllUser();
    
    /**
     * Change a User Status if a user is able to login or not
     * @param userid
     * @param loginstatus 
     */
    public void changeLoginStatus(int userid, int loginstatus);
    
}
