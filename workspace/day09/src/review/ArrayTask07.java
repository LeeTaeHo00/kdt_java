package review;

public class ArrayTask07 
{

	public static void main(String[] args) 
	{
		// 3. aBcD...Z 출력
		// 1) 문자형 26칸짜리 배열선언
		// 2) 반복문
		// 		2-1) 삼항연산자 값 대입
		// 3) 출력
		
		char[] arr = new char[26];
		
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = (char)(i % 2 != 0 ? i + 65 : i + 97); 
		}
		
		for(int i = 0; i < arr.length; i++) 
		{			
			System.out.print(arr[i] + " ");
		}
	}

}
