package Package1;
import java.util.Scanner;

class customerdemo{
	void Display_info(int id ,String name,String city)
	{
		System.out.println(" Customer Id is"+id);
		System.out.println(" name is"+name);
		System.out.println(" city is"+city);
	}
	void calculate_Discount(int amt)
	{
		if(amt>300)
		{
		int discount=amt*10/100;
		System.out.println("Discount"+discount);
		
		int amount=discount-amt;
		System.out.println("Amount"+amount);
	    }
		else if(amt>200&&amt<=300)
		{
			int discount=amt*8/100;
			System.out.println("Discount"+discount);
			int amount=discount-amt;
			System.out.println("Amount"+amount);
		}
		
		else
		{
			int discount=amt*5/100;
			System.out.println("Discount"+discount);
			
			int amount=discount-amt;
			System.out.println("Amount"+amount);
		}
    }
}



public class Customer 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		customerdemo c=new customerdemo();
		System.out.println("Enter a customer Id");
		int cid=sc.nextInt();
		System.out.println("Enter a customer name");
		String cname=sc.next();
		System.out.println("Enter a customer city");
		String ccity=sc.next();
		System.out.println("Enter a customer amount");
		int camount=sc.nextInt();
		c.Display_info( cid ,cname,ccity);
		c.calculate_Discount(camount);
		sc.close();
		
	}

	
}





