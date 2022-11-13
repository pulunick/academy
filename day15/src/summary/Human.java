package summary;

public class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}	
	
	public void give(Food ob) {
		String food = ob.bob();
		System.out.printf("%s이  %s에게 %s %s준다.\n", name, ob.name(), food, ob.method());
	}
	
}
