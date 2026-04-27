package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import dao.ProductDAO;
import model.Product;

import javax.servlet.annotation.WebServlet;

@WebServlet("/DisplayProductsServlet")
public class DisplayProductsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProductDAO dao = new ProductDAO();
        List<Product> list = dao.getAllProducts();

        // 🔥 IMPORTANT
        request.setAttribute("list", list);

        RequestDispatcher rd = request.getRequestDispatcher("productdisplay.jsp");
        rd.forward(request, response);
    }
}