package util;

import java.util.Scanner;

import vo.Member;

public class ConsoleUtil {

	// ȸ�� ������ ����ϴ� �޼ҵ�
	public Member getNewMember(Scanner sc) {
		
		// Member��ü ����
		Member newMember = new Member();
		
		System.out.println("==== �� ȸ�� ���� ��� ====");
		
		System.out.println("ȸ�� ���̵� >> ");
		int id = sc.nextInt();
		
		System.out.println("ȸ�� �̸� >> ");
		String name = sc.next();
		
		System.out.println("ȸ�� ����ó >> ");
		String phone = sc.next();
		
		System.out.println("ȸ�� ���� >> ");
		int age = sc.nextInt();
		
		System.out.println("ȸ�� �ּ� >> ");
		String addr = sc.next();
		
		System.out.println("ȸ�� �̸��� >> ");
		String email = sc.next();
		
		System.out.println("ȸ�� ��� >> ");
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
	
	// ȸ�� ����� �������� �� �޽���
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "�� ȸ�� ��� ����!");
	}
	
	// ȸ�� ����� �������� �� �޽���
	public void printRegistFailMessage(int id) {
		System.out.println(id + "�� ȸ�� ��� ����!");
	}
	
	// ȸ�� ����� ����ϴ� �޼ҵ�
	public void printMemberList(Member[] memberArr) {
		// ȸ�� ���� ���� ���� �ľ�
		if(memberArr.length == 0) {
			System.out.println("�߰��� ȸ�� ������ �����ϴ�.");
		} else {
			
			for(int i=0; i<memberArr.length; i++) {
				System.out.println(memberArr[i]);
			}
		}
	}
}
