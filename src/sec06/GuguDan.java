package sec06;

public class GuguDan {

	public static void main(String[] args) {

		// 구구단 세로 모르면 통암기
		for (int i = 2; i <= 9; i++) { // 2단에서 ~9단
			System.out.println("[" + i + "]단");
			for (int j = 1; j <= 9; j++) { // 1~9 매단 마다
				System.out.println(i + "*" + j + "=" + (i * j)); // "" 안에있는건 문자열
			}

		}
	}

}
