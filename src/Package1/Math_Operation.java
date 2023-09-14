package Package1;
import java.util.Scanner;
public class Math_Operation {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=s.nextInt();
		MainDemo M=new MainDemo();
		M.Square(num);
		M.cube(num);
		s.close();
	}
}
class MainDemo
{
	void Square(int num) {
		int sq=num*num;
		System.out.println("square="+sq);
	}
	void cube(int num) {
		int cu=num*num*num;
		System.out.println("cube="+cu);
	}
	
}
