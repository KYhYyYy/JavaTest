package service;

import ui.MemberUI;
import vo.Member;

public class MemberRegistService {

	public boolean registMember(Member newMember) throws Exception {
		
		boolean registSuccess = true;
		
		// 아이디 중복체크
		for(int i=0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == newMember.getId()) {
				registSuccess = false;
				break;
			}
		}
		
		// 아이디 중복이 아닐 경우 : registSuccess값은 true -> if문 실행
		if(registSuccess) {
			Member[] tempArray = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length+1];
			
			for(int i=0; i<tempArray.length; i++) {
				MemberUI.memberArray[i] = tempArray[i];
			}
			
			MemberUI.memberArray[MemberUI.memberArray.length-1] = newMember;
		}
		
		return registSuccess;
		
	}
}
