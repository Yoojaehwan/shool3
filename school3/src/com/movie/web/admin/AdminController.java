package com.movie.web.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moive.web.global.Command;
import com.moive.web.global.CommandFactory;
import com.moive.web.global.DispatcherServlet;
import com.moive.web.global.Seperator;
import com.movie.web.grade.GradeMemberBean;
import com.movie.web.memer.MemberBean;
import com.movie.web.memer.MemberService;

@WebServlet({"/admin/admin_form.do","/admin/member_list.do"})
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
      @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  System.out.println("관리자 화면");
      	  Command command = new Command();
      	  String[] str = Seperator.divide(request, response);
      	
  		switch (str[0]) {
  		case "admin_form" : 
  			System.out.println("admin_form 에러@@@@@@@@@@@@@");
  			command = CommandFactory.createCommand(str[1],str[0]); break;
  		
  		default: command = CommandFactory.createCommand(str[1],str[0]); break;
  		}
  		DispatcherServlet.Go(request, response, command);
  	}
}
    

