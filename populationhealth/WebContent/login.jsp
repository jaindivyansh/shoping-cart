<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/inputstyle.css">
<title>login</title>

</head>
<body>
    <center><h2>Login Form</h2></center>
    <div class="imgcontainer">
	    <img src="image/logo.jpg" alt="logo" class="logo">
	 </div>    
	 
	<form action="" method="post">  	
	  <div class="container">
	    <label for="uname"><b>Username</b></label>
	    <input type="text" placeholder="Enter Username" name="uname" required>
	
	    <label for="psw"><b>Password</b></label>
	    <input type="password" placeholder="Enter Password" name="psw" required>
	        
	    <button type="submit">Login</button>
	    
	  </div>	  
	</form>
	
	<a href="index.jsp">
		<div class="container" style="background-color:"#66ccff">
	    	<button type="button" class="cancelbtn">Cancel</button>
	    </div>
	</a>

</body>
</html>

</html>