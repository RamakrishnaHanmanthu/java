package Package1;

public class eBill {
	private double currentreading;
	private double pastreading;

	public eBill(double currentreadings, double pastreadings) {
		super();
		this.currentreading = currentreadings;
		this.pastreading = pastreadings;
	}

	public double getCurrentreading() {
		return currentreading;
	}

	public void setCurrentreading(double currentreading) {
		this.currentreading = currentreading;
	}

	public double getPastreading() {
		return pastreading;
	}

	public void setPastreading(double pastreading) {
		this.pastreading = pastreading;
	}

	public double calunits(double units, double eBill) {
		// TODO Auto-generated method stub
		if (units <= 100) {
			System.out.println("the bill is : " + eBill * 0);
		} else {
			System.out.println("the above 100 is : " + eBill * 20);
		}
		return currentreading - pastreading;

	}

}
