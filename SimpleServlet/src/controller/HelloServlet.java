package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yourName = request.getParameter("yourName");
		String lastName = request.getParameter("lastName");
		String capitalizedName = yourName.substring(0,1).toUpperCase() +
		yourName.substring(1).toLowerCase() + " "+
		lastName.substring(0,1).toUpperCase() +
		lastName.substring(1).toLowerCase();
		PrintWriter writer = response.getWriter();
		writer.println("Hello " + capitalizedName );
		writer.close();
	}

}
