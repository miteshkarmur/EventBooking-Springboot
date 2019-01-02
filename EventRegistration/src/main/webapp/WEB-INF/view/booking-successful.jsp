<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>RSVP Event Slot Booking</title>
</head>

<body>
	<h2>RSVP Event Slot Booking</h2>

	<h3>Your Slot is booked successfully</h3>
	Name: ${people.firstName} ${people.lastName}<br>
	Email: ${people.email }<br>
    Slot City: ${people.slot.city.name}<br>
    Slot DateTime: ${people.slot.dateTime}
	
	<p>
		<a href="${pageContext.request.contextPath}/">Back to Home Page</a>
	</p>

</body>

</html>