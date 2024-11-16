package Package1;

public class Trafficchallan {
	private boolean signaljumping1;
	private boolean withouthelmet1;
	private boolean withoutlicence1;
	private boolean drunkanddrive1;

	public Trafficchallan(boolean signaljumping1, boolean withouthelmet1, boolean withoutlicence1,
			boolean drunkanddrive1) {
		super();
		this.signaljumping1 = signaljumping1;
		this.withouthelmet1 = withouthelmet1;
		this.withoutlicence1 = withoutlicence1;
		this.drunkanddrive1 = drunkanddrive1;
	}

	public boolean getSignaljumping1() {
		return signaljumping1;
	}

	public void setSignaljumping1(boolean signaljumping1) {
		this.signaljumping1 = signaljumping1;
	}

	public boolean getWithouthelmet1() {
		return withouthelmet1;
	}

	public void setWithouthelmet1(boolean withouthelmet1) {
		this.withouthelmet1 = withouthelmet1;
	}

	public boolean getWithoutlicence1() {
		return withoutlicence1;
	}

	public void setWithoutlicence1(boolean withoutlicence1) {
		this.withoutlicence1 = withoutlicence1;
	}

	public boolean getDrunkanddrive1() {
		return drunkanddrive1;
	}

	public void setDrunkanddrive1(boolean drunkanddrive1) {
		this.drunkanddrive1 = drunkanddrive1;
	}

	public double caTrafficChallan(boolean signaljumping1, boolean withouthelmet1, boolean withoutlicence1,
			boolean drunkanddrive1) {
		double TrafficChallan = 0;
		if (signaljumping1) {
			TrafficChallan += 200;
			System.out.println("signaljumping1 : " + TrafficChallan);
		}
		if (withouthelmet1) {
			TrafficChallan += 500;
			System.out.println("withouthelmet1 : " + TrafficChallan);
		}
		if (withoutlicence1) {
			TrafficChallan += 5000;
			System.out.println("withoutlicense1 : " + TrafficChallan);
		}
		if (drunkanddrive1) {
			TrafficChallan += 10000;
			System.out.println("drunkanddrive1 : " + TrafficChallan);
		}
		return TrafficChallan;

	}
}
