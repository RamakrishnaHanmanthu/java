package Package1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("enter a number:");
			int number=sc.nextInt();
			
int fact =1;

for(int i=1;i<=number;i++) {
			
			
			fact=fact*i;
			
}

System.out.println("factorial of the number :" +fact);
		}	

}
}