package Package1;
import java.util.Scanner;
class Travellerdemo{
	void DisplayInfo (int id,String name,String gender)
	{
		System.out.println(" Id is"+id);
		System.out.println(" name is"+name);
		System.out.println(" Gender is"+gender);
		
	}
	void calculate_amt(int distance)
	{
		if(distance>300)
		{
			int amt=distance*20;
			System.out.println("Amount is\n "+amt);
		}
		else if(distance>200&&distance<=300)
		{
			int amt=distance*50;
			System.out.println("Amount is \n"+amt);
		}
		else
		{
			int amt=distance*12;
			System.out.println("Amount is \n "+amt);
		}
	}
    }

public class Traveller{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		Travellerdemo T= new Travellerdemo();
		System.out.println("Enter student id\n");
		int sid=sc.nextInt();
		System.out.println("Enter student name\n");
		String sname=sc.next();
		System.out.println("Enter dept dept\n");
		String sdept=sc.next();
		T.DisplayInfo(sid,sname,sdept);
		System.out.println("-------------------------------------");
		System.out.println("Enter the distance:");
		int dis=sc.nextInt();
		System.out.println(dis);
		T.calculate_amt( dis);
		sc.close();
	}

	
	}


