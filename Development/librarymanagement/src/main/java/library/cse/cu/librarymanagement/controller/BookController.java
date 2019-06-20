/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.controller;

import library.cse.cu.librarymanagement.commands.BookCommand;
import library.cse.cu.librarymanagement.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Agent47
 */

@Controller
public class BookController {
    
    @Autowired
    BookService bookservice;
        
    @RequestMapping(value = "book/addBook")
    public String addBook(Model m){
        BookCommand cmd = new BookCommand();
         m.addAttribute("cmdSaveNewBook", cmd);
        return "book/addBook";
    }
    
    @RequestMapping(value = "book/saveNewBook")
    public String saveBook(@ModelAttribute("cmdSaveNewUser") BookCommand cmd, Model m){
       if (cmd.getBook() != null){
           System.out.println("savebook : Book Found " + cmd.getBook().getBookname());
       }
       System.out.println("savebook : Book Not Found ");
        bookservice.addBook(cmd.getBook());
        m.addAttribute("cmdSaveNewBook", cmd);
        m.addAttribute("msg", "New Book Added Successfully");
        return "redirect:viewBooks?act=addnewbook";
    }
    
    
    @RequestMapping(value = "book/viewBooks")
    public String viewBook(){
        return "book/viewBooks";
    }
    
    @RequestMapping(value = "book/borrowBooks")
    public String borrowBook(){
        return "book/borrowBooks";
    }
    
    @RequestMapping(value = "book/returnBooks")
    public String returnBook(){
        return "book/returnBooks";
    }
    
    
}
