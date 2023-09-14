package Package1;

import java.util.Scanner;

public class Sum_of_Array_Elements {

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
			int sum=0;
			for(int i=0;i<10;i++)
			{
				sum=sum+num[i];
				
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
