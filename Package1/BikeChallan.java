package Package1;

public class BikeChallan {
	private int signaljumping;
	private int withouthelmet;
	private int withoutlicence;
	private int drunkanddrive;
	private int nochallan;

	public BikeChallan(int signaljumping, int withouthelmet, int withoutlicence, int drunkanddrive, int nochallan) {
		// TODO Auto-generated constructor stub
		super();
		this.signaljumping = signaljumping;
		this.withouthelmet = withouthelmet;
		this.withoutlicence = withoutlicence;
		this.drunkanddrive = drunkanddrive;
		this.nochallan = (nochallan);
	}

	public int getSignaljumping() {
		return signaljumping;
	}

	public void setSignaljumping(int signaljumping) {
		this.signaljumping = signaljumping;
	}

	public int getWithouthelmet() {
		return withouthelmet;
	}

	public void setWithouthelmet(int withouthelmet) {
		this.withouthelmet = withouthelmet;
	}

	public int getWithoutlicence() {
		return withoutlicence;
	}

	public void setWithoutlicence(int withoutlicence) {
		this.withoutlicence = withoutlicence;
	}

	public int getDrunkanddrive() {
		return drunkanddrive;
	}

	public void setDrunkanddrive(int drunkanddrive) {
		this.drunkanddrive = drunkanddrive;
	}

	public int getNochallan() {
		return nochallan;
	}

	public void setNochallan(int nochallan) {
		this.nochallan = nochallan;
	}

	public double calBikeChallan(int signaljumping, int withouthelmet, int withoutlicence, int drunkanddrive,
			int nochallan) {
		double BikeChallan = 0;
		BikeChallan += signaljumping * 200;
		System.out.println("signaljumping: " + signaljumping * 200);
		BikeChallan += withouthelmet * 500;
		System.out.println("withouthelmet: " + withouthelmet * 500);
		BikeChallan += withoutlicence * 5000;
		System.out.println("withoutlicence: " + withoutlicence * 5000);
		BikeChallan += drunkanddrive * 10000;
		System.out.println("drunkanddrive: " + drunkanddrive * 10000);
		BikeChallan += nochallan * 0;
		System.out.println("nochallan :" + nochallan * 0);
		return BikeChallan;
	}
}
