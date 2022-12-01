package day07;

import java.util.ArrayList;
import java.util.stream.Collectors;



// 상세 기능 및 데이터 유지
// 함수 중심, 데이터를 어떤 방식(method)으로 처리할 것인가?


public class MemberHandler {
	
	private ArrayList<Member> list = new ArrayList<Member>();
	
	public MemberHandler() {
		setDummy();
	}
	
	private int idx = 0;

	private int nextIdx() {
		return ++idx;
	}
	
	// private : 외부에서 호출하는 함수가 아니다(내부에서만 사용한다)
	// void : 결과를 보고할 필요가 없다. 결과값을 반환하여 다른 함수와 연계하지 않는다
	private void setDummy() {
		list.add(new Member(nextIdx(),"hwo3094", "12345", "김진형", 27, "1996-08-04"));
		list.add(new Member(nextIdx(),"hwo3133", "123456", "장나현", 24, "1999-11-13"));
		list.add(new Member(nextIdx(),"hwo3727", "1234567", "김경문", 23, "2000-03-11"));	
	}
	
	
	public void show() {
		for(Member s : list) {
			System.out.print(s.getId()+"/");
			System.out.print(s.getName()+"/");
			System.out.print(s.getPass()+"/");
			System.out.print(s.getAge()+"/");
			System.out.println(s.getBirth()+"/");
		}
		
	}
	
	public ArrayList<Member> getList() {
		return list;
	}
	
	public boolean insert(Member ob) {
		boolean flag = false;
		int dupSize = 										
				list.stream().											// (리스트의 스트림 호출)
				filter(member -> member.getId().equals(ob.getId()))		// 필터(아이디가 일치하는 요소만 남긴다)
				.collect(Collectors.toList()).size();			// 다시 리스트로 변환하여, 사이즈를 int형으로 저장
		
		System.out.println(dupSize);
		
		if(dupSize == 0) {
			flag = list.add(ob);
		}
		return flag;
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
	
	public Member login(Member ob) {
		Member login = null;
		// 리스트에서 id와 pw가 일치하는 계정이 있으면 login 변수에 저장한다
		for(Member p : list) {
			if(p.getId().equals(ob.getId()) && p.getPass().equals(ob.getPass())) {
				login = p;
				break;
			}
		}
		return login;
	}
	
	public int modify(Member ph) {
		int row = 0;
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(ph.getId())) {
				index = i;
				break;
			}
		}
		list.set(index, ph);
		
		return index;
	}
	
//	public boolean idcheck(String id) {
//		boolean check = true;
//		if(list.getId() == id) {
//			
//		}
//	}
	
	

}
