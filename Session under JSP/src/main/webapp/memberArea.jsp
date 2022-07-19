<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Area</title>
</head>
<body>

<%@ page import="jakarta.servlet.http.Cookie" %> 
<%

String username=null;
String sessionID=null;
//Cookie[] cookies=request.getCookies();
//if(cookies!=null){
//	for(Cookie cookie:cookies){
//		if(cookie.getName().equals("username")){
//			username=cookie.getValue();
//		}
//		if(cookie.getName().equals("JSESSIONID")){
		//	sessionID=cookie.getValue();
		//}
		
	//}
//}
if(request.getSession().getAttribute("username")==null){	
	response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
}else{
	
	username=request.getSession().getAttribute("username").toString();
	sessionID=request.getSession().getId();
}

//if (sessionID==null||username==null){
//	response.sendRedirect("login.jsp");
//}

%>
<%=username %><br>Current session:
<%=sessionID %><br>Member Area !!
<form action="<%= request.getContextPath() %>/MemberAreaController" method="get">
<input type="hidden" name="action" value="destroy"/>
<input type="submit" value="logout"/>
</form>
</body>
</html>