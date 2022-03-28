package Day3;
import java.util.*;
public class EvenOrOdd {
	int Num;
   void input()
   {
	//int Num;
	Scanner sc=new Scanner(System.in);
	Num=sc.nextInt();
   }
   void check()
   {
	   if(Num%2==0)
	   System.out.println(Num +" is Even.");
	   else 
		   System.out.println(Num +" is Odd.");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOrOdd E=new EvenOrOdd();
		E.input();
		E.check();
	}

}
