package memberManagement;

import java.util.ArrayList;

public class Handler {

	private ArrayList<Member> list = new ArrayList<Member>();
	
	public ArrayList<Member> getList() {
		return list;
	}
	
	public void setDummy() {
		if(list.isEmpty()) {
		list.add(new Member("test", "1234","테스트",20));
		list.add(new Member("itbank", "it","아이티뱅크",30));
		list.add(new Member("admin", "1","관리자",40));
		}
	}
	
	private boolean isDuplicat(Member mem) {
		boolean flag = false;
		for(Member m : list) {
			if(m.getUserid().equals(mem.getUserid())) {
				return true;
			}
		}
		return flag;
	}
	
	public int insert(Member mem) {
		if(isDuplicat(mem)) {	// 만약 ob가 중복이면
			return 0;			// 추가하지않고 함수종료
		}
		boolean flag = list.add(mem);
		return flag ? 1 : 0;
	}
	
	public void delete(String userid) {
		for(Member mem : list) {
			if(mem.getUserid().equals(userid)) {
				list.remove(mem);
				return;
			}
		}
	}
	
	public void update(String userid) {
		for(Member mem : list) {
			if(mem.getUserid().equals(userid)) {
				list
			}
		}
	}
	
	
}
