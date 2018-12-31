<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>RSVP Event Slot Booking</title>
</head>

<body>
	<h2>RSVP Event Slot Booking</h2>
	<h3>Select a City:</h3>
	<form:select path="cities">
		<form:option value="NONE" label="Select City" />
		<form:options items="${cities}" />
	</form:select>

	<h3>Select a Time Slot:</h3>
	<form:select path="slots">
		<form:option value="NONE" label="Select Slot" />
		<form:options items="${slots}" />
	</form:select>
	
	<form action="" method="get">
	<input type/>
	<input type=>
	</form>>

</body>

</html>
