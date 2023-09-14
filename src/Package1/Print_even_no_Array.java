package Package1;
import java.util.*;
public class Print_even_no_Array {
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int num[]=new int[10];
			System.out.println("Enter the data");
			for(int i=0;i<10;i++)
			{
				//System.out.println("Enter the data");
				num[i]=sc.nextInt();
				
			}
			System.out.println("**************************");
			int sum=0;
			for(int i=0;i<10;i++)
			{
				if(num[i]%2==0)
				{
					System.out.println("Event no="+num[i]);
				}
				
			}
			System.out.println("sum="+sum);
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
