package programmers;

public class Quiz120585 {
	public static void main(String[] args) {
		
		int[] arr = {149,180,192,170};
		int height = 167;
		int answer = 0;

		for (int i : arr) {
			if (height < i) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
