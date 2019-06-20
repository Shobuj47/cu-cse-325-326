/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.cse.cu.librarymanagement.dao.books;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.cse.cu.librarymanagement.dao.baseDAO;
import library.cse.cu.librarymanagement.domain.Book;
import library.cse.cu.librarymanagement.rowmapper.BookRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Agent47
 */
@Repository
public class booksDAOImpl extends baseDAO implements booksDAO {

    @Override
    public void saveBook(Book book) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String sqlquery = " INSERT INTO `libmanagment`.`books`" +
        "(`id`,	`serialno`, `bookname`, `publishername`, `authorname`, `publishdate`)" +
        "VALUES (:id, :serialno, :bookname, :publishername, :authorname, :publishdate );" ;
        Map m = new HashMap();
        m.put("id", book.getId());
        m.put("serialno", book.getSerialno());
        m.put("bookname", book.getBookname());
        m.put("publishername", book.getPublishername());
        m.put("authorname", book.getAuthorname());
        m.put("publishdate", book.getPublishdate());
        
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        
        super.getNamedParameterJdbcTemplate().update(sqlquery, ps, kh);
        
        
        Integer userId = kh.getKey().intValue();
        book.setId(userId);
    }

    @Override
    public void updateBook(Book book) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery="UPDATE `libmanagment`.`books`  SET `id` = :id,  `serialno` = :serialno,  "
                + "`bookname` = :bookname, `publishername` = :publishername, `authorname` = :authorname  `publishdate` = :publishdate  "
                + "WHERE `id` = :id ;";
        Map map = new HashMap();
        map.put("id", book.getId());
        map.put("serialno", book.getSerialno());
        map.put("bookname", book.getBookname());
        map.put("publishername", book.getPublishername());
        map.put("authorname", book.getAuthorname());
        map.put("publishdate", book.getPublishdate());
        
       getNamedParameterJdbcTemplate().update(sqlquery, map);
    }

    @Override
    public void deleteBook(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery = "DELETE FROM `libmanagment`.`books` WHERE `id` = ? ;";
        getJdbcTemplate().update(sqlquery, id);
    }
    
    @Override
    public void deleteBook(Book book){
        this.deleteBook(book.getId());
    }
    
    

    @Override
    public Book findById(Integer id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery ="SELECT 	`id`,  `serialno`,  `bookname`,  `publishername`, `authorname`,  `publishdate`   FROM  `libmanagment`.`books`  WHERE `id` = ? ;";
        Book book = getJdbcTemplate().queryForObject(sqlquery, new BookRowMapper(), id);
        return book;
    }

    @Override
    public List<Book> findALL() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery ="SELECT 	`id`,  `serialno`,  `bookname`,  `publishername`, `authorname`,  `publishdate`   FROM  `libmanagment`.`books`;";
        List<Book> books = getJdbcTemplate().query(sqlquery, new BookRowMapper());
        return books;
    }

    @Override
    public List<Book> findByProperty(String propertyName, Object obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlquery ="SELECT 	`id`,  `serialno`,  `bookname`,  `publishername`, `authorname`,  `publishdate`   "
                + "FROM  `libmanagment`.`books` WHERE "+ propertyName +" = ? ;";
        List<Book> books = getJdbcTemplate().query(sqlquery, new BookRowMapper(), obj);
        return books;
    }
    
}
