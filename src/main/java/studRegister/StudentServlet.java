package studRegister;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String emailId = req.getParameter("emailId");
		String password = req.getParameter("password");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>Student Resistration Form Data</h1>");
		printWriter.print("<p> firstName :: " + firstName + "</p>");
		printWriter.print("<p> lastName :: " + firstName + "</p>");
		printWriter.print("<p> firstName :: " + firstName + "</p>");
		printWriter.print("<p> firstName :: " + firstName + "</p>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		printWriter.close();
		System.out.println("firstName :: " + firstName);
		System.out.println("lastName :: " + lastName);
		System.out.println("emailId :: " + emailId);
		System.out.println("password :: " + password);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	private void name()
	{}


	private void printMe() {
	    System.out.println("My Name Here");
	}
}
