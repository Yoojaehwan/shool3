package com.movie.web.admin;

import java.util.List;

import com.movie.web.grade.GradeMemberBean;

public class AdminServiceImpl implements AdminService{
	private AdminDAO dao = AdminDAOImpl.getInstance(); 
	private static AdminServiceImpl serveice = new AdminServiceImpl();
	
	public static AdminService getService(){
		return serveice;
	}
	@Override
	public List<GradeMemberBean> getMemberList() {
		// TODO Auto-generated method stub
		return dao.getMemberList();
	}

	@Override
	public int addScore(GradeMemberBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

}
