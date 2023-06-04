<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<body>
<% double totalAmount=(Double)request.getAttribute("TotalBill");

if (totalAmount>0){
%>
 
<h1>Total Bill is <%= totalAmount%> </h1>
 <%} 
else
%><h1>Tickets Unavailable</h1>


</body>
</html>