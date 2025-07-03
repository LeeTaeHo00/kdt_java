package interfaceTest06;

// 23 : 어댑터 클래스 (메인클래스)
public class CeilingFanMain {
	public static void main(String[] args) {
		Fan ceiling = new CeilingFan();
		Fan table = new TableFan();
		Fan tower = new TowerFan();
		
		useFan(ceiling);
		useFan(table);
		useFan(tower);
	}
	
	static void useFan(Fan fan) 
	{
		fan.on();
		fan.off();
		fan.turbo();
	}
}
