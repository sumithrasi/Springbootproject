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
  align: center
}
h1{
color:pink;
align: center
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
<h1>customerqueries</h1>
<form action="addcustomerquries" method="get">
<center>Enter customer id:<br> <input type="text" name="customerid"><br><br>
    Enter customer queries:<br> <input  type="text" name="customerquries"><br><br>
    </center>
    <input type="submit" value="customerqueries"style="float: right">
</body>
</html>