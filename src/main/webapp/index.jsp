<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>CONVERT DATA</h3>
<form action="rest/convert" method="post">
<pre>
Days  :<input type="text" name="days">
Factor:<select name=fact>
<option>HRS</option>
<option>MIN</option>
<option>SEC</option>
<option>MIL</option>
</select>
<input type=submit value="convert">
</pre>
</form>
</body>
</html>