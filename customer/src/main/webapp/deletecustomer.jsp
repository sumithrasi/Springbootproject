<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
  background-color: lightblue;
}
input[type=text] {
  width: 20%;
  padding: 12px 20px;
  margin: 8px 0;
 border-radius: 100px;
}
 input[type=submit] {
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
     value-align: right;
     }
     h1{color:pink;
text-align: center;
}
</style>
</head>
<body>
<H1>Delete customer</H1>
<form action="deletecustomer" method="get">
	<center>Enter customer id:<br> <input  style="color:blue" type="text" name="customerid"><br><br></center>
	<input type="submit" value="Deletecustomer"style="float: right">
</form><br><br>
</body>
</html>