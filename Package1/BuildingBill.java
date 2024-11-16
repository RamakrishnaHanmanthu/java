package Package1;

import java.util.Scanner;

public class BuildingBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("length :");
		int length = sc.nextInt();
		System.out.println("breath :");
		int breath = sc.nextInt();

		Building build = new Building(length, breath);
		int sqft = build.calculateSquareFeet(length, breath);
		double days = build.calculateDaysRequired(sqft);
		int costOfCons = build.calculateConstructionCost(sqft);
		int costOfMat = build.calculateMaterialCost(sqft);
		double totalCost = build.calculateTotalCost(costOfCons, costOfMat);

		System.out.println("total sqfts " + sqft + " number of days " + days + " cost of con " + costOfCons
				+ " cost of mat " + costOfMat + " total cost " + totalCost);

		sc.close();
	}
}
  