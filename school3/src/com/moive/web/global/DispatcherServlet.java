package com.moive.web.global;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moive.web.global.Command;

public class DispatcherServlet {
	public static void Go(HttpServletRequest request, HttpServletResponse response, Command command) {
	
		try {
			RequestDispatcher dis = request.getRequestDispatcher(command.getView());
			dis.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
