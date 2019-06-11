<%-- 
    Document   : login.jsp
    Created on : May 19, 2019, 12:44:03 AM
    Author     : Agent47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <jsp:include page="common/global_includes.jsp"/>
    </head>
    <s:url var="url_body_bg" value="WebResources/images/login-bg.jpeg"/>
    <body background="${url_body_bg}">
        <div class="container">
            <div class="row vertical-offset-100 " align="center">
                <div class="col-md-4 col-md-offset-4" >
                        <div class="panel panel-default">
                                        <div class="panel-heading">
                                        <h3 class="panel-title">Please sign in</h3>
                                        </div>
                                        <div class="panel-body">
                                        <form accept-charset="UTF-8" role="form">
                            <fieldset>
                                                <div class="form-group">
                                                    <input class="form-control" placeholder="E-mail" name="email" type="text">
                                                </div>
                                                <div class="form-group">
                                                        <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                                </div>
                                                <div class="checkbox">
                                                <label>
                                                        <input name="remember" type="checkbox" value="Remember Me"> Remember Me
                                                </label>
                                            </div>
                                                <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
                                        </fieldset>
                                        </form>
                                    </div>
                                </div>
                        </div>
                </div>
        </div>
    </body>
</html>
