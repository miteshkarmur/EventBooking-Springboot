<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>RSVP Event Slot Booking</title>
</head>

<body>
	<h2>RSVP Event Slot Booking</h2>
	<%-- <h3>Select a City:</h3>
	<form action="citySelected">
		<form:select path="cities">
			<form:option value="NONE" label="Select City" />
			<form:options items="${cities}"/>
		</form:select>
		<input type="submit"/>
	</form> --%>

	<h3>Select a Time Slot:</h3>
	<form action="slotSelected">
		<form:select path="slots">
			<form:option value="NONE" label="Select Slot" />
			<form:options items="${slots}" />
		</form:select>
		<input type="submit" value="Book Slot"/>
	</form>

</body>

</html>
