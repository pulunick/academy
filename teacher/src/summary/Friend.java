package summary;

public class Friend extends Human implements Companion {

	Friend(String name) {
		super(name);
	}

	@Override
	public String getFeed() {
		return "주먹밥을";
	}
}
