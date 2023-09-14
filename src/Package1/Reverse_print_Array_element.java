package Package1;
import java.util.*;
public class Reverse_print_Array_element {
public static void main(String[] args)
{
	try
	{
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[10];
		
		System.out.println("Enter the data");
		for(int i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("**************************************");
		for(int i=9;i>0;i--)
		{
			System.out.println(num[i]);
		}
		sc.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	

}
