<html>
<head>
	<title>Welcome home!</title>
</head>
<body>
	<h1>Welcome, <%= session.getAttribute("currentUser") %></h1>
	<h1>You are <%= session.getAttribute("age") %> years old</h1>

	
</body>

</html>