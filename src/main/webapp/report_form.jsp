<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
<meta charset="UTF-8">

<style>
body {font-family:Arial;background:#9FE4FB;}
.container {width:50%;margin:60px auto;background:white;padding:30px;border-radius:10px;text-align:center;}
input,select {width:80%;padding:10px;margin:10px;}
.btn {padding:10px 20px;border:2px solid #1359B9;color:#1359B9;background:white;cursor:pointer;}
.btn:hover {background:#1359B9;color:white;}
</style>
</head>

<body>
<div class="container">

<h2>Reports</h2>

<form action="ReportServlet" method="post">

<select name="type">
<option value="price">Price Greater Than</option>
<option value="category">By Category</option>
</select><br>

<input type="text" name="value" placeholder="Enter Value"><br>

<input type="submit" value="Generate" class="btn">

</form>

<br><br>

<button onclick="history.back()" class="btn">← Back</button>

</div>
</body>
</html>