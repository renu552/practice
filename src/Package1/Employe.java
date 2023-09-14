package Package1;
import java.util.*;
 class Employe_operation 
{
	void print_info(int id,String name,String dept)
	{
		System.out.println("Emp id is\n"+id);
		System.out.println("Emp name is\n"+name);
		System.out.println("Emp dept is\n"+dept);
	}
	void Calculate_Salary(int experiance)
	{
		if(experiance >10)
		{
			int salary=experiance*8000;
			System.out.println("Salary\n"+salary);
		}
		else if(experiance >5 &&experiance <=10)
		{
			int salary=experiance*6000;
			System.out.println("Salary\n"+salary);
		}
		else
		{
			int salary=experiance*5000;
			System.out.println("Salaryn"+salary);
		}
			
	}
	

	
}
public class Employe 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			Employe_operation E=new Employe_operation ();
			System.out.println("Enter emp id");
			int Eid=sc.nextInt();
			System.out.println("Enter emp naame");
			String Ename=sc.next();
			System.out.println("Enter emp dept");
			String Edept=sc.next();
			System.out.println("Enter emp Experiance");
			int Experiance=sc.nextInt();
			E.print_info(Eid,Ename,Edept);
			E.Calculate_Salary(Experiance);
			
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}