package objectTest02;

public class User {
	// 필드
	String name;
	int age;
	
	// 생성자
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 메소드
	// toString() : alt + shift + s + s
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// 자기자신과 같을 경우
		if(this == obj) return true;
		
		// 이름이 같은 경우 => 같은 객체로 판단
//		if(obj instanceof User) 
//		{
//			String other = ((User)obj).name;
//			if(this.name.length() == other.length()) 
//			{
//				for(int i = 0; i < other.length(); i++) 
//				{
//					if(this.name.charAt(i) != other.charAt(i)) 
//					{
//						System.out.println("문자가 달라유");
//						return false;
//					}
//				}
//			}
//		}
		
		// 짥ㅂ은 코드
		if(obj instanceof User) 
		{
			String other = ((User)obj).name;
			return this.name.equals(other);
		}
		System.out.println("User 클래스가 아니에유");
		return false;
	}

	// 이름을 해시코드 값으로 쓸 때는 name.hashCode()
	// 나이를 해시코드 값으로 쓸 때는 Interger.hashCode(age)
	@Override
	public int hashCode() {
//		return name.hashCode();
		return Integer.hashCode(age);
	}
}

// equals를 재정의하면 hashCode도 재정의해야한다.
// 동일 객체에 대해 같은 hashCOde값이 반환되도록 한다.
