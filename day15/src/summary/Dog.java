package summary;

public class Dog extends Animal implements Food {
	
	Dog(String name) {
		super(name);
	}

	@Override
	public String getFeed() {
		return "개껌을";
	}

	@Override
	public String bob() {
		return "개껌을";
		
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
