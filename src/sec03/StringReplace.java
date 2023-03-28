package sec03;

/**
 *  replace 메소드 예제
 */

public class StringReplace {
	
	public static void main(String[] args) {
		String oldstr = "자바 문자열은 불변입니다. 자바문자열은 String입니다.";
		String newstr = oldstr.replace("자바", "JAVA");  // 첫번째는 바뀔문자 두번째는 바꿔질 문자 replace를  통해
		
		System.out.println(oldstr);
		System.out.println(newstr);
	}

}
