package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("----Inside display servlet----");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		
		pw.print("\nRequested at : " + LocalDateTime.now());
		pw.print("<br><h1>Display servlet</h1>");
		
		System.out.println("----doGet of Display servlet------");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
