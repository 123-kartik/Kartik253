package Day5;
import java.util.*;
public class DowhilePrac {
  void add(int a, int b)
  {
	  System.out.println("Sum of "+ a+" & "+ b +" is " + (a+b));
  }
  void subtract(int a, int b)
  {
	  System.out.println("Subtraction of "+ a+" & "+ b +" is " + (a-b));
  }
  void muiltiply(int a, int b)
  {
	  System.out.println("Muiltiplication of "+ a+" & "+ b +" is " + (a*b));
  }
  void divide(int a, int b)
  {
	  System.out.println("Quetiant of divisor of "+ a+" & "+ b +" is " + (a/b));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=5,a,b;
		Scanner sc=new Scanner(System.in);
		do
			{
			System.out.println("For Addition press 1");
			System.out.println("For Subtraction press 2");
			System.out.println("For Multiplication press 3");
			System.out.println("For Divide press 4");
			System.out.println("For Exit press 5");
			choice=sc.nextInt();
			System.out.println("Now Give me two Numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			DowhilePrac Do=new DowhilePrac();
			if(choice==1)
				Do.add(a,b);
			else if (choice==2)
				Do.subtract(a,b);
			else if (choice==3)
			Do.muiltiply(a,b);
			else if (choice==4)
				Do.divide(a,b);
			else 
				System.out.println("You have entered a wrong choice.");
			}while(choice!=5);
	}

}
