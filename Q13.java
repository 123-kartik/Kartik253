package SelfEvauation1;
 
import java.util.Scanner;
public class Q13 {
 int area(int W, int H)
 {
	 return (W*H);
 }
 int Perimeter(int W, int H)
 {
	 return (2*(W+H));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner Sc=new Scanner(System.in);
     int Width=Sc.nextInt();
     int Height=Sc.nextInt();
     Q13 Q=new Q13();
     System.out.println("Area is "+Q.area(Width,Height));
     System.out.println("Perimeter is "+ Q.Perimeter(Width,Height));
     
	}

}
