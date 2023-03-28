package sec07;

/**
 * NullPointerException - 메모리에 공간이 안만들어진 상태에서 특정 요소의 값에 접근할 경우 발생 - 참조하는 메모리 공간이
 * 없는 상태
 */

public class NullPointerException {
	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[3];
		intArray[0] = 10;   // NullPointerException
		intArray[1] = 5;
		intArray[2] = 7;
		System.out.println(intArray[0]);////////////
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);

		String str = null;
		str = "안녕하세요.";
		// NullPointerException
		System.out.println("총 문자수: " + str.length()); // NullPointerException
	}

}
