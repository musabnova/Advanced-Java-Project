<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
<meta charset="UTF-8">

<style>
body {
    margin: 0;
    font-family: Arial;
    background: #9FE4FB;
}

/* Navbar */
.navbar {
    background: #1359B9;
    color: white;
    padding: 15px 30px;
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.navbar a {
    color: white;
    margin-left: 20px;
    text-decoration: none;
    font-weight: bold;
}

/* Main Card */
.container {
    width: 65%;
    margin: 60px auto;
    background: white;
    padding: 40px;
    border-radius: 12px;
    text-align: center;
    box-shadow: 0px 5px 15px rgba(0,0,0,0.1);
}

h1 {
    color: #1359B9;
}

/* Button Container */
.btn-container {
    display: flex;
    justify-content: center;
    flex-wrap: wrap;      /* 🔥 prevents overlap */
    gap: 20px;            /* spacing */
    margin-top: 25px;
}

/* Buttons */
.btn {
    padding: 14px 20px;
    border-radius: 10px;
    border: 2px solid #1359B9;
    color: #1359B9;
    text-decoration: none;
    font-weight: bold;
    min-width: 180px;     /* 🔥 keeps equal size */
    text-align: center;
    transition: 0.3s;
}

.btn:hover {
    background: #1359B9;
    color: white;
}
</style>

</head>

<body>

<!-- Navbar -->
<div class="navbar">
<h2>📦 Product Management System</h2>

<div>
<a href="index.jsp">Home</a>
<a href="productadd.jsp">Add</a>
<a href="productupdate.jsp">Update</a>
<a href="productdelete.jsp">Delete</a>
<a href="DisplayProductsServlet">View</a>
<a href="report_form.jsp">Reports</a>
</div>
</div>

<!-- Dashboard -->
<div class="container">

<h1>Welcome to Product Management System</h1>
<p>Manage product records, inventory, and reports with ease.</p>

<div class="btn-container">

<a href="productadd.jsp" class="btn">➕ Add Product</a>
<a href="productupdate.jsp" class="btn">✏️ Update Product</a>
<a href="productdelete.jsp" class="btn">🗑️ Delete Product</a>
<a href="DisplayProductsServlet" class="btn">📋 View Products</a>
<a href="report_form.jsp" class="btn">📊 Reports</a>

</div>

</div>

</body>
</html>