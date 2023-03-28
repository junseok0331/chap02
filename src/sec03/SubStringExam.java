package sec03;

public class SubStringExam {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);   //substring 0~6까지 가지고와라.5까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);     //substring 7번째까지 포함해서 가지고와라 1부터 뒤에 까지
		System.out.println(secondNum);
	}

}
