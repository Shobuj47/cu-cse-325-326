<%-- 
    Document   : admin_mainmenu
    Created on : Jun 11, 2019, 1:28:41 AM
    Author     : Agent47
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>

<s:url var="url_logout" value="/logout" />
<s:url var="url_addUser" value="/admin/addUser" />
<s:url var="url_viewUser" value="/admin/viewUsers" />
<s:url var="url_addBook" value="/book/addBook" />
<s:url var="url_viewBook" value="/book/viewBooks" />

<c:if test="${sessionScope.uid != null}">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Welcome ${sessionScope.fname} ${sessionScope.lname}</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav ml-auto">

                <c:if test="${sessionScope.role == 'Admin' }">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Dashboard <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">Assign Book</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">Receive Book</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="${url_addUser}">Add User</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="${url_viewUser}">View Users</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="${url_addBook}">Add Book</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="${url_viewBook}">View Books</a>
                    </li>
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Manage
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" href="#">User Manager</a>
                        <a class="dropdown-item" href="#">Book manager</a>
                      </div>
                    </li>
                </c:if>

                <c:if test="${sessionScope.uid != null && sessionScope.role == 'Teacher' }"> 
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Dashboard <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Book Management</a>
                    </li>
               </c:if>

                <c:if test="${sessionScope.uid != null && sessionScope.role == 'Student' }">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Dashboard <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Book Management</a>
                    </li>
                    
                </c:if>
                <li class="nav-item">
                        <a class="nav-link" href="${url_logout}">logout</a>
                </li> 
                
                
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Profile
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <a class="dropdown-item" href="#">Manage Profile</a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="${url_logout}">Logout</a>
                    </div>
                </li>
                
            </ul>
        </div>
    </nav>
</c:if>




