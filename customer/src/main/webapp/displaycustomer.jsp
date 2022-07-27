<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.customer.customer.entity.Customer" %>
   <%@ page import="java.util.ArrayList" %>
   
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
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}
table, th, td {
  border:1px solid brown;
}
</style>
</head>
<body>
<%
String mode = (String) request.getAttribute("mode");
if (mode.equals("single")) {
	boolean flag = (Boolean) request.getAttribute("flag");
	if (flag) {
		 Customer b = ( Customer) request.getAttribute("result");
		out.println("<table border=1px><tr><th>customerid</th><th>customername</th><th>customerphoneno</th><th>customerAddress</th><th>customerquries</th></tr>");
		out.println("<tr><td>" + b.getCustomerid()  + "</td><td>" +b.getCustomername()+ "</td><td>" + b.getPhoneno()
		+ "</td><td>"+b.getaddress() +"</td></tr>");
	} else {
		out.println("<h1> " + (String) request.getAttribute("result") + "</h1>");
	}
} else if (mode.equals("list")) {
	ArrayList< Customer> clist = (ArrayList<Customer>)request.getAttribute("result");
	out.println("<table border=1px><tr><th>customerid</th><th>customername</th><th>customerphoneno</th><th>customerAddress</th><th>customerqueries</th></tr>");
	
	for( Customer b:clist)
	{
		out.println("<tr><td>" + b.getCustomerid() + "</td><td>" + b.getCustomername() + "</td><td>" +b.getPhoneno()
		+ "</td><td>"+ b.getaddress() +  "</td></tr>");
	}
	out.println("</table>");
}
	%>
<h1>${result}</h1>
</body>
</html>