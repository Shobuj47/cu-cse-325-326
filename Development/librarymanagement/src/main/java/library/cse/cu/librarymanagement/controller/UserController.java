/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import library.cse.cu.librarymanagement.commands.UserLoginCommand;
import library.cse.cu.librarymanagement.domain.Users;
import library.cse.cu.librarymanagement.exceptions.UserBlockedException;
import library.cse.cu.librarymanagement.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Agent47
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value = {"/", "/index"})
    public String index(Model m){
        m.addAttribute("loginrequest", new UserLoginCommand());
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginHandler(@ModelAttribute("loginrequest") UserLoginCommand cmd, Model m, HttpSession session){
        
        try {
            Users user = userService.login(cmd.getUsername(), cmd.getPassword());
            if (user != null){
                System.out.println("################################################################");
                System.out.println("User"+ user.getUsername().toString() +" Found Detecting Role " + user.getRole().toString());
                System.out.println("################################################################");
                switch (user.getRole()) {
                    case "Admin":
                        addUserSession(user, session);
                        return "redirect:admin/dashboard";
                    case "Teacher":
                        addUserSession(user, session);
                        return "redirect:user/dashboard";
                    case "Student":
                        addUserSession(user, session);
                        return "redirect:user/dashboard";
                    default:
                        m.addAttribute("err", "This user have an Invalid Role.");
                        return "login";
                }
                //return "redirect:admin/dashboard";
            }else{
                m.addAttribute("err", "Invalid Username or Password");
                return "login";
            } 
        } catch (UserBlockedException ex) {
            m.addAttribute("err", ex);
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return "login";
        }
        
    }
    
    private void addUserSession(Users u, HttpSession session){
        session.setAttribute("user", u);
        session.setAttribute("uid", u.getId());
        session.setAttribute("fname", u.getFname());
        session.setAttribute("lname", u.getLname());
        session.setAttribute("role", u.getRole());
    }
    
    private void destoryUserSession(HttpSession session){
        session = null;
    }
    
    @RequestMapping(value = {"/logout"})
    public String userLogut(HttpSession session){
        session.invalidate();
        return "redirect:index?action=logout";
    }
    
    @RequestMapping(value = {"/admin/dashboard", "/admin"})
    public String adminDashboard(){
        return "admin/admin_dashboard";
    }
    
    
    
    @RequestMapping(value = {"/user/dashboard", "/user"})
    public String userDashboard(){
        return "user/user_dashboard";
    }   
    
    
    
    
}
