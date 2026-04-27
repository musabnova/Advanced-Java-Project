package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.ProductDAO;
import model.Product;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String category = request.getParameter("category");

        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Product p = new Product();
        p.setProductId(id);
        p.setProductName(name);
        p.setCategory(category);
        p.setPrice(price);
        p.setQuantity(quantity);

        ProductDAO dao = new ProductDAO();
        dao.updateProduct(p);

        response.sendRedirect("DisplayProductsServlet");
    }
}