<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Operation</title>
</head>
<body>

	<%
		Integer n1 = Integer.parseInt(request.getParameter("num1"));
		Integer n2 = Integer.parseInt(request.getParameter("num2"));
		String n3 = request.getParameter("opr");
		if(n3.equals("add")){
			out.println("Addition of " + n1 + " and " + n2 + " is : " + (n1+n2));
		}
		else if(n3.equals("sub")){
			out.println("Subtraction of " + n1 + " and " + n2 + " is : " + (n1-n2));
		}
		else{
			out.println("Multiplication of " + n1 + " and " + n2 + " is : " + (n1*n2));
		}
	%>

</body>
</html>
