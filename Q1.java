package SelfEvauation1;
class Display{
 void display()
 {
	 System.out.println("Running from 2nd a class");
	   System.out.println("Hello World"); 
 }
}

public class Q1 {
   void display()
   {
	   System.out.println("Running from inside a class");
	   System.out.println("Hello World");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Running from main method");
    System.out.println("Hello World");
    Q1 HW=new Q1();
    HW.display();
    Display d=new Display();
    d.display();
    
	}

}
