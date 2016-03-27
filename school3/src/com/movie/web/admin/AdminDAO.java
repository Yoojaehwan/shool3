package com.movie.web.admin;

import java.util.ArrayList;
import java.util.List;

import com.movie.web.grade.GradeBean;
import com.movie.web.grade.GradeMemberBean;
import com.movie.web.memer.MemberBean;

public interface AdminDAO {
	// C 성적표 등록 
	public int addScore(GradeBean grade); // 추상 메소드
	// R 성적표 리스트 출력
	public List<GradeMemberBean> getMemberList();
	// R 성적표 조회(이름)
	public ArrayList<GradeMemberBean> getGradeByName(String name);
	// R 성적표 조회(아이디)
	public GradeBean getGradeById(String id);
}

