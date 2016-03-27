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
@WebServlet("/admin/admin_form.do")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
/*	private static AdminService service = (AdminService) AdminServiceImpl.getInstance();*/

       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Command command = new Command();
		String[] str = Seperator.divide(request, response);
		
		
		switch (str[0]) {

		case "admin_form": command = CommandFactory.createCommand(str[1], str[0]); break;
		/*case "member_list": 
			request.setAttribute("totalScore", service.getMemberList());
					command = CommandFactory.createCommand("grade", "grade_list");break;*/	
		default:
			command = CommandFactory.createCommand(str[1], str[0]);
			break;
		}
		DispatcherServlet.Go(request, response, command);
    }
 
}
