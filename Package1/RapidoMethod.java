package Package1;

public class RapidoMethod {

	private double noofkms;

	public RapidoMethod(double noofkms) {
		super();
		this.setNoofkms(noofkms);

	}

	public double getNoofkms() {
		return noofkms;
	}

	public void setNoofkms(double noofkms) {
		this.noofkms = noofkms;
	}

	public double calpremium(double noofkms) {
		double Bill = 0;

		Bill = noofkms * 18;
		System.out.println("the bill is " + noofkms * 18);

		return Bill;
	}

	public double calpremium(double noofkms, boolean premium) {
		double Bill = 0;
		if (premium) {
			if (noofkms <= 10) {
				Bill = noofkms * 10;
				System.out.println("the bill is " + noofkms * 10);
			} else {
				Bill = noofkms * 15;
				System.out.println("the bill is " + noofkms * 15);
			}
		} else {
			return Bill;
		}

		return Bill;
	}
}
