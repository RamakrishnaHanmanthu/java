package Package1;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = sc.nextInt();
		if (ispalindrom(number)) {
			System.out.println(number + "is a palindrom ");
		} else {
			System.out.println(number + "is not a palindrom ");
		}
		sc.close();
	}

	private static boolean ispalindrom(int number) {
		// TODO Auto-generated method stub
		int originalnumber = number;
		int reversenumber = 0;
		while (number != 0) {
			int digit = number % 10;
			reversenumber = reversenumber * 10 + digit;
			number /= 10;
		}
		return originalnumber == reversenumber;
	}

}
