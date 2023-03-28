package sec07;

/**
 * 세 과목의 평균 구하기
 */
public class Array01Old {

	public static void main(String[] args) {

		int a = 80;
		int b = 75;
		int c = 90;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int sum = 0;

		sum = (a + b + c);
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		// double avg = (double) sum / 3;
		System.out.println("1. 평균 : " + avg);
		System.out.printf("2. 평균 : %.2f \n", avg); // 소숫점2자리 3자리하고싶으면 숫자변경
		System.out.print("3. 평균 : " + Math.round(avg * 100) / 100.0);
		System.out.println();
		System.out.println(String.format("4. 평균 : %.2f" , avg));
	}

}
