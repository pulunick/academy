package summary;

public class Friend extends Human implements Food  {
	
	Friend(String name) {
		super(name);
	}

	@Override
	public String bob() {
		return "주먹밥을";
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String method() {
		return "건네";
	}

}
