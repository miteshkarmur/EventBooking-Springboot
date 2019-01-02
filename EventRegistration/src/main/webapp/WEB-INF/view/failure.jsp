<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>RSVP Event Slot Booking</title>
</head>

<body>
	<h2>RSVP Event Slot Booking</h2>

	<h3>
	<c:if test="${not empty errorMessage}">
		<c:out value="${errorMessage}" />
	</c:if>
	</h3>
	
	<p>
		<a href="${pageContext.request.contextPath}/">Back to Home Page</a>
	</p>

</body>

</html>