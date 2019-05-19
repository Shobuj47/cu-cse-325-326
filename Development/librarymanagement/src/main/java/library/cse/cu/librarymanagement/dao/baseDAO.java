/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 *
 * @author Agent47
 */
//NOTE: 
abstract public class baseDAO extends NamedParameterJdbcDaoSupport {
    @Autowired
    public void setDefaultDataSource(DataSource ds){
        super.setDataSource(ds);
    }
    
}
