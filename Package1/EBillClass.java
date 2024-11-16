package Package1;

import java.util.Scanner;

public class EBillClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		eBill cust = new eBill(2000, 1000);
		cust.calunits(2000, 1000);
		Scanner sc = new Scanner(System.in);

		System.out.println("currentreading :");
		double currentreading = sc.nextDouble();
		System.out.println("pastreadings :");
		double pastreadings = sc.nextDouble();
		eBill cust1 = new eBill(currentreading, pastreadings);
		System.out.println("the units is : " + cust1.calunits(currentreading, pastreadings));
		sc.close();
	}

}
