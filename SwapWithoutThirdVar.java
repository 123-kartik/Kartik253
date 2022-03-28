package Day3;
import java.util.Scanner;
public class SwapWithoutThirdVar {
	int a,b;
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
	a=a+b;
	b=a-b;
	a=a-b;
	displayFunc();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapWithoutThirdVar Sw=new SwapWithoutThirdVar();
     Sw.inputFunc();
     Sw.displayFunc();
     Sw.swap();
	}

}