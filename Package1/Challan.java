package Package1;

public class Challan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trafficchallan texst1 = new Trafficchallan(false, false, true, false);
		texst1.caTrafficChallan(false, false, true, false);
		System.out.println();
		Trafficchallan texst2 = new Trafficchallan(true, false, true, false);
		texst2.caTrafficChallan(true, false, true, false);
		System.out.println();
		Trafficchallan texst3 = new Trafficchallan(true, false, true, false);
		texst3.caTrafficChallan(false, false, true, false);
		System.out.println();
		Trafficchallan texst4 = new Trafficchallan(true, false, true, false);
		texst4.caTrafficChallan(false, false, false, true);
		System.out.println();
		Trafficchallan texst5 = new Trafficchallan(true, true, true, false);
		texst5.caTrafficChallan(true, true, true, true);
		System.out.println();

		double challan = texst5.caTrafficChallan(true, true, true, true);
		double finaldiscount = Challandiscount("DEC", challan);
		System.out.println("if challan pay in dec the discount is : " + finaldiscount);
		double finaldiscount1 = Challandiscount("AUG", challan);
		System.out.println("if challan pay in other than dec the discount is : " + finaldiscount1);

	}

	public static double Challandiscount(String month, double Challan) {
		double discount = 0.0;
		if ("DEC".equals(month))
			discount = discount * 0.9;

		return discount;
	}

}
