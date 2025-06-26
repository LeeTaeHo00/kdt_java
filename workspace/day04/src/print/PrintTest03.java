package print;

// 10 : 서식문자의 옵션 printf()
public class PrintTest03 { //클래스 시작
	public static void main(String[] args) { // 메인 메소드 시작
		System.out.println("-=============================-"); // 소괄호 안에 있는 내용 출력
//		// 기본 형식 지정자
//		System.out.printf("이름 : %s 나이 : %d\n", "이태호", 909090);
//		System.out.printf("%d.%.2f : %s", 2025, 6.16, "흐림");
//		System.out.printf("%s %c", "true", 'a');
		
		System.out.println("-=============================-"); // 소괄호 안에 있는 내용 출력
		
		// 자리수를 지정한 출력
		// %[왼쪽- or 0][n자리수][.m] 서식문자
		String subject = "java";
		System.out.printf("\n%10s", subject);	//10자리 기준 오른쪽 정렬
		System.out.printf("\n%-10s\n", subject);	// 10자리 기준 왼쪽 정렬
		System.out.printf("%-10s %05d", subject, 500);	// 자리수가 정해지면 디폴트는 오른쪽 정렬이다
		System.out.printf("\n%-5s", "김영선\n");
		
		System.out.println("==============메뉴==============="); // 소괄호 안에 있는 내용 출력
		
		// 상품명과 가격 정렬해서 출력
		System.out.printf("\n%-5s\t\t%05d원", "꼬북칩", 2500); // 소괄호 안에 있는 내용 출력
		System.out.printf("\n%-5s\t\t%05d원", "누네띠네", 25000); // 소괄호 안에 있는 내용 출력
		System.out.printf("\n%-5s\t\t%05d원", "껌", 55000); // 소괄호 안에 있는 내용 출력
	}	// 메인 메소드 끝
}// 클래스 끝
