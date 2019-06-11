/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Agent47
 */
@Controller
public class UserController {
    @RequestMapping(value = {"/", "/index", "/login"})
    public String index(){
        return "login";
    }
    
    @RequestMapping(value = {"/admin/dashboard", "/admin"})
    public String adminDashboard(){
        return "admin_dashboard";
    }
    @RequestMapping(value = {"/user/dashboard", "/user"})
    public String userDashboard(){
        return "user_dashboard";
    }   
    
    
    
    
}
