package service;

import ui.MemberUI;
import vo.Member;

public class MemberRegistService {

	public boolean registMember(Member newMember) throws Exception {
		
		boolean registSuccess = true;
		
		// ���̵� �ߺ�üũ
		for(int i=0; i < MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == newMember.getId()) {
				registSuccess = false;
				break;
			}
		}
		
		// ���̵� �ߺ��� �ƴ� ��� : registSuccess���� true -> if�� ����
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
