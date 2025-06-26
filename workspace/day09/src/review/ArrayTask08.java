package review;

import java.util.Scanner;

public class ArrayTask08 
{

	public static void main(String[] args) 
	{
		// 3. 5개의 정수 입력받고 그 값을 배열에 담고 최대값과 최소값 출력
		// 0) 입력클래스 선언 및 임포트
		// 1) 정수형 5칸 짜리 배열 선언
		// 2) 출력 메시지
		// 3) 최대값, 최소값 변수 선언
		// 4) for(int i = 0; i < 정수형배열.length; i++)
		// 5) 		msg 출력
		// 			배열명[i] = sc.nextInt();
		// 최대값, 최소값 변수 = 0번쨰 인덱스 값을 대입
		// 6) for(int i = 0; i < 정수형배열.length; i++)
		// 7) 크기 비교할 for문
		// 			if(최대값 < 배열명[i]){최대값 = 배열명[i]}
		//			if(최고값 > 배열명[i]){최소값 = 배열명[i]}
		
		// 8) 결과 출력
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		
		String msg = " 번째 정수 입력 : ";
		int max = 0, min = 0;
		
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.println((i + 1) + msg);
			arr[i] = sc.nextInt();
		}
		
		max = arr[0];
		min = arr[0];
		
		for(int i = 1; i < arr.length; i++) 
		{			
			if(arr[i] > max) 
			{
				max = arr[i];
			}
			
			if(arr[i] < min) 
			{
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		
		sc.close();
	}

}
