<%-- 
    Document   : addBooks
    Created on : Jun 14, 2019, 1:58:55 AM
    Author     : Agent47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book</title>
        <jsp:include page="../common/global_includes.jsp"/>
    </head>
    <body>
         <jsp:include page="../common/navbar.jsp"/>
        <h1>Add New Book</h1>
        
        
        
        
        
        
       <div class="container">
            <form>
              <div class="form-row">  
                <div class="form-group col-md-6">
                  <label for="inputEmail4">Book Serial Number</label>
                  <input type="text" class="form-control" id="inputBookSerialNo" placeholder="Book Serial Number : i.e. 56ASDFD">
                </div>
                <div class="form-group col-md-6">
                  <label for="inputEmail4">Book Name</label>
                  <input type="text" class="form-control" id="inputBookName" placeholder="Book Name : i.e. Computer Fundamentals">
                </div>
              </div> 
              <div class="form-row">
                <div class="form-group col-md-6">
                  <label for="inputEmail4">Publisher Name</label>
                  <input type="text" class="form-control" id="inputPublisherName" placeholder="Publisher Name: i.e. Gankosh Prokashoni">
                </div>
                <div class="form-group col-md-6">
                  <label for="inputEmail4">Author Name</label>
                  <input type="text" class="form-control" id="inputAuthorName" placeholder="Author Name: i.e. Richard Philip">
                </div>
              </div>
              <div class="form-row">  
                <div class="form-group col-md-6">
                  <label for="inputEmail4">Publish Date</label>
                  <input type="email" class="form-control" id="inputEmail4" placeholder="Publish Date : i.e. 01/01/2011">
                </div>
                <div class="form-group col-md-6">
                  <label for="inputEmail4">Total Books</label>
                  <input type="email" class="form-control" id="inputEmail4" placeholder="Total Books : i.e. 15">
                </div>
              </div>             
              <button type="submit" class="btn btn-primary">Add User</button>
            </form>        
        
        
        </div> 
        
        
        
        
        
        
        
        
    </body>
</html>
