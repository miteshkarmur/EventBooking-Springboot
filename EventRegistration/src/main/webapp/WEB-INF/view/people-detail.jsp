<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

<head>
<title>User Detail</title>
</head>

<body>

	<h2>User Details</h2>
	<table>
		<tr>
			<th>Date of Interest</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Date of Birth</th>
			<th>Email</th>
			<th>Phone</th>
			<th>City</th>
			<th>Language</th>
			<th>Flag</th>
		</tr>

		<tr>
			<td>${people.dateOfInterest}</td>
			<td>${people.firstName}</td>
			<td>${people.lastName}</td>
			<td>${people.dob}</td>
			<td>${people.email}</td>
			<td>${people.phoneNo}</td>
			<td>${people.city}</td>
			<td>${people.language}</td>
			<td>${people.bookingFlag}</td>
		</tr>
	</table>

    <br>
	<c:if test="${people.bookingFlag}">
	You have already booked a slot for the event
	</c:if>
	<c:if test="${!people.bookingFlag}">
	   <input type="submit" value="Book Slot" action="/bookEventSlot">
	</c:if>

</body>

</html>