<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>RSVP Event Slot Booking</title>
</head>

<body>
	<h2>RSVP Event Slot Booking</h2>
	<h3>Select a City:</h3>
	<form:form action="citySelected" modelAttribute="city">
		<form:select path="code">
			<%-- <form:option value="NONE" label="Select City" /> --%>
			<form:options items="${cities}"/>
		</form:select>
		<input type="submit"/>
	</form:form>


</body>

</html>
