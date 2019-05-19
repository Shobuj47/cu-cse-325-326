/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.cse.cu.librarymanagement.dao.baseDAO;
import library.cse.cu.librarymanagement.domain.Users;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Agent47
 */
@Repository
public class usersDAOImpl extends baseDAO implements usersDAO{

    @Override
    public void saveUser(Users u) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query = " INSERT INTO `libmanagment`.`users` "
                + "(`username`, `password`, `fname`, `lname`, `email`, `address`, `cardno`, "
                + "`birthdate`, `valid`, `validity`, `maxbookcount`, `borrowedbookcount`, `lastlogin`, `lastupdated`) 	"
                + "VALUES (:username, :password, :fname, :lname, :email, :address, :cardno, :birthdate, :valid, "
                + ":validity, :maxbookcount, :borrowedbookcount, :lastlogin, :lastupdated 	); " ;
        Map m = new HashMap();
        m.put("username", u.getUsername());
        m.put("password", u.getPassword());
        m.put("fname", u.getFname());
        m.put("lname", u.getLname());
        m.put("email", u.getEmail());
        m.put("cardno", u.getCardno());
        m.put("birthdate", u.getBirthdate());
        m.put("valid", u.getValid());
        m.put("validity", u.getValidity());
        m.put("maxbookcount", u.getMaxbookcount());
        m.put("borrowedbookcount", u.getBorrowedbookcount());
        m.put("lastlogin", u.getLastlogin());
        m.put("lastupdated", u.getLastupdated());
        
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        
        super.getNamedParameterJdbcTemplate().update(query, ps, kh);
        
        
        Integer userId = kh.getKey().intValue();
        u.setId(userId);
        
        
        
    }

    @Override
    public void updateUser(Users u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser(Users u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Users findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> findALL(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> findByProperty(String propertyName, Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
