package quiz;

public class Member {
	private int idx;
	private String id;
	private String pass;
	
	public Member() {
	}

	public Member(int idx,String id, String pass) {
		super();
		this.idx = idx;
		this.id = id;
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	

}
