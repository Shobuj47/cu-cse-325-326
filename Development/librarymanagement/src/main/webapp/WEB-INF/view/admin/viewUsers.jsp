<%-- 
    Document   : viewusers
    Created on : Jun 14, 2019, 1:52:11 AM
    Author     : Agent47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${param.act eq 'addnewuser'}">
            <c:if test="${param.msg != null}">
                <div class="isa_success">
                    <i class="fa fa-check"></i>
                    ${param.msg}
                </div>
            </c:if>
            <c:if test="${param.err != null}">
                <div class="isa_error">
                    <i class="fa fa-times-circle"></i>
                    ${param.err}
                </div>
            </c:if>
        </c:if>
        <h1>Hello World!</h1>
    </body>
</html>
