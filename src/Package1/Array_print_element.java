package Package1;

import java.util.*;

public class Array_print_element {

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
			for(int i=0;i<10;i++)
			{
				//System.out.println(num[i]);
				System.out.println("Num["+i+" ]="+num[i]);
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
