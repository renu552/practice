package Package1;
import java .util.*;
class Exam
{
	void Display_info(int roll_no)
	{
		System.out.println("Roll no is a"+roll_no);
	}
	
	void calculate_fees(int no_of_papers)
	{
		int fees;
		if(no_of_papers>5) 
		{
			System.out.println("No of papers is"+no_of_papers);
			fees=no_of_papers*120;
			System.out.println("fees="+fees);
		}
		else if(no_of_papers>3&&no_of_papers<=5) 
		{
			System.out.println("No of papers is"+no_of_papers);
			fees=no_of_papers*100;
			System.out.println("fees="+fees);
		}
		else
		{
			System.out.println("No of papers is"+no_of_papers);
			fees=no_of_papers*60;
			System.out.println("fees="+fees);
		}
		int pc=fees*15/100;
		fees=fees*pc;
		System.out.println("Paper checking"+pc);
		
		int pk=fees*10/100;
		System.out.println("Marksheet printing"+pk);
		fees=fees+pc+pk;
		System.out.println("Total fees"+fees);
		
	}
}


public class University {
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			Exam E=new Exam();
		
			System.out.println("Enter roll no");
			int rool_no=sc.nextInt();
			System.out.println("Enter no of papers");
			int no_of_papers=sc.nextInt();
			E.Display_info(rool_no);
			E.calculate_fees(no_of_papers);
			
			
			sc.close();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			
		}
	}

	
}
