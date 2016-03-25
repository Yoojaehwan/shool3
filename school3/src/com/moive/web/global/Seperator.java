package com.moive.web.global;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.web.memer.MemberController;

public class Seperator {
	public static String[] divide(HttpServletRequest request, HttpServletResponse response){
	
		String id="",password="";
    	String path = request.getServletPath();
		String temp = path.split("/")[2];
		String directory = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		String action = temp.substring(0, temp.indexOf("."));
		String[] result = new String[2];
		result[0] =action;
		result[1] = directory;
		
		return result;
	}
	
}
