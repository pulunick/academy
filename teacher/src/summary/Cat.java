package summary;

public class Cat extends Animal implements Companion {
	
	Cat(String name) {
		super(name);
	}
	
	@Override
	public String getFeed() {
		return "츄르를";
	}
}
