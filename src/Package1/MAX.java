package Package1;

import java.util.Scanner;

class demo {
	 void maximum(int a,int b,int c)
	 {
	
		 if(a>b&&a>c)
		 {
			 System.out.println("a is maximum no");
		 }
		 if(b>a&&b>c)
		 {
			 System.out.println("b is maximum no");
		 }
		 if(c>a&&c>b)
		 {
			 System.out.println("c is maximum no");
		 }
	 }
	 void minimum(int a,int b,int c)
	 {
		 if(a<b&&a<c)
		 {
			 System.out.println("a is minimum no");
		 }
		 else if(b<a&&b<c)
		 {
			 System.out.println("b is minimum no");
		 }
		 else if(c<a&&c<b)
		 {
			 System.out.println("c is minimum no");
		 }
	 }


	
}
public class MAX{
	 public static void main(String[] args)
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the first no:");
		 int num1=s.nextInt();
		 System.out.println("Enter the second no=");
		 int num2=s.nextInt();
		 System.out.println("Enter the third no=");
		 int num3=s.nextInt();
		 demo M=new demo();
		 M.maximum(num1, num2, num3);
		 M.minimum(num1, num2, num3);
		 s.close();
	 }
	 
}



