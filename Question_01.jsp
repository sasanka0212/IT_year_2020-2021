<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		public int fact(int n){		//method defination
			int f = 1;
			for(int i = 1; i<=n; i++){
				f = f*i;
			}
			return f;
		}
	%>
	
	<%
		for(int i=0; i<5; i++){ 
			for(int j=0; j<=5-i; j++){ %>
				&nbsp;
			<%}%>
		 <% for(int j=0; j<=i; j++){ %>
				<%=fact(i)/(fact(i-j)*fact(j))%>&nbsp;
			<%}%>
			<br>
	<%	}%>
	
</body>
</html>