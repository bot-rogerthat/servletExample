package servletExample;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckEmptyFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;

        String login = request.getParameter("login");
        String name = request.getParameter("name");

        if (login != null && name != null && !"".equals(login) && !"".equals(name)) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect("400.html");
        }
    }

    public void destroy() {
    }
}
