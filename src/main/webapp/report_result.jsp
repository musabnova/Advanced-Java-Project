<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*, model.Product" %>

<html>
<head>
<meta charset="UTF-8">

<style>
body {font-family:Arial;background:#9FE4FB;}
.container {width:70%;margin:60px auto;background:white;padding:30px;border-radius:10px;text-align:center;}
table {width:100%;border-collapse:collapse;}
th {background:#1359B9;color:white;padding:10px;}
td {padding:10px;border-bottom:1px solid #ddd;}
.btn {padding:10px 20px;border:2px solid #1359B9;color:#1359B9;background:white;cursor:pointer;}
.btn:hover {background:#1359B9;color:white;}
</style>
</head>

<body>

<div class="container">

<h2>Report Result</h2>

<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Category</th>
<th>Price</th>
<th>Quantity</th>
</tr>

<%
List<Product> list = (List<Product>) request.getAttribute("list");

if(list != null){
    for(Product p : list){
%>

<tr>
<td><%=p.getProductId()%></td>
<td><%=p.getProductName()%></td>
<td><%=p.getCategory()%></td>
<td><%=p.getPrice()%></td>
<td><%=p.getQuantity()%></td>
</tr>

<%
    }
}
%>

</table>

<br><br>

<button onclick="history.back()" class="btn">← Back</button>

</div>

</body>
</html>