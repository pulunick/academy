package quiz;

import java.util.ArrayList;

import day07.Member;

public class MemberHandler {
	
	private ArrayList<Member> list = new ArrayList<Member>();
	
	public MemberHandler() {
		setDummy();
	}
	
	private int idx = 0;

	private int nextIdx() {
		return ++idx;
	}

	private void setDummy() {
		list.add(new Member(nextIdx(),"hwo3094", "1234"));
		list.add(new Member(nextIdx(),"hwo1234", "12345"));
		list.add(new Member(nextIdx(),"hwo3336", "123"));
	}
	
	public Member login(Member ob) {
		Member login = null;
		for(Member p : list) {
			if(p.getId().equals(ob.getId()) && p.getPass().equals(ob.getPass())) {
				login = p;
				break;
			}
		}
		return login;
	}
	public Member getItem(int idx) {
		Member item = null;
		for (Member p : list) {
			if (p.getIdx() == idx) {
				item = p;
				break;
			}
		}
		return item;
	}
}
