package programmers;



public class Quiz120831 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double answer = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		answer = sum / (double)numbers.length;
		
		System.out.println(answer);
		

}
}