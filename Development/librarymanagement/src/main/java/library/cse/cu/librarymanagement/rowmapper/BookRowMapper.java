/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import library.cse.cu.librarymanagement.domain.Book;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Agent47
 */
public class BookRowMapper implements RowMapper<Book>{

    @Override
    public Book mapRow(ResultSet rs, int i) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Book book = new Book();
        book.setId(rs.getInt("id"));
        book.setSerialno(rs.getString("serialno"));
        book.setBookname(rs.getString("bookname"));
        book.setPublishername(rs.getString("publishername"));
        book.setPublishdate(rs.getDate("publishdate"));
        
        
        return book;
    }
    
}
