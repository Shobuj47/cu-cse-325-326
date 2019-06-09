/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import library.cse.cu.librarymanagement.domain.Role;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Agent47
 */
public class RoleRowMapper implements RowMapper<Role>{

    @Override
    public Role mapRow(ResultSet rs, int i) throws SQLException {
        Role role = new Role();
        role.setId(rs.getInt("id"));
        role.setRolename(rs.getString("rolename"));
        return role;
    }
    
}
