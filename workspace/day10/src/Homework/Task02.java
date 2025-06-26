package Homework;

public class Task02 {
	public static void main(String[] args) {
		// Animal 클래스 -> 객체 3개
		// 필드 : 동물이름, 나이, 종
		
		// 메소드
		// 동물이 먹이를 먹는 메소드 매개변수 1개(먹이)
		// => "동물이름"이 "먹이"를 먹습니다.
		
		// 동물이 잠을 잡니다 출력하는 메소드
		// => "동물이름"이 잠을 잡니다
		
		// 동물의 생일 축하하느 메소드
		// => "동물이름"의 "나이" 생일을 축하합니다 출력
		
		Animal rabbit = new Animal();
		rabbit.name = "짱쎈 토끼";
		rabbit.age = 500;
		rabbit.species = "토끼";
		
		Animal dragon = new Animal();
		dragon.name = "투명드래곤";
		dragon.age = 5000;
		dragon.species = "용";
		
		Animal tiger = new Animal();
		tiger.name = "호랭총각";
		tiger.age = 33;
		tiger.species = "호랑이?";
		
		rabbit.eat("황금당근");
		rabbit.sleep("굴");
		rabbit.birthDay();
		System.out.println();
		
		dragon.eat("크루와상");
		dragon.sleep("한옥");
		dragon.birthDay();
		System.out.println();
		
		tiger.eat("콘푸라이트");
		tiger.sleep("꾸어꾸어");
		tiger.birthDay();
	}
}
