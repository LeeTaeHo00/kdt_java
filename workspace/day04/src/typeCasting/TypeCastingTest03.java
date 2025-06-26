package typeCasting;
// 13번 : 모든 데이터 타입 조합
public class TypeCastingTest03 { // 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		// 변수
		byte b = 10; // b 라는 byte 변수를 선언과 동시에 초기화
		short s = 100; // s 라는 short 변수를 선언과 동시에 초기화
		char c = 'a'; // 97, c 라는 char 변수를 선언과 동시에 초기화
		int i = 1000; // i 라는 int 변수를 선언과 동시에 초기화
		long l = 10000L; // l 라는 long 변수를 선언과 동시에 초기화
		float f = 3.14f; // f 라는 float 변수를 선언과 동시에 초기화
		double d = 3.141592; // d 라는 double 변수를 선언과 동시에 초기화
		boolean bool = true; // bool 라는 boolean 변수를 선언과 동시에 초기화
		
		//byte
		short bs = b; // bs라는 short 변수에 byte 변수 형변환
//		char bc = b; // bc라는 char 변수에 byte 변수 형변환 실패
		int bi = b; // bi라는 int 변수에 byte 변수 형변환
		long bl = b; // bl라는 long 변수에 byte 변수 형볂로나
		double bd = b; // bd라는 double 변수에 byte 변수 형변환
		float bf = b; // bf라는 float 변수에 byte 변수 형변환
//		boolean bb = b; //bb라는 boolean 변수에 byte 변수 형변환 실패
		
		// short
		System.out.println("\n==========================="); // 소괄호 내에 내용 출력
//		byte sb = (byte)s; // sb라는 변수에 s라는 short 변수 형변환
		short ss = s; // ss 라는 short 변수에 s라는 short 변수 형변환
//		char sc = s; // sc라는 char 변수에 s라는 short 변수 형변환
		int si = s; // si 라는 int 변수에 s라는 short 변수 형변환
		long sl = s; // sl 라는 long 변수에 s라는 short 변수 형변환
		double sd = s; // sd라는 double 변수에 s라는 short 변수 형변환
		float sf = s; // sf 라는 float 변수에 s라는 short 변수 형변환
//		boolean sb = s; // 강제 형변환도 안됨
		
		// char
		System.out.println("\n==========================="); // 소괄호 내에 내용 출력
		int ci = c; // ci 라는 int 변수에 c라는 char 변수 형변환
		long cl = c; // cl 라는 long 변수에 c라는 char 변수 형변환
		float cf = c; // cf 라는 float 변수에 c라는 char 변수 형변환
		double cd = c; // cd 라는 double 변수에 c라는 char 변수 형변환
		short cs = (short)c;	// 강제형변환 가능, cs라는 short 변수에 c라는 char 변수 강제형변환
		byte cb = (byte)c;		// 강제형변환 가능, cb 라는 byte 변수에 c라는 char 변수 강제형변환
		
		
		// int\
		System.out.println("\n==========================="); // 소괄호 내에 내용 출력
		i = 112321; // i 값 변경
		long il = i; // il 이라는 long 변수에 i라는 int형 변수 형변환
		float i_f = i; // i_f라는 float 변수에 i라는 int형 변수 형변환
		double id = i; // id라는 double 변수에 i라는 int형 변수 형변환
		byte ib = (byte)i; // ib라는 byte 변수에 i라는 int형 변수 강제형변환
		char ic = (char)i; // ic라는 char 변수에 i라는 int형 변수 강제형변환
		System.out.println(i); // i라는 int형 변수 출력
		System.out.println(ic); // ic라는 int형 변수가 char 형으로 형변환된 데이터 출력
		
		// long
		System.out.println("\n==========================="); // 소괄호 내에 내용 출력
		float lf = l; // lf라는 float 형 변수에 l이라는 long 변수 형변환
		double ld = l; // ld라는 double 형 변수에 l이라는 long형 변수 형변환
		int li = (int)l; // 강제형변환 가능 // li 라는 int형 변수에 l이라는 long형 변수 강제 형변환
		
		// float
		System.out.println("\n==========================="); // 소괄호 내에 내용 출력
		double fd = f; // fd 라는 double 형 변수에 f라는 float 형 변수 형변환
		int fi = (int)f; // 강제형변환 가능 // int 형 변수 fi라는 변수에 f라는 float 형 변수 형변환
		
		// double
		System.out.println("\n==========================="); // 소괄호 내에 내용 출력
		float df = (float)d; // 강제는 가능 // df라는 float 형 변수에 d라는 double 형 변수 형변환 
		int di = (int)d; // 강제만 가능 // di라는 int형 변수에 d라는 double 형 변수 형변호나
		
		// bollean
//		int bi = (int)bool; 강제도 안됨
	} //  main메소드 끝
} // class 끝
