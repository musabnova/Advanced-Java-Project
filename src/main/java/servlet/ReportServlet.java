package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import dao.ProductDAO;
import model.Product;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ReportServlet")
public class ReportServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String type = request.getParameter("type");
        ProductDAO dao = new ProductDAO();
        List<Product> list = null;

        if(type.equals("price")){
            double price = Double.parseDouble(request.getParameter("value"));
            list = dao.getProductsByPrice(price);
        }
        else if(type.equals("category")){
            String category = request.getParameter("value");
            list = dao.getProductsByCategory(category);
        }

        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("report_result.jsp");
        rd.forward(request, response);
    }
}