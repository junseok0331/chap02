package sec07;

/**
 * [모듈화] -평균 구하는 로직을 메소드로 분리함
 */

public class Array03Param {

	public static void main(String[] args) {

		int[] intArr = { 80, 75, 90 };

		// 평균을 구해주는 메소드 호출
		double avg = getSum(intArr); // 인자(argument)로 배열을 전달

		System.out.printf("avg : %2f", avg);
	}

	// 평균을 구해주는 메소드
	public static double getSum(int[] arr) { // 매개변수가 배열 타입
		int sum = 0;

		// 반복문을 통해서 평균을 구하세요. ////
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println(arr[i]);

		}
		double avg = (double) sum / arr.length;
		return avg; // 값을 반환
	}

}
