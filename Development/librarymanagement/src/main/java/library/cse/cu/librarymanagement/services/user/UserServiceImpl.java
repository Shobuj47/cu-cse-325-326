/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.services.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.cse.cu.librarymanagement.dao.User.usersDAO;
import library.cse.cu.librarymanagement.dao.baseDAO;
import library.cse.cu.librarymanagement.domain.Users;
import library.cse.cu.librarymanagement.exceptions.UserBlockedException;
import library.cse.cu.librarymanagement.rowmapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
        userdao.saveUser(user);
    }

    @Override
    public Users login(String username, String password) throws UserBlockedException {
       String userquery = "SELECT 	`id`,  `username`,  `fname`,  `lname`,  `email`,  `address`,  `cardno`,  "
               + "`birthdate`, `role`,  `valid`,  `validity`,  `maxbookcount`,  `borrowedbookcount`,  `lastlogin`,  `lastupdated`   "
               + "FROM  `libmanagment`.`users`  "
               + "WHERE `username` = :usr AND `password` = :pwd ;";
       Map m = new HashMap();
       m.put("usr", username);
       m.put("pwd", password);
       
       try {
       Users u = getNamedParameterJdbcTemplate().queryForObject(userquery, m, new UserRowMapper());
       if (u.getValid() == 1){
           return u;
       } else {
           throw new UserBlockedException("User Account is blocked. Please Contact to System Administrator");
       }
       } catch (EmptyResultDataAccessException ex) {
           return null;
       }
    
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
