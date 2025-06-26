package towArray;

import java.util.Arrays;

// 8번 : Arrays.sort()
public class ArraySortTest01 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[]number = {5,2,6,3,1,8};
		int[][] number2 = {{5,2,6},{3,1,8}};
		
		System.out.println(number);
		System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number));
		System.out.println(number2);
		System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number2));
		System.out.println("2차원 배열 값 출력 : " + Arrays.deepToString(number2));
		
		System.out.println("정렬 전 number1 : " + Arrays.toString(number));
		System.out.println("정렬 전 number2 : " + Arrays.deepToString(number2));
		
		System.out.println();
		
		Arrays.sort(number); // 오름차순 정렬
//		Arrays.sort(number2); // 불가능 각행을 해줘야함
		// 2차원 배열의 내부 요소 정렬은 for문이나 수동정렬이 필요하다!!!!!
//		for(int i = 0; i < number2.length; i++) 
//		{
//			Arrays.sort(number2[i]);
//		}
		
		for(int[] nums : number2) 
		{
			Arrays.sort(nums);
		}
		
		System.out.println("정렬 후 number1 : " + Arrays.toString(number));
		System.out.println("정렬 후 number2 : " + Arrays.deepToString(number2));
		
	}

}
