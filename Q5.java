package SelfEvauation1;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter Mark of all five subject");
   int Sub1=Sc.nextInt();
   int Sub2=Sc.nextInt();
   int Sub3=Sc.nextInt();
   int Sub4=Sc.nextInt();
   int Sub5=Sc.nextInt();
   int Avg=(Sub1+Sub2+Sub3+Sub4+Sub5)/5;
   if (Avg<=40)
   	   System.out.println("Sorry, You are Fail");
   else if(40<Avg && Avg<=60)
	   System.out.println(" You Grade are C ");
   else if(60<Avg && Avg<=80)
	   System.out.println(" You Grade are B ");
   else 
	   System.out.println(" You Grade are A ");
	   
   
   
	   
	}

}
