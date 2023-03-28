package HomeWork;

public class IndexOf {
	public static void main(String[] args) {
		String str = "Hello World";
		
		System.out.println("IndexOf('Int형') : " + str.indexOf(111));
		System.out.println("IndexOf('Int형', 시작int) : " +str.indexOf(111, 5));
		System.out.println("IndexOf('문자형') : " + str.indexOf("o"));
		System.out.println("IndexOf('Int형', 시작int) : " + str.indexOf("o", 5));
				
	}

}

