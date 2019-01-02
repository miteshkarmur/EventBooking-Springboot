<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

<head>
<title>User Detail</title>
</head>

<body>

	<h2>User Details</h2>


	Full Name: ${people.firstName} ${people.lastName}
	<br> Date of Birth: ${people.dob}
	<br> Phone: ${people.phoneNo}
	<br> City: ${people.city}
	<br>

	<br>
	<c:if test="${not empty people.slot}">
		<b>You have already booked a slot for the event</b><br>
		
		Slot City: ${people.slot.city.name}<br>
        Slot DateTime: ${people.slot.dateTime}<br>

		<p>
			<a href="${pageContext.request.contextPath}/">Back</a>
		</p>
	</c:if>
	<c:if test="${empty people.slot}">
		<form action="bookEvent">
			<input type="submit" value="Book Slot">
		</form>
	</c:if>

</body>

</html>