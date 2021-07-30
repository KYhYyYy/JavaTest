package ui;

import java.util.Scanner;

import action.Action;
import action.MemberListAction;
import action.MemberRegistAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {

	// 1. 필드
	public static Member[] memberArray = new Member[0];
	
	// 2. 메소드 
	public static void main(String[] args) {
		
		MemberController controller = new MemberController();
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		Action action = null;
		
		int menu = 0;
		
		do {
			System.out.println("==================================");
			System.out.println("1. 회원 등록     2. 회원 목록     3. 회원 수정 ");
			System.out.println("----------------------------------");
			System.out.println("4. 회원 삭제     5. 회원 검색     6. 시스템 종료");
			System.out.println("==================================");
			
			System.out.println("선택 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :	// 회원 등록
				action = new MemberRegistAction();
				break;
			case 2 :	// 회원 목록
				action = new MemberListAction();
				break;
			case 3 :	// 회원 수정
				
				action = null;
			case 4 :	// 회원 삭제
				
				action = null;
			case 5 :	// 회원 검색
				action = null;
				break;
			case 6 :	// 시스템 종료
				System.out.println("시스템을 종료합니다!");
				run = false;
				break;
			default :	// 그외
				System.out.println("잘못 입력했습니다. 다시 입력해주세요!");
				break;
			}
			
			if(action != null) {
				controller.processRequest(sc, action);
			}
			
		} while(run);
		

	}

}
