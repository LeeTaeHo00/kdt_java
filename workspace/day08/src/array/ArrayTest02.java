package array;
// 4번 : 배열 index
public class ArrayTest02 {

	public static void main(String[] args) {
		// 어떤 값을 넣을지 알때
		int[] ar1 = {1,2,3,4,5};
		System.out.println(ar1);
		// ar1 => 스택 메모리에 있는 참조변수 (heap 메모리에 저장된 배열의 시작주소 => 참조값)
		// 참조변수
		// 참조값 : 참조변수
		
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		
		
		// 인덱스의 크기를 알때
		int[] ar2 = new int[3];
		System.out.println(ar2); // heap 메모리에 저장된 시작주소값인 참조값을 담는다.
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]); // 
		
		// 인덱스의 크기도 모를떄
		int[] ar3 = null; // 주소값이 아직 없음, null도 입력하지 않았을 경우 출력할 수 없다.
		System.out.println(ar3); // null
		
		ar3 = new int[] {1,2,3};
		
		
		
		//System.out.println(ar3[0]);
		
	}

}
