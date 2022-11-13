package summary;

public abstract class Animal {
	String name;
	
	
	Animal(String name) {
		this.name = name;		
	}
	
	
	public abstract String getFeed();
}
