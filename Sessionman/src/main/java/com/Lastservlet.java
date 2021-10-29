package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import djo.User;

/**
 * Servlet implementation class Lastservlet
 */
public class Lastservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lastservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);
		
		if(session!=null) {
		User U=(User)session.getAttribute("user");
		U.setPhone(Long.parseLong(request.getParameter("phone")));
		U.setEmail(request.getParameter("email"));
		
		PrintWriter out=response.getWriter();
		out.print("Hello"+U.getEmail());
		out.print("Mr."+U.getFname()+U.getLname());
		out.print("Details"+U);
		out.print("Session ID"+session.getId()+"   "+"Session created at"+session.getCreationTime());
		session.invalidate();}
	}

}
