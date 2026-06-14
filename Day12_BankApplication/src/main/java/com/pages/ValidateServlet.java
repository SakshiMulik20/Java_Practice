package com.pages;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dal.AccountDAO;
import com.pojo.Account;
import com.util.ConnectionUtil;

@WebServlet("/validateAccount")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;

	public ValidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

		try {
			System.out.println("---init---ValidationServlet-----");
			con = ConnectionUtil.getDBConnection();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void destroy() {
		System.out.println("---destroy ValidationServlet----");
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---con closed-----");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("---doGet---ValidationServlet-----");

			// accept email and password from login.html
			String email = request.getParameter("txtemail");

			String pwd = request.getParameter("txtpwd");

			// chk email,pwd with db table Account

			AccountDAO actDao = new AccountDAO();

			Account act = actDao.login(email, pwd);
			
			if(act!=null)
			{
				System.out.println("Valid User"+act);
				//valid user will get redirect to transaction
				RequestDispatcher rd=request.getRequestDispatcher("/transaction");
				
				//create session for valid user
				HttpSession session=request.getSession();
				session.setAttribute("accountDetails", act);
				
				
				rd.forward(request, response);
				
				
			}
			else
			{
				System.out.println("Invalid User");
				response.sendRedirect("login.html");
			}
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}