<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question_5_2021</title>
</head>
<body>

	<%
		Integer hitsCount = (Integer)application.getAttribute("hitCounter"); 
		if(hitsCount==null || hitsCount==0){
			//first visit on website
			out.println("Thank You & Welcome to My Website!!");
			hitsCount = 1;
		}
		else{
			//after visits on website
			out.println("welcome Back to My Website!!");
			hitsCount+=1;
		}
		application.setAttribute("hitCounter", hitsCount);
	%>
	<p style="text-align:center">Total no of visits to website : <%=hitsCount%></p>

</body>
</html>