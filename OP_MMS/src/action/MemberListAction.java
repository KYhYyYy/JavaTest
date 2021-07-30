package action;

import java.util.Scanner;

import service.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		MemberListService mls = new MemberListService();
		Member[] memberArr = mls.getMemberArray();
		
		ConsoleUtil console = new ConsoleUtil();
		console.printMemberList(memberArr);

	}

}
