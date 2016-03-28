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
	private static AdminService service = (AdminService) AdminServiceImpl.getInstance();

       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Command command = new Command();
    	AdminBean admin = new AdminBean();
    	HttpSession session = request.getSession();
    	String[] str = Seperator.divide(request, response);
		
		
		switch (str[0]) {
		
		case 

		case "login" :
			if (service.isAdmin(request.getParameter("id")) == true) {
				System.out.println("=== 아이디가 존재함 ===");
				admin = service.login(request.getParameter("id"), request.getParameter("password"));
				if (admin == null) {
					command = CommandFactory.createCommand(str[1],"admin_login_form");
				}else{
					System.out.println("=== 로그인 성공 ===");
					//request.setAttribute("member", member);//지우기 속도 향상 //dom 담기 
					session.setAttribute("admin", admin);//bom 담기
					command = CommandFactory.createCommand(str[1],"admin_form");
				}
			} else {
				System.out.println("=== 로그인 실패 ===");
				command = CommandFactory.createCommand(str[1],"admin_login_form");
			}
			
			break;
		default:
			command = CommandFactory.createCommand(str[1], str[0]);
			break;
		}
		DispatcherServlet.Go(request, response, command);
    }
 
}
