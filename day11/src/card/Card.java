package card;

public class Card {
	
	static int width;
	static int height;
	String pic;
	String num;
	String shape;
	
	static void setSize(int width, int height) {
		// static method에서는 객체가 생성되지 않은 상태
		// this를 사용할 수 없다
		Card.width = width;
		Card.height = height;
	}
	
	Card(String pic, String num, String shape) {
		this.pic = pic;
		this.num = num;
		this.shape = shape;
	}
	
	void show() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 1 && j == width - 2)
					System.out.printf("%2s", num);
				else if (i == height - 2 && j == 1)
					System.out.printf("%-2s", num);
				else if (i == 2 && j == width - 2)
					System.out.printf("%2s", pic);
				else if (i == height - 3 && j == 1)
					System.out.printf("%-2s", pic);
				else if (i == height / 2 && j == width / 2) {
					System.out.printf("%-2s", shape);
				} else if (i == 0 && j == 0)
					System.out.print("┌");
				else if (i == height - 1 && j == 0)
					System.out.print("└");
				else if (i == 0 && j == width - 1)
					System.out.print("┐");
				else if (i == height - 1 && j == width - 1)
					System.out.print("┘");
				else if (i == 0 || i == height - 1)
					System.out.print("──");
				else if (j == 0 || j == width - 1)
					System.out.print("│");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
