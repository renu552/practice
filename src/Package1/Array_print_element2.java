package Package1;

import java.util.Scanner;

public class Array_print_element2 {

	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int num[][]=new int[10][10];
			System.out.println("Enter the data");
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<i;j++)
				{
				num[i][j]=sc.nextInt();
				}
				
			}
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<i;j++)
				{
				System.out.println(num[i][j]);
				//System.out.println("Num["+i+" ]="+num[i][j]);
				}
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
