package Package1; 
import java.util.Scanner;
 class sum_operation {

	void print_sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum"+sum);
	}
}
class Sum
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			 sum_operation c=new  sum_operation();
			System.out.println("Enter a first no");
			int first=sc.nextInt();
			System.out.println("Enter a second no");
			int second=sc.nextInt();
			c.print_sum(first,second);
			sc.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
