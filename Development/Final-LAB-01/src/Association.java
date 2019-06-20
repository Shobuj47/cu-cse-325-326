/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agent47
 */
public class Association {
    
       public static void main (String args[]){
            
           customer cust1 = new customer("shobuj", "shobuj123", "123");
           address addr1 = new address(2, 3, "Biruttom Road", "12/2", "Dhaka", "Dhaka");
           
           System.out.println(cust1.customer() + " " + addr1.address());
           
           
           admin admin1 = new admin("Administrator", "admin", "Admin@123");
           address addr2 = new address(4, 2, "Biruttom Shoroni", "12/2", "Dhaka", "Dhaka");
           
           
           System.out.println(admin1.admin() + " " + addr2.address());
           
           
        }
    
    
}
