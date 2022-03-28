package SelfEvauation1;

import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
      int i=0;
        do {
        	String code=sc.next();
       if (code.equals("COOLCOOL"))
        	{
        	System.out.println("Welcome User");
        	break;
        	}
        else
        	System.out.println("Code is incorrect,plz reenter");
        i++;
        }
        while(i<3);
        
        if(i==3)
        	System.out.println("Go Back");
	}

}
