package review;

public class ArrayTask05 
{

	public static void main(String[] args) 
	{
		// 3. A ~ F 배열에 넣고 출력
		// 1) 문자형 6칸짜리 배열선언
		// 2) 반복문
		// 		배열명[i] = (char)('A' + i)
		// 3) 출력
		
		char[] arr = new char[6];
		
		// 값 저장
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = (char)(i + 'A');
			System.out.print(arr[i] + " ");
		}		
	}

}
