package ui;

import java.util.Scanner;

import action.Action;
import action.MemberListAction;
import action.MemberRegistAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {

	// 1. �ʵ�
	public static Member[] memberArray = new Member[0];
	
	// 2. �޼ҵ� 
	public static void main(String[] args) {
		
		MemberController controller = new MemberController();
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		Action action = null;
		
		int menu = 0;
		
		do {
			System.out.println("==================================");
			System.out.println("1. ȸ�� ���     2. ȸ�� ���     3. ȸ�� ���� ");
			System.out.println("----------------------------------");
			System.out.println("4. ȸ�� ����     5. ȸ�� �˻�     6. �ý��� ����");
			System.out.println("==================================");
			
			System.out.println("���� >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :	// ȸ�� ���
				action = new MemberRegistAction();
				break;
			case 2 :	// ȸ�� ���
				action = new MemberListAction();
				break;
			case 3 :	// ȸ�� ����
				
				action = null;
			case 4 :	// ȸ�� ����
				
				action = null;
			case 5 :	// ȸ�� �˻�
				action = null;
				break;
			case 6 :	// �ý��� ����
				System.out.println("�ý����� �����մϴ�!");
				run = false;
				break;
			default :	// �׿�
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���!");
				break;
			}
			
			if(action != null) {
				controller.processRequest(sc, action);
			}
			
		} while(run);
		

	}

}
