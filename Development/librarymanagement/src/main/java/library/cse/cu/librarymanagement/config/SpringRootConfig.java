/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
/**
 *
 * @author Agent47
 */

@Configuration
@ComponentScan(basePackages = {"library.cse.cu.librarymanagement.dao", "library.cse.cu.librarymanagement.services"})
public class SpringRootConfig {
 
    @Bean
    public BasicDataSource getDBConnection(){
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/libmanagment");
        bds.setUsername("root");
        bds.setPassword("");
        bds.setMaxTotal(10);
        bds.setInitialSize(1);
        bds.setTestOnBorrow(true);
        bds.setValidationQuery("Select 1");
        bds.setDefaultAutoCommit(true);
        return bds;
    }
    
    
}
