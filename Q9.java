package SelfEvauation1;
import java.util.Scanner;
public class Q9 {
			public static void main(String[] args) {
			// TODO Auto-generated method stub
	     
			int Num1=0,Num2=1,Sum=0,Limit;
			Scanner Sc=new Scanner(System.in);
		     Limit=Sc.nextInt();
	     System.out.print(Num1 +"  "+ Num2);
	     
	     for (int i=0; i<=Limit; i++ )
	     {
	    	
	    	 Num1=Num2;
	    	 Num2=Sum;
	    	 Sum=Num1+Num2;
	    	 if(Sum>Limit)
	    	 {
	    		 break;
	    	 }
	    	 
	    	 System.out.print("  "+ Sum);
	    	
	     }
		}
}
