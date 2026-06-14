
package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Account;

/**
 * Servlet implementation class TransactionServlet
 */
@WebServlet("/transaction")
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public TransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		try {
			System.out.println("---do-get--- TRansactionServlet");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		//get valid user account details
		HttpSession  session=request.getSession();
		
		Account act=(Account)session.getAttribute("accountDetails");
		System.out.println("DEtails :"+act);
		
		pw.print("<h2>Welcome To Transaction</h2>");
		
		pw.println("<h3> Customer Name:"+act.getName());
		pw.println("<h3> Customer Email:"+act.getEmail());
		pw.println("<h3> Customer Balance :"+act.getBalance());
		
		
		pw.println("<div>");
        pw.print("<form action='withdraw' method='post'>");
		pw.println("<b>Enter Amount :</b><input type='text' name='txtamount'>");
		pw.println("<b> :</b><input type='submit' value='WithdrawAmount'>");
		pw.print("</form>");
		pw.println("</div>");
		
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}