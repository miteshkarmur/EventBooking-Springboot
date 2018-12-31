<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>RSVP Event Registration</title>

<style type="text/css">
.error {
	color: red;
}
</style>

</head>

<body>
	<h2>RSVP Event Registration</h2>

	<h3>Enter Your Email ID</h3>

	<div class="error">
		<c:if test="${not empty errorMessage}">
			<c:out value="${errorMessage}" />
		</c:if>
	</div>
	<br>
	<form action="validateEmail">
		Email: <input type="text" name="email" /> <br> <br> <input
			type="submit" value="Submit" />
	</form>

</body>

</html>