package summary;

public class Cat extends Animal implements Food {

	Cat(String name) {
		super(name);
	}
	
	@Override
	public String getFeed() {
		return "츄르를";
	}

	@Override
	public String bob() {
		return "츄르를";
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String method() {
		return "던져";
	}
	

}
