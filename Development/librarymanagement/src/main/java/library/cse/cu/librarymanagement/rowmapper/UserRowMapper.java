/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import library.cse.cu.librarymanagement.domain.Users;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Agent47
 */
public class UserRowMapper implements RowMapper<Users>{

    @Override
    public Users mapRow(ResultSet rs, int i) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Users user = new Users();
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("username"));
        user.setFname(rs.getString("fname"));
        user.setLname(rs.getString("lname"));
        user.setEmail(rs.getString("email"));
        user.setAddress(rs.getString("address"));
        user.setCardno(rs.getString("cardno"));
        user.setBirthdate(rs.getDate("birthdate"));
        user.setValid(rs.getInt("valid"));
        user.setValidity(rs.getDate("validity"));
        user.setMaxbookcount(rs.getInt("maxbookcount"));
        user.setBorrowedbookcount(rs.getInt("borrowedbookcount"));
        user.setLastlogin(rs.getDate("lastlogin"));
        user.setLastupdated(rs.getDate("lastupdated"));
        
        return user;
    }
    
}
