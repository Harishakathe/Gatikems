<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="false"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <c:url var="url" value="/" scope="request" />
        <c:url var="loginUrl" value="/login" />
        
        <title>Login</title>
        <link href="${url}resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="${url}resources/font-awesome/css/font-awesome.css" rel="stylesheet">
        <link href="${url}resources/css/animate.css" rel="stylesheet">
        <link href="${url}resources/css/style.css" rel="stylesheet">
        <link href="${url}resources/css/custom.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="md-skin">

        <div id="page-wrapper-login" class="blue-bg-light">
            <div class="col-sm-8 no-padding">
                <div class="login-bg">

                </div>
            </div>
            <div class="col-sm-4 no-padding">
                <div class="ibox no-margins">
                    <div class="ibox-content custom-height">
                        <div class="row m-t-xxl text-center">
                            <div class="col-sm-12">
                                <img class="center-block" src="${url}resources/img/logo.png" alt="gati-logo"/>
                            </div>
                            <div class="col-sm-12 m-t-xxl">
                                <h1 class="color-gati">LOG IN</h1>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-8 col-sm-offset-2">
                            	<c:if test="${param.error}">
									 <div class="alert alert-danger">    
							            Invalid username and password.
							        </div>
								</c:if>
								<c:if test="${param.logout}">
									 <div class="alert alert-success">    
							            You have been logged out.
							         </div>
								</c:if>
                                <form class="form-signin" method="post" action="${loginUrl}">
                                
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Username </label>
                                        <input type="text" class="form-control" id="username" placeholder="Enter Username" name="username" required autofocus>

                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" class="form-control"  name="password" placeholder="Password" required>
                                        <small class="form-text"><a href="#">Remember Me</a></small>
                                        <small class="form-text pull-right"><a href="#">Forgot Password?</a></small>
                                    </div>

                                    <button type="submit" class="btn btn-info m-t-xl center-block">Login</button>
                                </form>
                            </div>
                        </div>
                        <div class="row m-t-xxl text-center">
                            <div class="col-sm-12">
                                <a class="inline text-muted" href="#">Terms Of Use</a>&nbsp;&nbsp;|&nbsp;&nbsp;
                                <a class="inline text-muted" href="#">Policy</a>
                            </div>
                            <div class="col-sm-12 m-t-sm">
                                <p>&copy; Copyright. All Rights Reserved Gati Kausar 2017</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- Mainly scripts -->
        <script src="${url}resources/js/jquery-3.1.1.min.js"></script>
        <script src="${url}resources/js/bootstrap.min.js"></script>        
    </body>
</html>

