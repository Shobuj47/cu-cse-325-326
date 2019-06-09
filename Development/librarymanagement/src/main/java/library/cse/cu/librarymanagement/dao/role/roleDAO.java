/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao.role;
import java.util.List;
import library.cse.cu.librarymanagement.domain.Role;
/**
 *
 * @author Agent47
 */
public interface roleDAO {
    
    public void saveRole(Role role);
    public void updateRole(Role role);
    public void deleteRole(int id);
    public void deleteRole(Role book);
    public Role findById(Integer id);
    public List<Role> findALL();
    public List<Role> findByProperty(String propertyName, Object obj);
    
}
