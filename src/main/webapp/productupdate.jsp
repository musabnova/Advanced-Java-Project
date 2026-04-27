<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
<meta charset="UTF-8">

<style>
body {font-family:Arial;background:#9FE4FB;}
.container {width:50%;margin:60px auto;background:white;padding:30px;border-radius:10px;text-align:center;}
input {width:80%;padding:10px;margin:10px;}
.btn {padding:10px 20px;border:2px solid #1359B9;color:#1359B9;background:white;cursor:pointer;}
.btn:hover {background:#1359B9;color:white;}
</style>
</head>

<body>
<div class="container">

<h2>Update Product</h2>

<form action="UpdateProductServlet" method="post">

<input type="number" name="id" placeholder="Product ID"><br>
<input type="text" name="name" placeholder="New Name"><br>
<input type="text" name="category" placeholder="Category"><br>
<input type="number" name="price" placeholder="Price"><br>
<input type="number" name="quantity" placeholder="Quantity"><br>

<input type="submit" value="Update" class="btn">

</form>

<br><br>

<button onclick="history.back()" class="btn">← Back</button>

</div>
</body>
</html>