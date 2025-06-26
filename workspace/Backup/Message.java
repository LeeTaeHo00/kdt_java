package smartPhone;

import java.util.Scanner;

public class Message {
	// 필드
	String[] receive = new String[5];
	boolean newMsg = false;

	// 메소드

	// 메뉴 사용 메소드
	void useMenu(Scanner sc, SmartPhone curPhone) {
		curPhone.battery.useBattery(10);
		boolean checker = true;
		while (true) {
			printMenu(curPhone);
			int selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				sendMessage(sc);
				break;
			case 2:
				printReceiveMsg();
				break;
			case 3:
				checker = false;
				break;

			default:
				System.out.println("올바른 값을 입력해 주세요");
				break;
			}

			if (checker == false)
				break;
		}

	}

	// 메시지 보내기 메소드
	void sendMessage(Scanner sc) {
		System.out.println("연락을 줄 폰을 선택해 주십시오");
		int selectPhone = sc.nextInt();
		sc.nextLine();

		if (PhoneMain.phones[selectPhone] == null)
			System.out.println("아직 없는 폰입니다.");
		else {
			System.out.println("보낼 메시지를 입력해주세요");
			String msg = sc.next(); // 공백 메시지는 보내면 안됨
			sc.nextLine();

			PhoneMain.phones[selectPhone].msg.receiveMessage(msg);
		}
	}

	// 메시지 받기 메소드
	void receiveMessage(String message) {
		int len = receive.length;
		
		String temp = "";
		for (int i = 0; i < len - 1; i++) {
			temp = receive[i + 1];
			receive[i + 1] = receive[i];
		}
		receive[0] = message;
	}

	// 출력용 메소드들
	// 전달받은 메시지들 출력
	void printReceiveMsg() {
		System.out.println("=================================");
		for (int i = 0; i < receive.length; i++) {
			if (receive[i] == null)
				break;
			else {
				System.out.println("=\t\t\t\t=");
				System.out.println("=\t\t\t\t=");
				System.out.printf("=\t   %s\t\t=\n", receive[i]);
			}
		}
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=================================");
	}

	// 메뉴 출력
	void printMenu(SmartPhone phone) {
		System.out.println("=================================");
		phone.battery.printCurrentBattery();
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t   1. 보내기\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.printf("=\t   2. %s\t\t=\n", newMsg ? "확인하기(1)" : "확인하기");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t   3. 뒤   로\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=================================");
	}
}
