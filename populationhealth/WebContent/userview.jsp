<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}


header {
  background-color:  #8e88f6;
  padding: 30px;
  text-align:left;
  font-size: 18px;
  color: white;
}


nav {
  float:left;
  width: 30%;
  height: 300px; 
  background: #99d3f2;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #ffffff;
  height: 300px; /* only for demonstration, should be removed */
}

section:after {
  content: "";
  display: table;
  clear: both;
}

footer {
  background-color:  #8e88f6;
  padding: 10px;
  text-align: center;
  color: white;
}


@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>
</head>
<body>
<header>
  
<button type="button" onclick="">About</button></h2>
</header>

<section>
  <nav>
    <ul>
      <li><a href="#">DETAILS</a></li>
      
    </ul>
  </nav>
  
  <article>
    <h1></h1>
    
  </article>
</section>

<footer>
  
</footer>


</body>
</html>