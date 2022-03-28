package Day3;

import java.util.Scanner;

public class IfElseCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mark=69.8;
		String Name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name and marks");
		Name=sc.next();
		//mark= sc.nextFloat();
		if(mark>=90) {System.out.println(Name +" is in Grade A.");}
		else if(mark>=80){System.out.println(Name +" is in Grade B.");}
		else if(mark>=70){System.out.println(Name +" is in Grade C.");}
		else if(mark>=60){System.out.println(Name +" is in Grade D.");}
		else if(mark>=50){System.out.println(Name +" is in Grade E.");}
		else 
		{System.out.println(Name +" is fail.");}
		System.out.println(mark);
	}

}
