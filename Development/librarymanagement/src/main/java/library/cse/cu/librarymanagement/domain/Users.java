/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.domain;

import java.util.Date;

/**
 *
 * @author Agent47
 */
public class Users {
    private int id; 
    private String  username; 
    private String  password;
    private String  fname; 
    private String  lname; 
    private String  email; 
    private String  address; 
    private String  cardno; 
    private Date    birthdate;
    private String  role;
    private int     valid; 
    private Date    validity; 
    private int     maxbookcount; 
    private int     borrowedbookcount; 
    private Date    lastlogin;
    private Date    lastupdated;

    public Users() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public int getMaxbookcount() {
        return maxbookcount;
    }

    public void setMaxbookcount(int maxbookcount) {
        this.maxbookcount = maxbookcount;
    }

    public int getBorrowedbookcount() {
        return borrowedbookcount;
    }

    public void setBorrowedbookcount(int borrowedbookcount) {
        this.borrowedbookcount = borrowedbookcount;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }
}
