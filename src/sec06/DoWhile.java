package sec06;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));   //String 일때는 .equals사용한다.

		System.out.println();
		System.out.println("프로그램 종료");
	}

}
