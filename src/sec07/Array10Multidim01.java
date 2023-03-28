package sec07;

public class Array10Multidim01 {
	public static void main(String[] args) {
		// 각 반의 학생수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		int count = 0;
		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;

		for (int i = 0; i < mathScores.length; i++) { //반의 수만큼 반복
			totalStudent += mathScores[i].length; // 반 학생수 합
			for (int j = 0; j < mathScores[i].length; j++) { // 해당 반의 학생수 만큼 반복
				totalMathSum += mathScores[i][j]; // 학생 점수 합산
				if (mathScores[i][j] >= 90) {   // 90이상인 사람 찾기
					count = count + 1;    // count 인원수 
				}

			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();

		for (int i = 0; i < mathScores.length; i++) { // i반에 있는 학생 점수
			for (int j = 0; j < mathScores[i].length; j++) { // j반에 있는 학생점수
				System.out.print(mathScores[i][j] + " "); // 두반에 있는 학생 점수를 "" 문자로표시
			}
			System.out.println();
		}

		System.out.println("90점 이상인 학생의 수 : " + count + "명");
	}

}


