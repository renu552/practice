package Package1;

import java.util.Scanner;

public class Print_Maximum_num_of_Array 
{
public static void main(String[] args)
{
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the data");
		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter the data");
			num[i]=sc.nextInt();
			
		}
		
		int Max_Element=num[0];
		int  Min_Element=num[0];
		
		for(int i=0;i<n;i++)
		{
			if(num[i]>Max_Element)
			{
				Max_Element=num[i];
			}
		}
		
		System.out.println("Maximum Element"+Max_Element);
		for(int i=0;i<n;i++)
		{
			if(num[i]<Min_Element)
			{
				Min_Element=num[i];
			}
		}
		
		System.out.println("Minimum Element"+Min_Element);
		
		
		sc.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
