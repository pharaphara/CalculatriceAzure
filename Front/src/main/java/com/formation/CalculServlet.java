package com.formation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CalculServlet
 */
@WebServlet("/add")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("nombre1"));
		int num2 = Integer.parseInt(request.getParameter("nombre2"));
		Calcul calcul = new Calcul();
		int resultat = calcul.additionner(num1,num2);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Addition</title></head>");
		out.println("<center>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td> Nombre 1 </td>");
		out.println("<td>" + num1 + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Nombre 2 </td>");
		out.println("<td>" + num2 + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Resultat </td>");
		out.println("<td>" + resultat + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</center>");
		



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
