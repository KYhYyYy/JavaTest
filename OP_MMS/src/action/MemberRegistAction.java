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
		// console.getNewMember(sc) : 입력한 회원정보
		
		MemberRegistService mrs = new MemberRegistService();
		boolean registSuccess = mrs.registMember(newMember);
		
		if(registSuccess) {
			// 회원등록성공 메세지(메소드 호출)
			console.printRegistSuccessMessage(newMember.getId());
		} else {
			// 회원등록실패 메세지(메소드 호출)
			console.printRegistFailMessage(newMember.getId());
		}
		
		
	}

}
