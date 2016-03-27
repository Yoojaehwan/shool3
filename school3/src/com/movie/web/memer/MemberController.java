package com.movie.web.memer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moive.web.global.Command;
import com.moive.web.global.CommandFactory;
import com.moive.web.global.DispatcherServlet;
import com.moive.web.global.Seperator;
import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane.ScalableIconUIResource;

import javafx.scene.control.Separator;

@WebServlet({"/member/login_form.do",
	"/member/join_form.do","/member/update_form.do",
	"/member/join.do","/member/update.do","/member/delete.do",
	"/member/login.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static MemberService service = MemberServiceImpl.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				System.out.println("인덱스에서 들어옴");
    	
    	Command command = new Command();
    	MemberBean member = new MemberBean();
    	String[] str = Seperator.divide(request, response);
    	//str[0] = action;
    	//str[1] = directory;
    	System.out.println(str[0]);
  
		switch (str[0]) {
		case "login" :
			if (service.isMember(request.getParameter("id")) == true) {
				System.out.println("=== 아이디가 존재함 ===");
				member = service.login(request.getParameter("id"), request.getParameter("password"));
				if (member == null) {
					command = CommandFactory.createCommand(str[1],"login_form");
				}else{
					System.out.println("=== 로그인 성공 ===");
					request.setAttribute("member", member);
					command = CommandFactory.createCommand(str[1],"detail");
				}
			} else {
				System.out.println("=== 로그인 실패 ===");
				command = CommandFactory.createCommand(str[1],"login_form");
			}
			
			
			break;
		case "update_form":
			System.out.println("=== 수정 폼으로 진입 ===");
			request.setAttribute("member", service.detail(request.getParameter("id")));
			command = CommandFactory.createCommand(str[1],str[0]);
			break;
		
		case "delete":
				if (service.remove(request.getParameter("id"))==1) {
					command = CommandFactory.createCommand(str[1],"login_form");
				} else {
					request.setAttribute("member", service.remove("id"));
					command = CommandFactory.createCommand(str[1],"detail");
				}
				break;
		case "join":
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPassword(request.getParameter("password"));
			member.setAddr(request.getParameter("addr"));
			member.setBirth(Integer.parseInt(request.getParameter("birth")));
			if (service.join(member)==1) {
				command = CommandFactory.createCommand(str[1],"login_form");
			} else {
				command = CommandFactory.createCommand(str[1],"join_form");
			}
			
			break;
		case "update":
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPassword(request.getParameter("password"));
			member.setAddr(request.getParameter("addr"));
			member.setBirth(Integer.parseInt(request.getParameter("birth")));
			if (service.update(member)==1) { 
				request.setAttribute("member", service.detail(request.getParameter("id")));
				command = CommandFactory.createCommand(str[1],"detail");
			}else{
				request.setAttribute("member", service.detail(request.getParameter("id")));
				command = CommandFactory.createCommand(str[1],"update_form");
			}
			break;
		default:
			command = CommandFactory.createCommand(str[1],str[0]);
			break;
		}
		DispatcherServlet.Go(request, response, command);
	}
}