package com.movie.web.admin;



public class AdminBean  {
	private String role;
	private String id, password, name, addr;
	private int birth; // 생년월일은 800101 처럼 숫자만 입력

	
	public AdminBean() {}//생성자 오버로딩
	public AdminBean(String id, String password, String name, String addr, int birth) {
		this.id= id;
		this.password = password;
		this.name = name;
		this.addr = addr;
		this.birth = birth;
		
	}
	
	
	public String getRole() {
		return role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
