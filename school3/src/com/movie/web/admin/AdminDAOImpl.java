package com.movie.web.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.moive.web.global.Constants;
import com.moive.web.global.DatabaseFactory;
import com.moive.web.global.Vendor;
import com.movie.web.grade.GradeBean;
import com.movie.web.grade.GradeMemberBean;
import com.movie.web.memer.MemberBean;

public class AdminDAOImpl implements AdminDAO{
	private Connection conn; // 오라클 연결 객체
	private Statement stmt; // 쿼리 전송 객체
	private PreparedStatement pstmt; // 쿼리 전송 객체2
	private ResultSet rs;
	private static AdminDAO instance = new AdminDAOImpl();
	
	public static AdminDAO getInstance(){
		return instance;
	}
	
	
	public AdminDAOImpl() {
		conn = DatabaseFactory.getDatabase(Vendor.ORACLE, Constants.ID, Constants.PASSWORD)
				.getConnection();
	}
	
	@Override
	public List<GradeMemberBean> getMemberList() {
		GradeMemberBean  bean  = new GradeMemberBean();
		List<GradeMemberBean> array = new ArrayList<GradeMemberBean>();
		try {
			pstmt = conn.prepareStatement(" SELECT * FROM GradeMember ");
			rs = pstmt.executeQuery();
			while(rs.next()){
				bean.setId(rs.getString("id"));
				bean.setPassword(rs.getString("password"));
				bean.setName(rs.getString("name"));
				bean.setAddr(rs.getString("addr"));
				bean.setBirth(rs.getInt("birth"));
				bean.setHak(rs.getInt("score_seq"));
				bean.setJava(rs.getInt("java"));
				bean.setJsp(rs.getInt("jsp"));
				bean.setSpring(rs.getInt("spring"));
				bean.setSql(rs.getInt("sql"));
				array.add(bean);
				
			}
		} catch (Exception e) {
			System.out.println("getMemberList에서 에러 발생");
			e.printStackTrace();
		}
		return array;
	}
	@Override
	public int addScore(GradeMemberBean bean) {
		// TODO Auto-generated method stub
		return 0;
	} // 리턴값 회수 객체
}
