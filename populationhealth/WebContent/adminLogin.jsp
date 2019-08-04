<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/inputstyle.css">
</head>
<body bgcolor="#66ccff">

<center><h2>Admin Login</h2></center>


  <div class="imgcontainer">
    <img src="image/logo.jpg" alt="logo" class="logo">
  </div>
  
 <form action="adminlogin" method="post">
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname">

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw">
        
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