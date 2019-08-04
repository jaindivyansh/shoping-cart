<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Population Health Managment</title>
	
	<style>
		body{
			background-image :url("image/back7.jpg");
			width:100%;
			margin:auto;
			
			
		}
		.content{
			width:860px;
			margin:auto;
		}
		
		.pages a{
			font-size:32px;
			text-decoration:none;
			
		}
		
		.pages li{
			display:inline;
			list-style: none;
		}
		ul{
			margin-left:-40px;
		}
		.pages a{			
			padding:10px 60px 0px 60px;
			margin:30px;			
			border-top : 1px solid black;
		}
				
		.pages a:hover{
			color:red;
			border-top: 3px solid #0061B8;
			background: -webkit-linear-gradient(#7CBDF7,white);
			background: linear-gradient(#7CBDF7,white);
		}
		
		.image{
			width:960px;
			position:fixed;
			margin-left:-130px;			
		}
		
		
		
	</style>
	
	<script>
		var image_no = 2;
		var length = 2;
		
		function slider(){								
			var img = document.getElementById("slider");
			img.src = "image/slider/s" + image_no  + ".jpg";
			image_no = image_no + 1;
			
			if(image_no == length+1){
				image_no = 1;
			}			
		}
	</script>
	
</head>

<body bgcolor="#66ccff" onload ="setInterval(slider,5000)">
	<center class="content">
	<h1>POPULATION HEALTH MANAGEMENT</h1>
	<div class="pages">
		<ul>
			<a href="login.jsp"><li>Doctor</li></a>
			<a href="login.jsp"><li>User</li></a>
			<a href="adminLogin.jsp"><li>Admin</li></a>
		</ul>		
	</div>
	<div class="image">
		<img id="slider" src="image/slider/s1.jpg" alt="healtcare" height="599px" width="1168px">
	</div>
	
	</center>
	
	
</body>

</html>