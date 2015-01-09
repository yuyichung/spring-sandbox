<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Add Entry</title>
	</head> 
	<body>
		<div id="input_area">
			<form method="POST" action="/boom/addEntry">
				<textarea name="entry_text" placeholder="what's on your mind?"></textarea>
				<button onclick="submit">Submit</button>
			</form>
		</div>
	</body>
</html>