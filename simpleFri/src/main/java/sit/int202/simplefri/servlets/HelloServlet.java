package sit.int202.simplefri.servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello

        // 1.setContentType
        // 2.getHeader
        // 3.getWriter
        String browser = request.getHeader("User-Agent");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h3>Your browser is " + browser + "</h3>");
        out.println("</body></html>");
    }

    public void destroy() {

    }
}