package day1;
import java.util.Scanner;
import java.util.jar.Manifest;

public class factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		char ch;
		int num ;
	do {
		System.out.println("enter the for which you want facter");

		int fact =1;
		num = s.nextInt();
		
		 for (int i= 1;i<num+1;i++) {
			 fact = fact * i;
		 }
		
		System.out.println("factorial = " + fact);
		
		System.out.println("if YOU want contenu enter : 'y'or'Y' ");
		
		

		ch = s.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	s.close();
	}
}
