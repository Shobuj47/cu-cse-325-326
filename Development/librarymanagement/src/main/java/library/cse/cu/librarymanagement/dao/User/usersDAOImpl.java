/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.component.UpdateModelException;
import library.cse.cu.librarymanagement.dao.baseDAO;
import library.cse.cu.librarymanagement.domain.Users;
import library.cse.cu.librarymanagement.rowmapper.UserRowMapper;
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
        String sqlquery = " INSERT INTO `libmanagment`.`users` "
                + "(`username`, `password`, `fname`, `lname`, `email`, `address`, `cardno`, "
                + "`birthdate`, `role`, `valid`, `validity`, `maxbookcount`, `borrowedbookcount`, `lastlogin`, `lastupdated`) 	"
                + "VALUES (:username, :password, :fname, :lname, :email, :address, :cardno, :birthdate, :role, :valid, "
                + ":validity, :maxbookcount, :borrowedbookcount, :lastlogin, :lastupdated 	); " ;
        Map m = new HashMap();
        m.put("username", u.getUsername());
        m.put("password", u.getPassword());
        m.put("fname", u.getFname());
        m.put("lname", u.getLname());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress());
        m.put("cardno", u.getCardno());
        m.put("birthdate", u.getBirthdate());
        m.put("role", u.getRole());
        m.put("valid", u.getValid());
        m.put("validity", u.getValidity());
        m.put("maxbookcount", u.getMaxbookcount());
        m.put("borrowedbookcount", u.getBorrowedbookcount());
        m.put("lastlogin", u.getLastlogin());
        m.put("lastupdated", u.getLastupdated());
        
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        
        super.getNamedParameterJdbcTemplate().update(sqlquery, ps, kh);
        
        
        Integer userId = kh.getKey().intValue();
        u.setId(userId);
        
        
        
    }

    @Override
    public void updateUser(Users u) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery = "UPDATE `libmanagment`.`users` SET" +
        " `id` = :id, `username` = :username, `password` = :password, `fname` = :fname, `lname` = :lname, `email` = :email, " +
        " `address` = :address, `cardno` = :cardno, `birthdate` = :birthdate, `role` = :role, `valid` = :valid, `validity` = :validity, " +
        " `maxbookcount` = :maxbookcount, `borrowedbookcount` = :borrowedbookcount, `lastlogin` = :lastlogin, `lastupdated` = :lastupdated " +
        " WHERE " +
        " `id` = :id ;";
        Map m = new HashMap();
        m.put("username", u.getUsername());
        m.put("password", u.getPassword());
        m.put("fname", u.getFname());
        m.put("lname", u.getLname());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress());
        m.put("cardno", u.getCardno());
        m.put("birthdate", u.getBirthdate());
        m.put("role", u.getRole());
        m.put("valid", u.getValid());
        m.put("validity", u.getValidity());
        m.put("maxbookcount", u.getMaxbookcount());
        m.put("borrowedbookcount", u.getBorrowedbookcount());
        m.put("lastlogin", u.getLastlogin());
        m.put("lastupdated", u.getLastupdated());
        m.put("id", u.getId());
        getNamedParameterJdbcTemplate().update(sqlquery, m);
        
    }

    /*
    Delete User by User Id
    */
    @Override
    public void deleteUser(int userId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery = "DELETE FROM `libmanagment`.`users` WHERE `id` = ? ;";
        try{
            getJdbcTemplate().update(sqlquery, userId);      
        } catch (UpdateModelException ex){
            System.out.println("Error : " + ex);
        }
    }
    
    /*
    Delete User by User Object
    */
    @Override
    public void deleteUser(Users user){
        this.deleteUser(user.getId());
    }
    
    @Override
    public Users findById(Integer id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery="SELECT 	`id`, `username`, `password`, `fname`, `lname`, `email`, " +
                "`address`, `cardno`, `birthdate`, `role`, `valid`, `validity`, `maxbookcount`, " +
                "`borrowedbookcount`, `lastlogin`, `lastupdated`\n" +
                " FROM `libmanagment`.`users` WHERE `id`=?;";
        
        Users user = getJdbcTemplate().queryForObject(sqlquery, new UserRowMapper(), id);
        
        return user;
    }

    @Override
    public List<Users> findALL() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery="SELECT 	`id`, `username`, `password`, `fname`, `lname`, `email`, `address`, "
                + "`cardno`, `birthdate`, `role`, `valid`, `validity`, `maxbookcount`, `borrowedbookcount`, "
                + "`lastlogin`, `lastupdated` FROM `libmanagment`.`users`;";
        List<Users> userList = getJdbcTemplate().query(sqlquery, new UserRowMapper());
        return userList;
    }

    @Override
    public List<Users> findByProperty(String propertyName, Object obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query="SELECT 	`id`, `username`, `password`, `fname`, `lname`, `email`, `address`, "
                + "`cardno`, `birthdate`, `role`, `valid`, `validity`, `maxbookcount`, `borrowedbookcount`, "
                + "`lastlogin`, `lastupdated` FROM `libmanagment`.`users` WHERE "+ propertyName +"=?";
        List<Users> userList = getJdbcTemplate().query(query, new UserRowMapper(), obj);
        return userList;
    }
    
}
