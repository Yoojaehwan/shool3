package com.movie.web.grade;

public class GradeBean {
		private String id;
		private int hak, java, sql, jsp, spring;  //인스턴스
		
		//생성자 오버로딩
		public GradeBean() {} //defalut 

		public GradeBean( int hak, String id, int java, int sql, int jsp, int spring){
			this.hak = hak;
			this.id = id;
			this.java = java;
			this.sql = sql;
			this.jsp = jsp;
			this.spring = spring;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getHak() {
			return hak;
		}

		public void setHak(int shoolNum) {
			this.hak = shoolNum;
		}

		public int getJava() {
			return java;
		}

		public void setJava(int java) {
			this.java = java;
		}

		public int getSql() {
			return sql;
		}

		public void setSql(int sql) {
			this.sql = sql;
		}

		public int getJsp() {
			return jsp;
		}

		public void setJsp(int jsp) {
			this.jsp = jsp;
		}

		public int getSpring() {
			return spring;
		}

		public void setSpring(int spring) {
			this.spring = spring;
		}

		@Override
		public String toString() {
			return "성적표 [학번=" + hak + ", 아이디=" + id + ",  자바=" + java + ", SQL=" + sql + ", JSP=" + jsp
					+ ", SPRING=" + spring + "]";
		}

	}

