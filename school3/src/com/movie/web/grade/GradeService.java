package com.movie.web.grade;

import java.util.ArrayList;


/**
 * CRUD 
 *  C : Create 생성
 *  R : Read   조회
 *  U : Update 수정
 *  D : Delete 삭제
 *@package : grade
 *@file : GradeService.java
 *@author 류재환
 *@date 2016. 3. 14.
 *@story 속성은 감추고 기능은 오픈한다.
 */

public interface GradeService {
	// C 성적표 등록 
	public void input(GradeBean grade); // 추상 메소드
	// R 성적표 리스트 출력
	public ArrayList<GradeBean> getList();
	// R 성적표 조회(학번)
	public GradeMemberBean getGradeByHak(int hak);
	// R 성적표 조회(이름)
	public ArrayList<GradeMemberBean> getGradesByName(String name);
	// R 카운트 조회
	public int getCount();
	// R 이름조회시 카운트 조회
	public void getCountByName();
	// U 성적표 수정
	public String update(GradeBean grade);
	// D 성적표 삭제
	public String delete(int hak);
	// R 성적표 조회(아이디)
	public GradeBean getGradeById(String id);
	
	
}