<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/inputstyle.css">
</head>
<body>
<center><h1>User Update Forms</h1></center>
<form action="userupdate" method="post">
	<div class="container">	
	  <label for="name"><b>Name</b></label>
	  <input type="text" name="name" placeholder="Enter Name">  
	  <br><br>
	  
	  <button type="submit">Update</button>
	</div>
</form> 

<a href="adminView.jsp">
	<div class="container" style="background-color:"#66ccff">
		<button type="button" class="cancelbtn">Cancel</button>
	</div>
</a>

</body>
</html>