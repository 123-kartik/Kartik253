package Day3;
import java.util.Scanner;
public class GreaterOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1,Num2,Num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 No. ");
		Num1=sc.nextInt();
		Num2=sc.nextInt();
		Num3=sc.nextInt();
		
		if(Num1>Num2)
		{
			if(Num1>Num3)
			{
				System.out.println(Num1 +" is greater number.");
			}
		}
		else if (Num2>Num3)
		{
			System.out.println(Num2 +" is greater number.");
		}
		else 
			System.out.println(Num3 +" is greater number.");
	
	}
}
