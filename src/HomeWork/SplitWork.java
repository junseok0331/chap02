package HomeWork;

public class SplitWork {
	public static void main(String[] args) {
	// 공백있는 문자열
	String st1 = "사과 레몬 오렌지";
		
	// 공백을 잡을때
	String[] stChange1 = st1.split("\\s");
		
	// 사과
	System.out.println(stChange1[0]);
	
	// 레몬
	System.out.println(stChange1[1]);
	
	// 오렌지
	System.out.println(stChange1[2]);
 }

}
