<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>RSVP Event Slot Booking</title>
</head>

<body>
	<h2>RSVP Event Slot Booking</h2>

	<h3>Select a Time Slot:</h3>
	<form:form action="slotSelected" modelAttribute="slot">
		<form:select path="slotId">
			<form:options items="${slots}"/>
		</form:select>
		<input type="submit" value="Book Slot"/>
	</form:form>
	<p>
		<a href="${pageContext.request.contextPath}/bookEvent">Back to City Selection</a>
	</p>


</body>

</html>
