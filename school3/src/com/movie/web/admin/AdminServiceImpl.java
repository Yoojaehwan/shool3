package com.movie.web.admin;

import java.util.ArrayList;
import java.util.List;

import com.movie.web.grade.GradeBean;
import com.movie.web.grade.GradeDAO;
import com.movie.web.grade.GradeDAOImpl;
import com.movie.web.grade.GradeMemberBean;
import com.movie.web.grade.GradeServiceImpl;

public class AdminServiceImpl implements AdminService{
private static GradeServiceImpl instance = new GradeServiceImpl();

	public static GradeServiceImpl getInstance() {
		return instance;
	}
	GradeDAO dao = GradeDAOImpl.getInstance();
	
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
		return dao.selecctGradesByName(name);
	}

	@Override
	public GradeBean getGradeById(String id) {
		// TODO Auto-generated method stub
		return dao.getGradeById(id);
	}
}

