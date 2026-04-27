package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.ProductDAO;
import javax.servlet.annotation.WebServlet;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        ProductDAO dao = new ProductDAO();
        dao.deleteProduct(id);

        response.sendRedirect("DisplayProductsServlet");
    }
}