package Package1;

import java.util.Scanner;

public class BikePay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BikeChallan cust1 = new BikeChallan(1, 1, 1, 0, 0);
		System.out.println("the bikechallan is : " + cust1.calBikeChallan(1, 0, 0, 0, 0));
		BikeChallan cust2 = new BikeChallan(1, 1, 1, 0, 0);
		System.out.println("the bikechallan is : " + cust2.calBikeChallan(0, 1, 0, 0, 0));
		BikeChallan cust3 = new BikeChallan(1, 1, 1, 0, 0);
		System.out.println("the bikechallan is : " + cust3.calBikeChallan(0, 0, 1, 0, 0));
		BikeChallan cust4 = new BikeChallan(1, 1, 1, 0, 0);
		System.out.println("the bikechallan is : " + cust4.calBikeChallan(0, 0, 0, 1, 0));
		BikeChallan cust5 = new BikeChallan(1, 1, 1, 0, 2);
		System.out.println("the bikechallan is : " + cust5.calBikeChallan(2, 2, 1, 1, 2));

		double challan = cust5.calBikeChallan(2, 2, 1, 1, 2);

		double finaldiscount = BikePaydiscount("DEC", challan);
		System.out.println("if challan pay in dec the discount is : " + finaldiscount);
		double finaldiscount1 = BikePaydiscount("AUG", challan);
		System.out.println("if challan pay in other than dec the discount is : " + finaldiscount1);

		Scanner sc = new Scanner(System.in);

		int signalJumping = sc.nextInt();
		int withoutHelmet = sc.nextInt();
		int withoutLicense = sc.nextInt();
		int drunkandDrive = sc.nextInt();
		int noChallan = sc.nextInt();

		BikeChallan cust6 = new BikeChallan(signalJumping, withoutHelmet, withoutLicense, drunkandDrive, noChallan);
		System.out.println("the fine is : "
				+ cust6.calBikeChallan(signalJumping, withoutHelmet, withoutLicense, drunkandDrive, noChallan));
		sc.close();
	}

	public static double BikePaydiscount(String month, double Challan) {
		double discount = 0.0;
		if ("DEC".equals(month))
			discount = Challan * 0.9;

		return discount;
	}

}
