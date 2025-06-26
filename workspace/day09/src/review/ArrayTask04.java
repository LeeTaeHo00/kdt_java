package review;

public class ArrayTask04 
{

	public static void main(String[] args) 
	{
		// 3. 0 1 2 3 0 1 2 3 배열에 담고 출력
		// 1) 정수형 8칸 배열 선언
		// 2) for(초기식 int i = 0; i < 배열명.length; i++)
		// 		3) 배열명[i] = i % 4;
		// 4) 출력
		
		int[] nums = new int[8];
		
		// 값 저장
		for(int i = 0; i < nums.length; i++) 
		{
			nums[i] = i % 4;
		}
		
		for(int i = 0; i < nums.length; i++) 
		{
			System.out.print(nums[i] + " ");
		}
		
	}

}
