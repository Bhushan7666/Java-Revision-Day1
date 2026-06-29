package day1;
import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		
		System.out.println("enter the number for which you wants to chack it even or odd");
		
		int n = s.nextInt();
		
		if (n%2==0) 
		{
			System.out.println("that number is even : " + n);
		}
		else 
		{
			System.out.println("that number is odd : " + n);
		}
	}

}
