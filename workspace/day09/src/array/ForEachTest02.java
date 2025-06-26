package array;
// 2) 3과목 점수의 총합과 평균점수 구하기(foreach)
public class ForEachTest02 {

	public static void main(String[] args) {
		
		// 1) 총합 구할 변수 선언, 평균 구할 변수 선언
		// 2) 총합 구하기
		// 3) 평균 구하기
		// 
		
		int[] scores = {100, 88, 99};
		
		int totalScore = 0;
		double averageScore = 0.0;
		
		for(int score : scores) 
		{
			totalScore += score;
		}
		
		averageScore = totalScore / (double)scores.length;
		
		System.out.println("총합 : " + totalScore);
		System.out.printf("평균 : %.2f", averageScore);
		

	}

}
