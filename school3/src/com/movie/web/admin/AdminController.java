package com.movie.web.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;



import com.moive.web.global.Command;
import com.moive.web.global.CommandFactory;
import com.moive.web.global.DispatcherServlet;
import com.moive.web.global.Seperator;
import com.movie.web.grade.GradeBean;
import com.movie.web.grade.GradeMemberBean;
import com.movie.web.grade.GradeService;
import com.movie.web.grade.GradeServiceImpl;

import oracle.net.ano.Service;

/**
 * Servlet implementation class AdminController
 */
@WebServlet({"/admin/login_form.do","/admin/login.do","/admin/admin_form.do"})
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Command command = new Command();
    	AdminBean admin = new AdminBean();
    	HttpSession session = request.getSession();
    	String[] str = Seperator.divide(request, response);
    	AdminService service = (AdminService) AdminServiceImpl.getInstance();
		
		switch (str[0]) {
		
		case "admin_form": command = CommandFactory.createCommand(str[1], str[0]); break;
		case "login" :
			System.out.println("관리자 로그인 진입");
			admin.setId(request.getParameter("id"));
			admin.setPassword(request.getParameter("password"));
			AdminBean temp = service.getAdmin(admin);
			if (temp == null) {
				System.out.println("관리자 로그인 실패");
				command = CommandFactory.createCommand(str[1], "login_form");
			} else {
				System.out.println("관리자 로그인 성공");
				session.setAttribute("admin", temp);
				command = CommandFactory.createCommand(str[1], "admin_form");
			}
			
			break;
		default:
			command = CommandFactory.createCommand(str[1], str[0]);
			break;
		}
		DispatcherServlet.Go(request, response, command);
    }
 
}
