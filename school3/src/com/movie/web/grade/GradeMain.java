package com.movie.web.grade;

import java.util.Scanner;




public class GradeMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		//메서드 내부이므로 지역변수이고 지역변수 이므로 초기화해도 문법상 문제가 없다.

		
		while (true) {
			System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수  0.종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("학번,이름,JAVA,SQL,JSP,Spring");
				service.input(new GradeBean(s.nextInt(), s.next(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));		
				break;
			case 2:
				System.out.println("수정하는 성적의 java,sql,jsp,spring 점수를 입력하시오");
				System.out.println(service.getGradeByHak(s.nextInt()));
				break;
			case 3:
				System.out.println("삭제하실 학번을 입력하세요");
				System.out.println(service.delete(s.nextInt()));
				System.out.println("삭제 완료 되었습니다.");
				break;
			case 4:
				System.out.println(service.getList().toString());
				break;
			case 5:
				System.out.println("조회하려는 이름을 입력하시오");
				System.out.println(service.getGradesByName(s.next()).toString());
				break;
			case 6:
				System.out.println("조회 하려는 학번을 입력하세요");
				System.out.println(service.getGradeByHak(s.nextInt()).toString());
				break;
			case 7:
				System.out.println(service.getCount()+ " 명");
				break;
			case 0:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 값 입니다");
				return;
			}
		}

	}
}