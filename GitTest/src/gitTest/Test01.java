package gitTest;

public class Test01 {
	public static void main(String[] args) {
		int[][] score = { { 97, 85 }, { 100, 86 }, { 87, 96 }, { 76, 90 } }; // 2차원 배열 값 저장 - [4][2]

		int sum = 0; // 합계 변수
		int count = 0;
		for (int i = 0; i < score.length; i++) { // score.length >> 배열의 행의 길이 : 4
			for (int j = 0; j < score[i].length; j++) { // score[i].length >> 배열의 행 별 열의 길이 : 2
				sum += score[i][j];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(sum / count);
	}
}
