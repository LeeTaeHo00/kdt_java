package oper;
// 8번 : 비트 연산자를 이용한 암호화와 복호화
public class BitEncryption { // 클래스 시작

	public static void main(String[] args) {  // main 메소드 시작
		// TODO Auto-generated method stub
		// 전달할 데이터(원본 데이터)
		int originalMsg = 42; // 임의의 정수형 변수 선언 및 초기화
		int key = 99; // 비트 마스크(암호화, 복호화에 사용)
		
		System.out.println("원본 메시지 : " + originalMsg); // 출력
		
		int encryptMsg = originalMsg ^ key; // 데이터 암호화 xor 연산을 통한 암호화
		System.out.println("암호화된 메시지 : " + encryptMsg); // 암호화된 데이터 출력
		
		int decryptMsg = encryptMsg ^ key; // 데이터 복호화 암호화된 메시지를 동일한 키로 xor 연산을 통한 복호화
		System.out.println("복호화된 메시지 : " + decryptMsg); // 복호화된 데이터 출력
		
		// xor => 두 비트 의 값이 서로 다르면 1 그 외에는 0을 반환
		// 0 xor 0 => 0, 0 xor 1 => 1; 55번
		
	}

}
