<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<h3>Matches</h3>
			<%-- 			${matches} --%>
			<c:forEach items="${matches}" var="matches" varStatus="status">
				Match <c:out value="${matches.matchId}"></c:out>
				<br />
				<c:out value="${matches.homeTeamName}"></c:out>
				<c:out value="${matches.awayTeamName}"></c:out>
				<br />
				<c:choose>
					<c:when
						test="${matches.homeScore==null && matches.awayScore==null}">
						<div>
							<form:form modelAttribute="matches"
								action="setScore-${matches.matchId}">
								<input name="homeScore" />
								<input name="awayScore" />
								<input type="submit" value="setScore" />
							</form:form>
						</div>
					</c:when>
					<c:otherwise>
						<c:out value="${matches.homeScore}"></c:out>
						<c:out value="${matches.awayScore}"></c:out>
					</c:otherwise>
				</c:choose>
				<br />
				<br />
			</c:forEach>
		</div>



		<t:footer></t:footer>
	</div>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-1.11.3.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>