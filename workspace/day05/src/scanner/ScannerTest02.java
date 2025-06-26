package scanner;

import java.util.Scanner;

// 6번 : 입력메소드(next(), nextLine())
public class ScannerTest02 { //클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		Scanner sc = new Scanner(System.in); // Scanner라는 레퍼런스 타입 변수를 가지는 sc 변수명을 선언한 후 초기화
		
		// next()는 임시 저장공간에서 엔터를 소모하지 않느다.
		// 값을 입력하지 않고 엔터만 누르면 next() 입장에서는 할일이 없기 때문에
		// 아무것도 하지 않고 계속 대기한다.
		
//		sc.next(); // 사용자 입력받기
//		sc.next(); // 사용자 입력받기
//		sc.next(); // 사용자 입력받기
		
		// nextLine() 은 하는일이 두가지 이다.
		// 1) 엔터 이전까지의 값을 가져온다.
		// 2) 엔터를 임시저장공간에서 지워준다.(소모한다)
		// 값을 입력하지 않고 엔터만 눌러도 nextLine()은 엔터를 소모해야 하는 일을 해야하므로
		// 엔터를 없애고 할 일을 마친다.
		
		sc.nextLine(); // 사용자 입력받기 Line, 만약 위에서 소모해야할 엔터가 남아있다면 여기서 소모된다.
		sc.nextLine(); // 사용자 입력받기 Line
		sc.nextLine(); // 사용자 입력받기 Line
		
		sc.close();		// Scanner 객체를 종료하고 내부에서 사용한 자원 (메모리, 스트림 등)을 해제함
		// close이후에는 Scanner를 다시는 사용할 수 없다.
		
//		Scanner sc1 = new Scanner(System.in);	// System.ini 하나의 InputStream인데 sc.close()라는 메소드를 사용했기 때문에 system.in을 닫게 된다.
//		// new Scanner(System.in)을 사용하더라도 이미 닫힌 스트림의 재사용이기 때문에 에러가 발생한다.
//		sc1.nextLine();
		
	} // main 메소드 끝
} // 클래스 끝
