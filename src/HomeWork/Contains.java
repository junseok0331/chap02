package HomeWork;

public class Contains {
	public static void main(String[] args) {
		
		String str = "my java test";
		
		System.out.println(str.contains("java"));      // true
		System.out.println(str.contains(" my " ));     // false
		System.out.println(str.contains("JAVA"));      // false
		System.out.println(str.contains("java test")); // true
	}
	

}
