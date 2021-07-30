package action;

import java.util.Scanner;

import service.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;

public class MemberRegistAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		Member newMember = console.getNewMember(sc);
		// console.getNewMember(sc) : �Է��� ȸ������
		
		MemberRegistService mrs = new MemberRegistService();
		boolean registSuccess = mrs.registMember(newMember);
		
		if(registSuccess) {
			// ȸ����ϼ��� �޼���(�޼ҵ� ȣ��)
			console.printRegistSuccessMessage(newMember.getId());
		} else {
			// ȸ����Ͻ��� �޼���(�޼ҵ� ȣ��)
			console.printRegistFailMessage(newMember.getId());
		}
		
		
	}

}
