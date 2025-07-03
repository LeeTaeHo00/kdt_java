package casting04;

public class Main {
	public static void main(String[] args) {
		// 업캐스팅
		Hero ironMan = new IronMan("토니");
		ironMan.superPower(); // 오버라이딩된 메소드 호출
		
		Hero hulk  = new Hulk("짐레이너");
		hulk.superPower();
		
		IronMan ironMan2 = (IronMan)ironMan;
		((Hulk)hulk).say();
		ironMan2.say();
	}
}
