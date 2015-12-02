<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
	<head>		
		<title>Google Test App Engine</title>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	</head>
	<body>
		<div id="result">Loading...</div>
		<script type="text/javascript">
			$(document).ready(function() {
			  $.getJSON('/demo', function(data) {
			    $('#result').html("Hello, " + data.name);
			  });
			});
		</script>
	</body>
</html>