package day07;

// 단일 데이터으 ㅣ구성을 자바 빈즈로 나타내기
// 변수 중심, 값을 저장하는 것이 주 목적이다

public class Member {
	private int idx;
	private String id;
	private String pass;
	private String name;
	private int age;
	private String birth;	//yyyy-MM-dd
	
	public Member() {
	}

	public Member(int idx, String id, String pass, String name, int age, String birth) {
		super();
		this.idx = idx;
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.birth = birth;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
//	public String toString() { 
//		String form = "아이디 : [%s] 비번 : %s 나이 : %d 생년월일 : %s";
//		String str = String.format(form, id, pass, age, birth);
//		return str;
//	}

}
