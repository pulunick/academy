package programmers;

public class Quiz120830 {
	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int yang = 12000;
		int drink = 2000;
		
		int pay = yang*n + drink*k - drink*(n/10);
		
		System.out.println(pay);
	}

}
