package Day3;

import java.util.*;
public class Swap {

	
	int a,b,c;
	void inputFunc() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two no.");
		
	a=sc.nextInt();
	b=sc.nextInt();
	}
	void displayFunc() {
	System.out.println("Orignal Values of a and b");
	
	System.out.println("a= "+ a);
	System.out.println("b= "+ b);
	}
	
	void swap() {
	c=b;
	b=a;
	a=c;
	}
/*System.out.println("Change Values of a and b");
	
	System.out.println("a= "+ a);
	System.out.println("b= "+ b);
	*/
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Swap Sw=new Swap();
     Sw.inputFunc();
     Sw.displayFunc();
     Sw.swap();
     Sw.displayFunc();
     
	}

}
