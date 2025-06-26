package review;

import java.util.Scanner;

public class ArrayTask03 
{

	public static void main(String[] args) 
	{
		// 3. 수학점수 3개 입력받고 평균 점수 출력
		// 1) 입력클래스 import
		// 2) 3칸짜리 배열선언, 총합 저장할 변수, 평균 저장할 변수(double)
		// 3) for(1 ~ 3 까지 반복)
		// 		4) 몇번째 학생의 점수인지 출력
		//		5) 배열명[i] = nextint();
		// 		6) 총합 저장할 변수 += 배열명[i];
		// 5) avg = 총합 / 3.0;
		// 5) 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[] scores = new double[3];
		double sum = 0.0;
		double avg = 0.0;
		
		// 값 저장
		for(int i = 0; i < scores.length; i++) 
		{
			System.out.println(i + 1 + "번째 점수를 입력해주세요 : ");
			scores[i] = sc.nextDouble();
			sum += scores[i];
			sc.nextLine();
		}
		
		avg = sum / scores.length;
		
		System.out.printf("최종평균 : %.2f", avg);
		
		sc.close();
	}

}
