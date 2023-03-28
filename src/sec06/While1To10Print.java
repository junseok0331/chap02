package sec06;

public class While1To10Print {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}                // 위 아래  while() 안에 둘이 같다.
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i > 10) {
				break;
			}
		}
	}

}
