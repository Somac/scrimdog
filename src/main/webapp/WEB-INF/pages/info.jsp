<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="shortcut icon" href="<c:url value="/resources/images/favicon.ico" />">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
<title>Scrimdog - Your tournament manager</title>
</head>
<body>
<div class="container">
<t:header></t:header>
<div class="content">
<h3>Info</h3>
<b>What is Scrimdog?</b>
<p>Scrimdog is a tournament management tool system. You can make tournaments, put in the scores and it will automatically make your standings.</p>
<b>Who made this?</b>
<p>This project was made by two person team, Markus Ylinen and Mikko Savinainen.</p>
<b>Why did you make this?</b>
<p>To learn more about Java EE, Spring framework, databases and such.</p>
</div>
<t:footer></t:footer>
</div>
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-1.11.3.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>