package Package1;
import java.util.Scanner;
public class Trial {

	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 no");
	    int a=s.nextInt();
	    System.out.println("Enter 2 no");
	     int b=s.nextInt();
	     Main m=new Main();
	     m.add(a, b);
	     m.sub(a, b);
	     s.close();
     }

}




	
class Main
{
void add(int x,int y)
{
	
	int z=x+y;
	System.out.println("Sum"+z);
}
void sub(int x,int y)
{
	
	int z=x-y;
	System.out.println("Sum"+z);
}
}
