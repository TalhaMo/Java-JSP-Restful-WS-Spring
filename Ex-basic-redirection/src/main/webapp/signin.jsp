<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signin</title>
</head>
<body>
signin
<form action="<%=request.getContextPath()%>/Controller" method="post">
Full name: <input type="text" name="name" required/><br/>
Gender: <input type="radio" name="gender" value="male" checked="checked"/> Male
		<input type="radio" name="gender" value="female" /> Female <br/>
Language: <input type="checkbox" name="language" value="arabic" /> Arabic
		  <input type="checkbox" name="language" value="french" /> French
		  <input type="checkbox" name="language" value="english" /> English<br/>
Country: <select name="country">
			<option value="tunisia">Tunisia</option>
			<option value="algeria">Algeria</option>
			<option value="egypt">Egypt</option>
			<option value="marocco">Marocco</option>
		 </select>
		 <input type="submit" value="submit"/>
</form>
</body>
</html>