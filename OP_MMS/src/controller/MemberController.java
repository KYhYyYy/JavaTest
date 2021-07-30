package controller;

import java.util.Scanner;

import action.Action;

public class MemberController {

	public void processRequest(Scanner sc, Action action) {
		
		// ���� ó��
		try {
			// �߻� ���� :  ������ �߻��� �� ���� �κ�
			action.execute(sc);
			
		} catch(Exception e) {
			// ó�� ���� : ������ �߻����� �� ��ó�ϴ� �κ�
			
			e.printStackTrace();
			
			// printStackTrace() : ���� �߻� ��� �� �޽��� ���
		}
	}
}
