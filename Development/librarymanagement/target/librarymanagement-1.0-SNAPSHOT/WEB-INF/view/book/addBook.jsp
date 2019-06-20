<%-- 
    Document   : addBooks
    Created on : Jun 14, 2019, 1:58:55 AM
    Author     : Agent47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
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
           <s:url var="url_saveNewBook" value="saveNewBook" />
           <f:form action="${url_saveNewBook}" modelAttribute="cmdSaveNewBook" >
              <div class="form-row">  
                <div class="form-group col-md-6">
                  <label for="inputBookSerialNo">Book Serial Number</label>
                  <f:input path="book.serialno" type="text" class="form-control" id="inputBookSerialNo" placeholder="Book Serial Number : i.e. 56ASDFD" />
                </div>
                <div class="form-group col-md-6">
                  <label for="inputBookName">Book Name</label>
                  <f:input path="book.bookname" type="text" class="form-control" id="inputBookName" placeholder="Book Name : i.e. Computer Fundamentals" />
                </div>
              </div> 
              <div class="form-row">
                <div class="form-group col-md-6">
                  <label for="inputPublisherName">Publisher Name</label>
                  <f:input path="book.publishername" type="text" class="form-control" id="inputPublisherName" placeholder="Publisher Name: i.e. Gankosh Prokashoni" />
                </div>
                <div class="form-group col-md-6">
                  <label for="inputAuthorName">Author Name</label>
                  <f:input path="book.authorname" type="text" class="form-control" id="inputAuthorName" placeholder="Author Name: i.e. Richard Philip" />
                </div>
              </div>
              <div class="form-row">  
                <div class="form-group col-md-6">
                  <label for="inputPublishDate">Publish Date</label>
                  <f:input path="book.publishdate" class="form-control" id="inputPublishDate" placeholder="Publish Date : i.e. 01/01/2011" />
                </div>
              </div>             
              <button type="submit" class="btn btn-primary">Add User</button>
            </f:form>        
        </div> 
        
        
        
        
        
        
        
        
    </body>
</html>
