package sec03;

public class LengthExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		int length = ssn.length();         // length 문자열에 크기 확인  13 자릿수가 맞는지 확인
		if (length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
			
		}
			
		}
	}


