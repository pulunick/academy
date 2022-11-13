package exception;

import java.util.Scanner;

class MyOperatorException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() { // override from Throwable
		return "연산자에는 +, -, *, / 만 입력할 수 있습니다";
	}

	@Override
	public String toString() { // override from Object
		return super.toString();
	}

}

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result;
		char oper;

		// 두 정수와 연산자를 입력받아서 결과를 화면에 출력하는 코드를 작성하세요
		// 해당 과정에서 발생할 수 있는 예외를 최대한 많이 확인하여 try ~ catch 구문으로 작성하세요
		// 하나의 try에는 여러 catch가 연결될 수 있으며, 다형성이 적용됩니다.
		// 상세한 예외부터 위에 작성하고, 포괄적인 예외는 아래쪽에 작성합니다
		
//		System.out.print("정수를 입력하세요 : ");
//		n1 = sc.nextInt();
//		System.out.print("정수를 입력하세요 : ");
//		n2 = sc.nextInt();
		
		try {
			System.out.println("연산자를 입력하세요 : ");
			oper = sc.nextLine().charAt(0);

			switch (oper) {
			case '+':
				System.out.println("숫자 두개 입력");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 + n2;
				System.out.println("선택한 연산자는 " + oper + " 이고 값은 " + result + " 에요.");
				break;
			case '-':
				System.out.println("숫자 두개 입력");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 - n2;
				System.out.println("선택한 연산자는 " + oper + " 이고 값은 " + result + " 에요.");
				break;
			case '*':
				System.out.println("숫자 두개 입력");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 * n2;
				System.out.println("선택한 연산자는 " + oper + " 이고 값은 " + result + " 에요.");
				break;
			case '/':
				System.out.println("숫자 두개 입력");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 / n2;
				System.out.println("선택한 연산자는 " + oper + " 이고 값은 " + result + " 에요.");
				break;
			case '%':
				System.out.println("숫자 두개 입력");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 % n2;
				System.out.println("선택한 연산자는 " + oper + " 이고 값은 " + result + " 에요.");
				break;
			}
			{
				MyOperatorException ex = new MyOperatorException();
				throw ex;
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("정수를 입력하세요");

		} catch (java.lang.ArithmeticException e) {
			System.out.println("분모는 0이 될 수 없습니다");
		} catch (MyOperatorException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("프로그램 종료");
		}
	}
}
