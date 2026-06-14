package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/test1")//webcontainer create HM
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet1() {
        super();
        System.out.println("-----Myservlet1-----p");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 //to send output on the browser side use printwriter
		
		PrintWriter pw=response.getWriter();
		
		response.setContentType("text/html");
		
		pw.print("<h1> Welcome to myservket1</h><br>");
		
		pw.print("Created " + LocalDateTime.now());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
