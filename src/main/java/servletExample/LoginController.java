package servletExample;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        HttpSession session = request.getSession();
        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);

        response.sendRedirect("welcome");
    }
}
