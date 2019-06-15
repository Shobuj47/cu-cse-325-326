<%-- 
    Document   : adduser
    Created on : Jun 13, 2019, 11:07:35 PM
    Author     : Agent47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User</title>
        <jsp:include page="../common/global_includes.jsp"/>
    </head>
    <body>
        <jsp:include page="../common/navbar.jsp"/>
        <h1>Add New User</h1>
        <div class="container">
            <s:url var="url_saveNewUser" value="saveNewUser" />
            <f:form action="${url_saveNewUser}" modelAttribute="cmdSaveNewUser" >
              <div class="form-row">  
                <div class="form-group col-md-6">
                  <label for="inputFname">First Name</label>
                  <f:input path="user.fname" class="form-control" id="inputFname" placeholder="First Name : i.e. Dennis" />
                </div>
                <div class="form-group col-md-6">
                  <label for="inputLname">Last Name</label>
                  <f:input path="user.lname" class="form-control" id="inputLname" placeholder="Last Name : i.e. Ritchie"/>
                </div>
              </div> 
              <div class="form-row">
                <div class="form-group col-md-6">
                  <label for="inputUsername">User Name</label>
                  <f:input path="user.username" class="form-control" id="inputUsername" placeholder="User Name: i.e. dennisritchi23" />
                </div>
                <div class="form-group col-md-6">
                  <label for="inputPassword">Password</label>
                  <f:password path="user.password" class="form-control" id="inputPassword" placeholder="Password" />
                </div>
              </div>
              <div class="form-row">  
                <div class="form-group col-md-6">
                  <label for="inputEmail">Email</label>
                  <f:input path="user.email" class="form-control" id="inputEmail" placeholder="Email : i.e. abc@example.com" />
                </div>
                <div class="form-group col-md-6">
                  <label for="inputCardno">Card No</label>
                  <f:input path="user.cardno" class="form-control" id="inputCardno" placeholder="Card No : i.e. 345K0L" />
                </div>
              </div>             
              <div class="form-group">
                <label for="inputAddress">Address</label>
                <f:textarea path="user.address" class="form-control" id="inputAddress" placeholder="i.e. 4th floor, City University, Dhaka, Bangladesh " />
              </div>
              <div class="form-row">
                <div class="form-group col-md-4">
                  <label for="inputRole">User Role</label>
                  <f:select path="user.role" id="inputRole" class="form-control">
                      <option value="Student" >Student</option>
                      <f:option value="Teacher">Teacher</f:option>
                      <f:option value="Admin">Admin</f:option>
                  </f:select>
                </div>
              </div>
              <div class="form-group">
                <div class="form-check">
                    <f:checkbox path="user.valid" class="form-check-input" id="gridCheck" value="1" />
                  <label class="form-check-label" for="gridCheck">Enable User</label>
                </div>
              </div>
              <button type="submit" class="btn btn-primary">Add User</button>       
            </f:form>
        
        </div>
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
