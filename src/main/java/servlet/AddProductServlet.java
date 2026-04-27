package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import dao.ProductDAO;
import model.Product;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            // 🔍 Debug
            System.out.println("ID: " + request.getParameter("id"));
            System.out.println("Name: " + request.getParameter("productName"));
            System.out.println("Category: " + request.getParameter("category"));
            System.out.println("Price: " + request.getParameter("price"));
            System.out.println("Quantity: " + request.getParameter("quantity"));

            // ✅ Get values
            String idStr = request.getParameter("id");
            String name = request.getParameter("productName");
            String category = request.getParameter("category");
            String priceStr = request.getParameter("price");
            String qtyStr = request.getParameter("quantity");

            // ❌ Empty validation
            if(idStr == null || name == null || category == null || priceStr == null || qtyStr == null ||
               idStr.isEmpty() || name.isEmpty() || category.isEmpty() || priceStr.isEmpty() || qtyStr.isEmpty()) {

                response.getWriter().println("<script>alert('Please fill all fields properly!'); window.history.back();</script>");
                return;
            }

            // ✅ Convert ID
            int id = Integer.parseInt(idStr);

            // ❌ Negative ID check
            if(id <= 0){
                response.getWriter().println("<script>alert('Product ID must be positive'); window.history.back();</script>");
                return;
            }

            // ✅ Convert remaining values
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(qtyStr);

            // ❌ Extra validation (recommended)
            if(price <= 0 || quantity < 0){
                response.getWriter().println("<script>alert('Price must be > 0 and Quantity cannot be negative'); window.history.back();</script>");
                return;
            }

            // ✅ Set object
            Product p = new Product();
            p.setProductId(id);
            p.setProductName(name);
            p.setCategory(category);
            p.setPrice(price);
            p.setQuantity(quantity);

            // ✅ Save
            ProductDAO dao = new ProductDAO();
            dao.addProduct(p);

            // ✅ Redirect
            response.sendRedirect("DisplayProductsServlet");

        } catch(Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h3 style='color:red;text-align:center;'>Error: " + e.getMessage() + "</h3>");
        }
    }
}