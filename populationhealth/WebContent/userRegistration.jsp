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
<center><h1 >User Regestration Forms</h1></center>

<form>
<div class="container">

  <label for="name"><b>Name</b></label>
  <input type="text" name="name" placeholder="Enter Name" required>
  <br>
  
  <label for="birthdate"><b>Birthdate</b></label><br>
  <input id="dateCol" type="date" name="birthdate" placeholder="birthdate">
  <br>
  <label for="address"><b>Address</b></label>
  <input type="text" name="address" placeholder="Enter Address">
  <br>
  <label for="state"><b>State</b></label>
  <input type="text" name="state" placeholder="Enter State">
  <br>
  <label for="district"><b>District</b></label>
  <input type="text" name="district" placeholder="Enter District">
  <br>
  <label for="pincode"><b>Pincode</b></label>
  <input type="text" name="pincode" placeholder="Enter Pincode">
  <br>
  
  <label for="mobileNumber"><b>MobileNumber</b></label>
  <input type="text" name="mobileNumber" placeholder="Enter Mobile Number">
  
  <br><br>
  
  <button type="submit">submit</button>
  </div>
</form> 

<a href="adminView.jsp">
	<div class="container" style="background-color:"#66ccff">
    	<button type="button" class="cancelbtn">Cancel</button>
    </div>
</a>

</body>
</html>