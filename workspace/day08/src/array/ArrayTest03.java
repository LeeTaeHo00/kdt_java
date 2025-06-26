package array;
//5번 : 배열사용(저장공간과 값)
public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arData = {5,2,6,4}; // 정수형 배열(참조변수) 선언
		System.out.println(arData); // 배열의 시작주소값 출력
		System.out.println(arData.length); // 배열의 길이 출력
		
		for(int i = 0; i < arData.length; i++) 
		{
			System.out.print(arData[i]);
		}
		
		arData[0] = arData[1] + arData[3]; // 저장공간에 값들을 더해서 대입해준다.
		System.out.println(arData[0]);
		
		int[] arData2 = new int[10];
		for(int i = 0; i < arData2.length; i++)  // 값 대입 반복문
		{
			arData2[i] = i + 1;
		}
		
		
		for(int i = 0; i < arData2.length; i++) 
		{
			System.out.print(arData2[i] + " ");
		} // 대입 반복문
			
	}

}
