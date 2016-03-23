package com.movie.web.memer;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		int result = 0;
		MemberService service = new MemberServiceImpl();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 1.회원가입 2.로그인 3.내정보보기 4.내정보수정 5.탈퇴 0,종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("아이디,이름,비번,주소,생년월일 입력");
				System.out.println("Main 회원가입  결과 :"+service.join(new MemberBean(s.next(), s.next(), s.next(), s.next(), s.nextInt())));
				
				break;
			case 2:
				System.out.println("아이디, 비밀번호 입력");
				MemberBean tempBean = service.login(s.next(), s.next());
				tempBean = ((tempBean != null)) ? tempBean : null;
				System.out.println((tempBean != null) ? "로그인 성공" : "로그인 실패");
				break;
			case 3:
				System.out.println("아이디입력, 비밀번호 입력");
				System.out.println(service.detail(s.next()).toString());
				break;
			case 4:
				
				break;

			case 5:
				
				break;
			case 0:
				System.out.println("시스템 종료");
				return;

			default:
				return;
			}
		}
	}

}
