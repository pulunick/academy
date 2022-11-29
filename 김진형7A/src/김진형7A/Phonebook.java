package 김진형7A;

public class Phonebook {
	private int idx;
	private String name;
	private String tel;

	public Phonebook() {
	}

	public Phonebook(int idx, String name, String tel) {
		super();
		this.idx = idx;
		this.name = name;
		this.tel = tel;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
