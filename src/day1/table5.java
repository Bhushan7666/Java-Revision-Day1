package day1;
import java.util.Scanner;

public class table5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the number for which you want the table");
		
		int n=s.nextInt(); 
		
		for(int a=1;a<=10;a++)
		{
			System.out.println(a*n);
		}
	}

}
