package day1;
import java.util.Scanner;

public class largeofTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter any Two number for which you chack which one is greter");
		
		int a= s.nextInt();
		int b= s.nextInt();
		
		if(a<b) {
			System.out.println("b is greter than a : " + b);
		}
		else {
			System.out.println("a is greter than b : " + a);
		}
	}

}
