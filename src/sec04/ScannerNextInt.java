package sec04;

import java.util.Scanner;

public class ScannerNextInt {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner 클래스 객체 생성
		System.out.println("첫 번째 숫자를 입력하시오");
		int a = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력하시오");
		int b = scanner.nextInt();
		
		if (a > b) {
			System.out.println("첫번째 숫자가 큽니다.");
		}else {
			System.out.println("두번째 숫자가 큽니다.");
	 }

		//자원 닫기
		scanner.close();
		compareTwoNumber(a, b);
	}
	/**
	 * 두 수를 비교해주는 함수
	 * @param a
	 * @param b
	 */
		private static void compareTwoNumber(int a, int b) {
			if (a > b) {
				System.out.println("첫 번째 숫자가 큽니다.");	
			}else if (a < b) {
				System.out.println("두 번째 숫자가 큽니다.");	
			}else {
				System.out.println("두 수가 같습니다.");
			}
			
	}
}


