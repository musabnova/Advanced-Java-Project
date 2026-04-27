# 🛒 Product Management System (Java Web Project)

A complete **Product Management System** built using **Java (Servlets + JSP)** and **MySQL**.  
This project allows users to manage product records including adding, updating, deleting, viewing, and generating reports.

---

## 🚀 Features

- ➕ Add Product  
- ✏️ Update Product  
- ❌ Delete Product  
- 📋 View All Products  
- 📊 Generate Reports  
  - Filter by Price  
  - Filter by Category  

---

## 🛠️ Technologies Used

- Java (Servlets, JSP)
- Apache Tomcat (v9)
- MySQL Database
- JDBC (Database Connectivity)
- HTML, CSS

---

## 🗂️ Project Structure
ProductWebApp/
│
├── src/main/java/
│ ├── dao/
│ │ ├── DBConnection.java
│ │ └── ProductDAO.java
│ │
│ ├── model/
│ │ └── Product.java
│ │
│ └── servlet/
│ ├── AddProductServlet.java
│ ├── DeleteProductServlet.java
│ ├── UpdateProductServlet.java
│ ├── DisplayProductsServlet.java
│ └── ReportServlet.java
│
├── webapp/
│ ├── index.jsp
│ ├── productadd.jsp
│ ├── productupdate.jsp
│ ├── productdelete.jsp
│ ├── productdisplay.jsp
│ ├── report_form.jsp
│ └── report_result.jsp
│
└── WEB-INF/
└── web.xml

---

## 🗄️ Database Setup

```sql
CREATE TABLE Products (
    ProductID INT PRIMARY KEY AUTO_INCREMENT,
    ProductName VARCHAR(100),
    Category VARCHAR(50),
    Price DOUBLE,
    Quantity INT
);

⚙️ How to Run
Clone the repository:
git clone https://github.com/your-username/Product-Management-System.git
Import project into Eclipse / IntelliJ
Configure Apache Tomcat Server
Setup MySQL database
Update DB credentials in:
DBConnection.java
Run the project:
http://localhost:8080/ProductWebApp/

📸 Screenshots
Home Page
Add Product
Delete Product
Edit Product
Product List
Reports

🎯 Project Objective
To develop a web-based application that efficiently manages product data,enabling CRUD operations and report generation using java web technologies.

📌 Key Learnings
Java Servlet & JSP integration
MVC Architecture
JDBC Database Connectivity
Form handling & validation
Dynamic data rendering

👨‍💻 Author
Musab Ahmad





