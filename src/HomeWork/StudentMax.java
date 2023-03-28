package HomeWork;

public class StudentMax {
	public static void main(String[] args) {
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 69 };
		String[] name = { "최대원", "이경선", "배준섭", "홍원표", "김성현", "우상현", "심미안" };

		int sum = 0; // 총점
		double avg = 0; // 평균
		int max = 0; // 큰수 임시 저장 변수
		String string = ""; // 최고 점수의 학생 저장 변수

		for (int score : scores) {
			sum = sum + score;
		}
		avg = (double) sum / scores.length;  //평균구함
		System.out.printf("평균점수는\" %.1f점 \"", avg);
		System.out.println();

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				string = name[i];

			}
		}
		System.out.printf("최고점은\"%d점\"" + "입니다.", max);
		System.out.println();
		System.out.printf("최고 성적은 %s입니다.", string);

	}

}
