<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="shortcut icon"
	href="<c:url value="/resources/images/favicon.ico" />">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='http://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet' type='text/css'>
<title>Scrimdog - Your tournament manager</title>
</head>
<body>
	<div class="container">
		<t:header></t:header>
		<div class="content">
			<h3>Standings</h3>
			<table>
				<tr>
					<th>Team Name</th>
					<th>GP</th>
					<th>W</th>
					<th>T</th>
					<th>L</th>
					<th>P</th>
				</tr>
				<c:forEach items="${team}" var="team" varStatus="status">
					<tr>
						<td><c:out value="${team.teamName}"></c:out></td>
						<td><c:out value="${team.wins + team.losses + team.ties}"></c:out></td>
						<td><c:out value="${team.wins}"></c:out></td>
						<td><c:out value="${team.ties}"></c:out></td>
						<td><c:out value="${team.losses}"></c:out></td>
						<td><c:out value="${(team.wins * 2) + team.ties}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<t:footer></t:footer>
	</div>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-1.11.3.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>