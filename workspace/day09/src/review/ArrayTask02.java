package review;

public class ArrayTask02 
{

	public static void main(String[] args) 
	{
		// 1. 1 ~ 10 까지의 값 을 더한값을 배열에 넣고 출력
		// 1) 크기가 10인 정수형 배열 선언, 총합구할 변수 선언
		// 2) for문으로 1 ~ 10까지 저장
		// 		3) int i = 0; 배열명[i] = i + 1;
		// 		4) 총합구할 변수 += 배열명[i];
		// 5) 결과 출력
		
		int[] arr = new int[10];
		int sum = 0;
		System.out.println(arr);
		
		// 값 저장
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = i + 1; // arr[0] = 0 + 1
							// arr[9] = 9 + 1
			sum += arr[i];
			System.out.println("1부터 " + (i + 1) + "까지의 총합 : " + sum);
		}
		
		System.out.println(sum);
	}

}
