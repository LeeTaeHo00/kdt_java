package review;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("냐옹");
		Student s = new Student("짱구", true);
		
		
		Main.printInfo(p);
		Main.printInfo(s);
	}
	
	// 스태틱 메소드 정의
	static void printInfo(Person person) 
	{
		person.introduce();
		if(person instanceof Student) 
		{
			((Student)person).study();
		}
		else if(person instanceof Teacher) 
		{
			((Teacher)person).teach();
		}
		else if(person instanceof Employee) 
		{
			((Employee)person).work();
		}
	}
	
}

