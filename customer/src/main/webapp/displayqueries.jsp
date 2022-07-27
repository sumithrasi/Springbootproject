<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="com.customer.customer.entity.Customerquries1" %>
   <%@ page import="java.util.ArrayList" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
<body>
<%

	ArrayList< Customerquries1> clist = (ArrayList<Customerquries1>)request.getAttribute("result");
	out.println("<table border=1px><tr><th>customerid</th><th>customerqueries</th></tr>");
	
	for( Customerquries1 b:clist)
	{
		out.println("<tr><td>" + b.getCustomerid() + "</td><td>" + b.getCustomerquries() + "</td></tr>");
	}
	out.println("</table>");

	%>
<h1>${result}</h1>
</body>
</html>