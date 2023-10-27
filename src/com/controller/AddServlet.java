package com.controller;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {

		// read n1 n2

		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));

		int ans = n1 + n2;

		// print ans -> browser ->
		try {
			PrintWriter out = response.getWriter();// server -> client
			out.print("Addition = "+ans);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
