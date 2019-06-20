<%-- 
    Document   : viewBooks
    Created on : Jun 14, 2019, 1:58:32 AM
    Author     : Agent47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Books</title>
    </head>
    <body>
        <h1>View Books</h1>
        <c:if test="${param.act eq 'addnewbook'}">
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
        
    </body>
</html>
