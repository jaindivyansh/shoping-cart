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
<center><h1>Doctor Regestration Forms</h1></center>

<form action="doctorregestration" method="post">
  <div class="container">

	  <label for="id"><b>Id</b></label>
	  <input type="text" name="id" placeholder="Enter Id">
	  <br>
	  
	  <label for="DoctorName"><b>Doctor's Name</b></label>
	  <input type="text" name="DoctorName" placeholder="Enter Doctor's Name">
	  <br>
	  
	  <label for="Specilization"><b>Specilization</b></label>
	  <input type="text" name="Specilization" placeholder="Specilization">
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
	  
	  <label for="mobileNumber"><b>Mobile Number</b></label>
	  <input type="text" name="mobileNumber" placeholder="Enter Mobile Number">
	  <br>
	  
	  <label for="yearofdegreecomplition"><b>Year Of Degree complition</b></label>
	  <input type="text" name="yearOfDegreeComplition" placeholder="Year Of Degree Complition">
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