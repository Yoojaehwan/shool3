package com.movie.web.global;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null; // 지역변수니까 초기화
		ResultSet rs = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ID, Constants.PASSWORD);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Test");
			String sample = "";
			
			while (rs.next()) {
				sample = rs.getString("sample");
			}
			System.out.println("샘플 : " + sample);
			
		} catch (Exception e) {
			System.out.println("오라클 에러 발생");
			e.printStackTrace();
		}
	}
}
