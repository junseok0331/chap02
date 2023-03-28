package HomeWork;

import java.util.Scanner;

public class EqualsWork {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1 = "안녕 하세요.";
		System.out.println("문자열 str2를 입력해 주세요.");
		String str2 = scan.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println(str1);
			System.out.println("두 문자열이 같습니다.");
		}
		else {
			System.out.println("두 문자열이 다릅니다.");  
		}
		
	}

}
