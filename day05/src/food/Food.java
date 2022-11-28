package food;

public class Food {
	private int idx;
	private String stroeName;
	private String menuName;
	private String category;
	private int price;
	
	public Food() {
	}
	public Food(int idx, String stroeName, String menuName, String category, int price) {
		super();
		this.idx = idx;
		this.stroeName = stroeName;
		this.menuName = menuName;
		this.category = category;
		this.price = price;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getStroeName() {
		return stroeName;
	}

	public void setStroeName(String stroeName) {
		this.stroeName = stroeName;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	

}
