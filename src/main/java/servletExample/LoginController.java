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
        String login = request.getParameter("login");
        String name = request.getParameter("name");

        HttpSession session = request.getSession();
        session.setAttribute("login", login);
        session.setAttribute("name", name);

        response.sendRedirect("welcome");
    }

}
