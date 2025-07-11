package day20_이태호;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Random r = new Random();
		r.nextDouble(10);
		Map<String, Integer> test = new HashMap<>();
		
		
		//(int)((Math.random() * 10) + 1);
		Scanner sc = new Scanner(System.in);
		while(studentList.size() < 7) 
		{
			System.out.print("이름 입력 : ");
			String name = sc.next();
			sc.nextLine();
			
			System.out.print("나이 입력");
			int age = getOnlyInt(sc);
			
			Student newStudent = new Student(name, age);	
			
			if(checkStudenList(studentList, newStudent)) 
			{
				System.out.println("같은 이름의 학생이 있습니다.");
				continue;
			}
			
			try 
			{
				System.out.print("영어 점수 입력");
				newStudent.setEngScore(newStudent.addScore(getOnlyInt(sc))); 
				
				System.out.print("국어 점수 입력");
				newStudent.setKorScore(newStudent.addScore(getOnlyInt(sc))); 
				
				System.out.print("수학 점수 입력");
				newStudent.setMathScore(newStudent.addScore(getOnlyInt(sc))); 
			}
			
			catch(InputMismatchException e) 
			{
				System.out.println("숫자를 입력해주세요 이름부터 다시 입력받습니다.");
				sc.nextLine();
				continue;
			}
			
			catch(ScoreOutOfRangeException e) 
			{
				System.out.println("범위 내로 입력해 주세요 이름부터 다시 입력받습니다.");
				sc.nextLine();
				continue;
			}
			
			
			studentList.add(newStudent);
		}
		
		Iterator<Student> iter = studentList.iterator();
		while(iter.hasNext())
		{
			Student curStudent = iter.next();
			System.out.println("이름 : " + curStudent.getName());
			System.out.println("총점 : " + curStudent.total());
			curStudent.printAvg();
			System.out.println("\n");
			
		}
		
		sc.close();
	}
	
	static int getOnlyInt(Scanner sc) 
	{
		try 
		{
			int num = sc.nextInt();
			sc.nextLine();
			return num;
		} 
		
		catch (NumberFormatException e) 
		{
			sc.nextLine();
			return 0;
		} 
		
		catch(InputMismatchException e) 
		{
			sc.nextLine();
			return 0;
		}
	}
	
	static boolean checkStudenList(ArrayList<Student> list, Student target) 
	{
		Iterator<Student> iter = list.iterator();
		while(iter.hasNext())
		{
			Student curStudent = iter.next();
			if(curStudent.equals(target)) 
			{
				return true;
			}
			
		}
		return false;
	}

}
