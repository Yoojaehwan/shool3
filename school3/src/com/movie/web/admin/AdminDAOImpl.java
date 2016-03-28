package com.movie.web.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	private ResultSet rs; // 리턴값 회수 객체
	private static AdminDAO instance = new AdminDAOImpl();
	
	public static AdminDAO getInstance() {
		return instance;
	}
	
	public AdminDAOImpl() {
		conn = DatabaseFactory.getDatabase(Vendor.ORACLE, Constants.ID, Constants.PASSWORD)
				.getConnection();
	}
	
	@Override
	public int addScore(GradeBean grade) {
		int result = 0;
		try {
			String sql = " INSERT INTO Grade(score_seq,id,java,sql,jsp,spring) VALUES (score_seq.nextval,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, grade.getId());
			pstmt.setInt(2, grade.getJava());
			pstmt.setInt(3, grade.getJsp());
			pstmt.setInt(4, grade.getSql());
			pstmt.setInt(5, grade.getSpring());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("getMemberList에서 에러 발생");
			e.printStackTrace();
		}
		return result;
	}
		
	

	@Override
	public List<GradeMemberBean> getMemberList() {
		GradeMemberBean bean;
		List<GradeMemberBean> arrList = new ArrayList<GradeMemberBean>();
		try {
			String sql = " SELECT * FROM GradeMember ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				bean = new GradeMemberBean();
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
				arrList.add(bean);
				
			}
		} catch (Exception e) {
			System.out.println("getMemberList에서 에러 발생");
			e.printStackTrace();
		}
		return arrList;
	}


	@Override
	public ArrayList<GradeMemberBean> getGradeByName(String name) {
		// TODO Auto-generated method stub
				ArrayList<GradeMemberBean> list = new ArrayList<>();		
				try {
					stmt = conn.createStatement();
					rs = stmt.executeQuery("SELECT * FROM GradeMember WHERE name ='"+name+"'");
					while (rs.next()) {
						GradeMemberBean bean =new GradeMemberBean();
						bean.setHak(rs.getInt("hak"));
						bean.setId(rs.getString("id"));
						bean.setJava(rs.getInt("java"));
						bean.setJsp(rs.getInt("jsp"));
						bean.setSql(rs.getInt("sql"));
						bean.setSpring(rs.getInt("spring"));
						bean.setPassword(rs.getString("password"));
						bean.setAddr(rs.getString("addr"));
						bean.setName(rs.getString("name"));
						bean.setBirth(rs.getInt("birth"));
						list.add(bean);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return list;
			}

	

	@Override
	public GradeBean getGradeById(String id) {
		GradeBean bean = new GradeBean();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Grade WHERE id ='"+id+"'");
			while (rs.next()) {
				bean.setId(rs.getString("id"));
				bean.setJava(rs.getInt("java"));
				bean.setJsp(rs.getInt("jsp"));
				bean.setSpring(rs.getInt("spring"));
				bean.setSql(rs.getInt("sql"));
			}
			
		} catch (Exception e) {
			System.out.println("selectMember() 에서 에러 발생함 !!");
			e.printStackTrace();
		}
		
		return bean;
	}

	@Override
	public AdminBean selectAdmin(AdminBean admin) {
		AdminBean temp = new AdminBean();
		try {
			System.out.println("넘어온 admin Id"+admin.getId());
			pstmt = conn.prepareStatement("SELECT * FROM Admin WHERE id = ? and password=?");
			pstmt.setString(1, admin.getId());
			pstmt.setString(2, admin.getPassword());
			while (rs.next()) {
				temp.setId(rs.getString("id"));
				temp.setName(rs.getString("name"));
				temp.setPassword(rs.getString("password"));
				temp.setAddr(rs.getString("addr"));
				temp.setBirth(rs.getInt("birth"));
				temp.setRole(rs.getString("role"));
			}
			
		} catch (Exception e) {
			System.out.println("selectAdmin() 에서 에러 발생함 !!");
			e.printStackTrace();
		}
		System.out.println("쿼리 조회 결과 :"+temp.getRole());
			return temp;
		}
	
	

	@Override
	public AdminBean selectById(String id, String password) {
		
			return null;
		}
		
	}


