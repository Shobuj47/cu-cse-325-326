/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao.role;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.cse.cu.librarymanagement.dao.baseDAO;
import library.cse.cu.librarymanagement.domain.Role;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

/**
 *
 * @author Agent47
 */
public class roleDAOImpl extends baseDAO implements roleDAO {

    @Override
    public void saveRole(Role role) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery = " INSERT INTO `libmanagment`.`roles`" +
        "(`id`,	`rolename`)" +
        "VALUES (:id, :rolename );" ;
        Map m = new HashMap();
        m.put("id", role.getId());
        m.put("serialno", role.getRolename());
        
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getJdbcTemplate().update(sqlquery, ps, kh);
        Integer userId = kh.getKey().intValue();
        role.setId(userId);
    }

    @Override
    public void updateRole(Role role) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery = "UPDATE `libmanagment`.`roles` SET `id` = :id, `rolename` = :rolename  WHERE `id` = :id ;" ;
        Map m = new HashMap();
        m.put("id", role.getId());
        m.put("serialno", role.getRolename());
        
        getNamedParameterJdbcTemplate().update(sqlquery, m);
        
    }

    @Override
    public void deleteRole(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRole(Role book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> findALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> findByProperty(String propertyName, Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
