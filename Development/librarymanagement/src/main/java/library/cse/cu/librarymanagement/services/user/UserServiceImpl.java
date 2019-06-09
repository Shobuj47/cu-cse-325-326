/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.services.user;

import java.util.List;
import library.cse.cu.librarymanagement.dao.User.usersDAO;
import library.cse.cu.librarymanagement.dao.baseDAO;
import library.cse.cu.librarymanagement.domain.Users;
import library.cse.cu.librarymanagement.exceptions.UserBlockedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Agent47
 */
@Service
public class UserServiceImpl extends baseDAO implements UserService{
    
  @Autowired 
  private usersDAO userdao;
    
    @Override
    public void RegisterUser(Users user) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        userdao.saveUser(user);
    }

    @Override
    public Users login(String username, String password) throws UserBlockedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> getAllUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeLoginStatus(int userid, int loginstatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
