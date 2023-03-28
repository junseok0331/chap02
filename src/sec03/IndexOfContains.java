package sec03;

public class IndexOfContains {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";   // 3번쨰 자리가 프라서 숫자 3이 나옴
		
		int Iocation = subject.indexOf("프로그래밍");   //indexOf
		System.out.println(Iocation);
		String subString = subject.substring(Iocation);  //substring  앞에꺼는 포함 뒤에꺼는 미포함 해서 찾는다.
		System.out.println(subString);
		
		Iocation = subject.indexOf("자바");
		if (Iocation != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");         //contains
		if (result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
				
			}
			
		}
			
		}
	


