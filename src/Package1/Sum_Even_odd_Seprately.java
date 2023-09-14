package Package1;

import java.util.Scanner;

public class Sum_Even_odd_Seprately {

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
				int esum=0;
				int osum=0;
				for(int i=0;i<10;i++)
				{
					esum=esum+num[i];
					
				}
				System.out.println("Even sum="+esum);
				
				for(int i=0;i<10;i++)
				{
					osum=osum+num[i];
					
				}
				System.out.println(" Odd sum="+osum);
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
