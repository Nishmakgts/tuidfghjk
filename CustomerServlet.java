package myProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myProject.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  Customer c1=new Customer();
		  c1.setCustomerName(request.getParameter("customerName"));
		  c1.setCustomerId(request.getParameter("customerID"));
		  c1.setAddress(request.getParameter("address"));
		  c1.setContact(request.getParameter("contact"));
		  c1.setUserName(request.getParameter("UserName"));
		  c1.setPassword(request.getParameter("Password"));
		  
		  
		  HttpSession hs=request.getSession();
		  hs.setAttribute("customer", c1);
		  RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	      rd.forward(request, response);
	}

}
