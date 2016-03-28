package com.movie.web.admin;

import java.util.ArrayList;
import java.util.List;

import com.movie.web.grade.GradeBean;
import com.movie.web.grade.GradeDAO;
import com.movie.web.grade.GradeDAOImpl;
import com.movie.web.grade.GradeMemberBean;
import com.movie.web.grade.GradeServiceImpl;
import com.movie.web.memer.MemberBean;

public class AdminServiceImpl implements AdminService{
private static AdminServiceImpl instance = new AdminServiceImpl();

	public static AdminServiceImpl getInstance() {
		return instance;
	}
	AdminDAO dao = AdminDAOImpl.getInstance();
	
	ArrayList<GradeBean> gradeList;
	
	public AdminServiceImpl() {
		gradeList = new ArrayList<GradeBean>(); // 초기화
	}

	@Override
	public int addScore(GradeBean grade) {
		return addScore(grade);
	}
	@Override
	public List<GradeMemberBean> getMemberList() {
		// TODO Auto-generated method stub
		return getMemberList();
	}

	@Override
	public ArrayList<GradeMemberBean> getGradeByName(String name) {
		// TODO Auto-generated method stub
		return dao.getGradeByName(name);
	}

	@Override
	public GradeBean getGradeById(String id) {
		// TODO Auto-generated method stub
		return dao.getGradeById(id);
	}

	@Override
	public AdminBean getAdmin(AdminBean admin) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AdminBean login(String id, String password) {
		AdminBean admin = new AdminBean();
		admin = dao.selectById(id, password);
		if (admin != null) {
			System.out.println("서비스 : 멤버가 널이 아님");
			return admin;
		} else {
			System.out.println("서비스 : 멤버가 널임");
			return null;
		}
		// 로그인
		// 아이디가 존재하지 않아서 실패한 경우와 비번이 틀려서 실패한 경우에 따라서
		// 메시지를 전달해줘야 함
	}
	@Override
	public boolean isAdmin(String id ) {
		boolean admin = false;
		admin = dao.isAdmin(id);
		
		if (admin == true) {
			return admin;
		} else {
			return false;
		}
	}
}

