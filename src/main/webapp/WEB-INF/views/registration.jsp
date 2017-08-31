<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"/>
<meta name="_csrf" content="${_csrf.token }"/>
<meta name="_csrf_header" content="${_csrf.headerName }"/>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<style>
.password-verdict{
color:#000;
}
</style>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="<c:url value="/resources/js/pwstrength.js"/>" ></script>
<c:url var="home" value="/" scope="request" />
<title>form</title>
</head>
<body>
    <div class="container">
        <div >
            <h1>Registration Form</h1>
            <br/>
            <form:form method="POST" modelAttribute="user">
                <div class="form-group row" >
                    <label class="col-sm-3">First Name</label>
                    <span class="col-sm-5"><form:input class="form-control" path="firstName" required="required"/></span>
                    <span id="firstNameError" class="alert alert-danger col-sm-4" style="display:none"></span>
                    <form:errors path="firstName" class="alert alert-danger col-sm-4"/>                 
                </div>
                <div class="form-group row">
                    <label class="col-sm-3">Last Name</label>
                    <span class="col-sm-5"><form:input class="form-control"  path="lastName" required="required"/></span>
                    <span id="lastNameError" class="alert alert-danger col-sm-4" style="display:none"></span>
                    <form:errors path="lastName" class="alert alert-danger col-sm-4"/>                    
                </div>
                <div class="form-group row">
                    <label class="col-sm-3" >Username</label>
                    <span class="col-sm-5"><form:input type="text" class="form-control" path="username" required="required"/></span>                    
                    <span id="emailusername" class="alert alert-danger col-sm-4" style="display:none"></span> 
                    <form:errors path="username" class="alert alert-danger col-sm-4"/>                   
                </div>
                <div class="form-group row">
                    <label class="col-sm-3" >Email</label>
                    <span class="col-sm-5"><form:input type="email" class="form-control" path="email" required="required"/></span>                    
                    <span id="emailError" class="alert alert-danger col-sm-4" style="display:none"></span>
                    <form:errors path="email" class="alert alert-danger col-sm-4"/>                    
                </div>
                <div class="form-group row">
                    <label class="col-sm-3" >password</label>
                    <span class="col-sm-5"><form:input id="password" class="form-control" path="password" type="text" required="required" title="Password must contain at least 8 to 15 characters, including UPPER/lowercase/Number and Sysbol" /></span>
                    <span id="passwordError" class="alert alert-danger col-sm-4" style="display:none"></span>
                    <form:errors path="password" class="alert alert-danger col-sm-4"/>
                </div>
                <div class="form-group row">
                    <label class="col-sm-3" >Confirm Password</label>
                    <span class="col-sm-5"><form:input id="matchingPassword" class="form-control" path="matchingPassword" type="text" required="required"  /></span>
                    <span id="matchingPasswordError" class="alert alert-danger col-sm-4" style="display:none"></span>
                    <form:errors path="matchingPassword" class="alert alert-danger col-sm-4"/>
                </div>                
                <br/>
                <span id="globalError" class="alert alert-danger col-sm-4" style="display:none"></span>
                <button type="submit" class="btn btn-primary" id="btn_submit">submit</button>
            </form:form>
            <br/> 
            <a href="login">login</a>
        </div>
    </div>

<script>

var serverContext = "${home}";
$(document).ready(function () {
	$('form').submit(function(event) {
		//register(event);
	});
	
	$(":password").keyup(function(){
		if($("#password").val() != $("#matchingPassword").val()){
	        $("#matchingPasswordError").show().html("Password does not match!");
	    }else{
	    	$("#matchingPasswordError").html("").hide();
	    }
	});	

});
function register(event){
	
    $(".alert").html("").hide();
    $(".error-list").html("");
    
    var pwd1Input = document.getElementById("password");
    pwd1Input.setCustomValidity(pwd1Input.title);
    var pwd2Input = document.getElementById("matchingPassword");
    pwd1Input.addEventListener("keyup", function() {
      this.setCustomValidity(this.validity.patternMismatch ? pwd1Input.title : "");
      if(this.checkValidity()) {
        pwd2Input.pattern = this.value;
        pwd2Input.setCustomValidity(pwd2Input.title);
      } else {
        pwd2Input.pattern = this.pattern;
        pwd2Input.setCustomValidity("");
      }
    }, false);

    pwd2Input.addEventListener("keyup", function() {
      this.setCustomValidity(this.validity.patternMismatch ? pwd2Input.title : "");
    }, false);
    event.preventDefault();
        
    var formData= $('form').serialize();
    $.ajax({
        type: "POST",
        url: serverContext + "admin/user/registration",
        data: formData,
        success: function (data) {
        	console.log("responce:"+data);
            $("#btn_submit").prop("disabled", false);
            
        },
        error: function (e) {
        	console.log(e);            
        }
	}).fail(function(data) {
        if(data.responseJSON.error.indexOf("MailError") > -1)
        {
            window.location.href = serverContext + "emailError.html";
        }
        else if(data.responseJSON.error == "UserAlreadyExist"){
            $("#emailError").show().html(data.responseJSON.message);
        }
        else if(data.responseJSON.error.indexOf("InternalError") > -1){
            window.location.href = serverContext + "login?message=" + data.responseJSON.message;
        }
        else{
        	var errors = $.parseJSON(data.responseJSON.message);
            $.each( errors, function( index,item ){
                $("#"+item.field+"Error").show().html(item.defaultMessage);
            });
            errors = $.parseJSON(data.responseJSON.error);
            $.each( errors, function( index,item ){
                $("#globalError").show().append(item.defaultMessage+"<br/>");
            });
        }
    }); 
} 
</script>
</body>
</html>