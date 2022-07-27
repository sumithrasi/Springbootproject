<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

button {
    text-decoration: underline brown;
    display: blue;
    width: 115px;
    height: 50px;
    background: #4E9CAF;
    padding: 10px;
    text-align: center;
    border-radius: 10px;
    color: white;
    font-weight: bold;
    line-height: 50px;
}

body{
background-image:url("C:\Users\Try\Downloads\2374143\.jpg)");
  
  background-color: white;
}
h1{color:pink;
text-align: center;
}

</style>
</head>
<body>
 <h1>Customer Care Management System </h1>
<center><a href = "addcustomer.jsp"><button >Addcustomer</button></a><br><br><br>
<a href = "deletecustomer.jsp"><button >Deletecustomer</button></a><br><br><br>
<a href = "updatecustomer.jsp"><button >Updatecustomer</button></a><br><br><br>
<a href = "viewcustomer.jsp"><button >Viewscustomer</button></a><br><br><br>
<a href = "customerquries.jsp"><button >customerquries</button></a><br><br><br></center>
<form action="viewQueries" method="get">
	
	<input type="submit" value="viewAllQueries" style="float: right;">
	
	
</body>
</html>