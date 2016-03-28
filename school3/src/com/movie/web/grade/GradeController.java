package com.movie.web.grade;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.web.global.Command;
import com.movie.web.global.CommandFactory;
import com.movie.web.member.MemberBean;
import com.movie.web.member.MemberServiceImpl;

/**
 * Servlet implementation class GradeController
 */
@WebServlet("/grade/my_grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static GradeService service = GradeServiceImpl.getInstance();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Command command = new Command();
    	GradeBean Grade = new GradeBean();
    	String id="";
    	String path = request.getServletPath();
		String temp = path.split("/")[2];
		String directory = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		String action = temp.substring(0, temp.indexOf("."));
		//command = CommandFactory.createCommand(directory,action);
		switch (action) {
		case "my_grade":
			
			request.setAttribute("score", service.getGradeById(request.getParameter("id")));
			command = CommandFactory.createCommand(directory,action);
			
			break;

		default:
			break;
		}
		RequestDispatcher dis = 
				request.getRequestDispatcher(command.getView());
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}