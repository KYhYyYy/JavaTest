package action;

import java.util.Scanner;

public interface Action {
	// �� ��û�� ó���ϴ� ActionŬ���� ��ü���� ���¸� ������ �������̽�
	// ��� action Ŭ���� ��ü�� execute() �޼ҵ带 ������ �ؾ� �Ѵ�.
	
	void execute(Scanner sc) throws Exception;
}
