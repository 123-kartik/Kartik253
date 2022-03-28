package SelfEvauation1;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner Sc=new Scanner(System.in);
     int a=Sc.nextInt();
     int b=a,last,Rev_Digit=0;
     
     while(b>0)
     {
    	 last=b%10;
    	 Rev_Digit=Rev_Digit*10+last;
    	 b=b/10;
     }
     System.out.println(Rev_Digit);
	}

}
