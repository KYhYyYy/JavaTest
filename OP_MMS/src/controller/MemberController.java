package controller;

import java.util.Scanner;

import action.Action;

public class MemberController {

	public void processRequest(Scanner sc, Action action) {
		
		// 예외 처리
		try {
			// 발생 지점 :  오류가 발생할 것 같은 부분
			action.execute(sc);
			
		} catch(Exception e) {
			// 처리 지점 : 오류가 발생했을 시 대처하는 부분
			
			e.printStackTrace();
			
			// printStackTrace() : 오류 발생 경로 및 메시지 출력
		}
	}
}
