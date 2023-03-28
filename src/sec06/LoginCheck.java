package sec06;

import java.util.Scanner;

public class LoginCheck {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("아이디를 입력하세요.");
		String id = scanner.nextLine();

		// System.out.println("패스워드를 입력하세요.");
		// String pw = scanner.nextLine(); //비밀번호 맞을때만 하려면 밑에처럼

		if (id.equals("java")) {
			System.out.println("패스워드를 입력하세요.");
			String pw = scanner.nextLine();

			if (pw.equals("1234")) {
				System.out.printf("%s님 환영합니다.\n", id);

			} else {
				System.out.println("비밀번호가 올바르지 않습니다.");
			}

		} else {
			System.out.println("계정이 올바르지 않습니다.");
		}

	}
}