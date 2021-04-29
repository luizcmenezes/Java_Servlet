package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OiMundo
 */
@WebServlet(urlPatterns="/oi")
public class OiMundo extends HttpServlet {

	private static final long serialVersionUID = 1L;

		@Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
                PrintWriter out = resp.getWriter();
                out.println("<html>");
                out.println("<body>");
                out.println("oi, parabens voce escreveu sua primeira servlet");
                out.println("</body>");
                out.println("</html>");
        }
}