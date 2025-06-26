package review;

public class ArrayTask06 
{

	public static void main(String[] args) 
	{
		// 3. A ~ F 배열에 넣고 출력 C는 빼기
		// 1) 문자형 5칸짜리 배열선언
		// 2) 정수형 임시변수 = 0;
		// 2) 반복문
		//		3) 임시변수 = i;
		// 		4) 조건문 임시변수 < 2
		// 			배열명[i] = (char)('A' + i)
		//		5) else
		//			배열명[i] = (char)('A' + i + 1)
		// 6) 출력
		
		char[] arr = new char[5];
		int temp = 0;
		
		// 값 저장
		for(int i = 0; i < arr.length; i++) 
		{
			if(i == 2)
			{
				temp = 1;
			}
			
			//arr[i] = (char)(i + 65 + temp);
			//System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) 
		{
			temp = i;
			if(temp > 1)
			{
				temp++;
			}
			
			//arr[i] = (char)(65 + temp);
			//System.out.print(arr[i] + " ");
		}	
		
		temp = 0;
		char ch = 'A';
		
		while(temp < 5) 
		{
			if(ch != 'C') 
			{
				arr[temp++] = ch; 
			}
			
			ch++;
			System.out.println(arr);
		}
	}

}
