package util;

import java.util.Scanner;

import vo.Member;

public class ConsoleUtil {

	// 회원 정보를 등록하는 메소드
	public Member getNewMember(Scanner sc) {
		
		// Member객체 생성
		Member newMember = new Member();
		
		System.out.println("==== 새 회원 정보 등록 ====");
		
		System.out.println("회원 아이디 >> ");
		int id = sc.nextInt();
		
		System.out.println("회원 이름 >> ");
		String name = sc.next();
		
		System.out.println("회원 연락처 >> ");
		String phone = sc.next();
		
		System.out.println("회원 나이 >> ");
		int age = sc.nextInt();
		
		System.out.println("회원 주소 >> ");
		String addr = sc.next();
		
		System.out.println("회원 이메일 >> ");
		String email = sc.next();
		
		System.out.println("회원 취미 >> ");
		String hobby = sc.next();
		
		newMember.setId(id);
		newMember.setName(name);
		newMember.setPhone(phone);
		newMember.setAge(age);
		newMember.setAddr(addr);
		newMember.setEmail(email);
		newMember.setHobby(hobby);
		
		System.out.println(newMember.toString());
		
		return newMember;
		
	}
	
	// 회원 등록이 성공했을 시 메시지
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "번 회원 등록 성공!");
	}
	
	// 회원 등록이 실패했을 시 메시지
	public void printRegistFailMessage(int id) {
		System.out.println(id + "번 회원 등록 실패!");
	}
	
	// 회원 목록을 출력하는 메소드
	public void printMemberList(Member[] memberArr) {
		// 회원 정보 존재 유무 파악
		if(memberArr.length == 0) {
			System.out.println("추가된 회원 정보가 없습니다.");
		} else {
			
			for(int i=0; i<memberArr.length; i++) {
				System.out.println(memberArr[i]);
			}
		}
	}
}
