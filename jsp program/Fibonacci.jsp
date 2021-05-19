<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fibonacci program on JSP</title>
</head>
<body>

	<%!
   		int n;
   		String str;

  		int fibo(int n) 
  		{
      		if(n<2)
         		return n;
      		else
         		return fibo(n-1) + fibo(n-2);
   		}
	%>
<b>Fibonacci series: </b><br>
	<% 
   		str = request.getParameter("val");
   		n = Integer.parseInt(str);

	   for(int i=0; i<=n; i++) 
	   {
      		out.print(fibo(i) + "   ");
   	   }
	%>

</body>
</html>