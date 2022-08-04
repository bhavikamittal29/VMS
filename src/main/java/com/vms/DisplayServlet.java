package com.vms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String contact = req.getParameter("contact");
		String address = req.getParameter("address");
		String date = req.getParameter("date");
		String purpose = req.getParameter("purpose");
		String dept = req.getParameter("dept");
		String intime = req.getParameter("intime");
		pw.println("name: "+name+"  ");
		pw.println("gender: "+gender+"  ");
		pw.println("contact number: "+contact+"  ");
		pw.println("address: "+address+"  ");
		pw.println("date: "+date+"  ");
		pw.println("purpose: "+purpose+"  ");
		pw.println("dept: "+dept+"  ");
		pw.println("Check-In Time: "+intime);
		pw.close();
     
	}
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		doGet(req,res);
	}
	}
