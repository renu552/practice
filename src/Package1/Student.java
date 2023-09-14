package Package1;
import java.util.Scanner;
class Studentdemo {

	void printInfo(int id,String name,String dept)
	{
		System.out.println("Student Id is"+id);
		System.out.println("Student name is"+name);
		System.out.println("Student dept is"+dept);
		
	}
	void calculatAverage(int m1,int m2,int m3)
	{
	  int total=m1+m2+m3;
	  System.out.println("Total="+total);
	  int Average=total/3;
      System.out.println("Average="+Average);
	  
		
	}
	}

public class Student{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Studentdemo s=new Studentdemo();
		System.out.println("Enter student id\n");
		int sid=sc.nextInt();
		System.out.println("Enter student name\n");
		String sname=sc.next();
		System.out.println("Enter dept dept\n");
		String sdept=sc.next();
		s.printInfo(sid,sname,sdept);
		System.out.println("-------------------------------------");
		System.out.println("Enter student m1 :\n");
		int num1=sc.nextInt();
		System.out.println("Enter student m2 :\n");
		int num2=sc.nextInt();
		System.out.println("Enter student m3 :\n");
		int num3=sc.nextInt();
		s.calculatAverage(num1,num2,num3);
		sc.close();
	}
}


