package servletExample;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        if (!"".equals(firstName) && !"".equals(lastName)) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect("400.html");
        }
    }

    public void destroy() {
    }
}
