package book;

public class Book {
	
	String name;
	String author;
	int price;
	double starPoint;
	int year;
	
	Book(String name, String author, int price, double starPoint, int year) {
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.starPoint = starPoint;
		this.year = year;	
		
	}

	void show() {
		String form = "%s %s\t %d원 (★%.1f) %d년"; 	
		form = String.format(form, name, author, price, starPoint, year); 
		System.out.println(form); 	
	}

}
