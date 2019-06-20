/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.exceptions;

/**
 *
 * @author Agent47
 */
public class BookNotAvailableException extends Exception{

    public BookNotAvailableException() {
    }

    public BookNotAvailableException(String ex) {
        super(ex);
    }
    
}
