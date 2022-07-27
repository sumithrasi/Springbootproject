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
    }
    h1{color:pink;
text-align: center;
}
</style>
</head>
<body>
<h1>Update customer</h1>
<form action="updatecustomer" method="get">
<center>	Enter customer id:<br> <input type="text" name="customerid"><br><br>
	Enter customer name:<br> <input type="text" name="customername"><br><br>
	Enter customer phoneno:<br> <input type="text" name="phoneno"><br><br>
	Enter customer Address:<br> <input type="text" name="Address"><br><br>
Enter queries:<br> <input type="text" name="customerqueries"><br><br></center>
	<input type="submit" value="update"style="float: right"></form>

</body>
</html>