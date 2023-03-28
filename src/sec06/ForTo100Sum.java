package sec06;

// 1~100 까지 의 합 구하기
public class ForTo100Sum {
	public static void main(String[] args) {

		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			// sum += i; 코드쭐이기
			sum = sum + i;

		}
		System.out.println("1~" + (i - 1) + " 합 : " + sum);

	}
}
