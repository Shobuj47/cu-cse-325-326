/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao.User;
import java.util.List;
import library.cse.cu.librarymanagement.domain.Users;
/**
 *
 * @author Agent47
 */
public interface usersDAO {
    
    public void saveUser(Users u);
    public void updateUser(Users u);
    public void deleteUser(Users user);
    public void deleteUser(int userId);
    public Users findById(Integer id);
    public List<Users> findALL();
    public List<Users> findByProperty(String propertyName, Object obj);
}
