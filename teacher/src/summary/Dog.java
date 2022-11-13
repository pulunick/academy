package summary;

public class Dog extends Animal implements Companion {

	Dog(String name) {
		super(name);
	}

	@Override
	public String getFeed() {
		return "개껌을";
	}
}
