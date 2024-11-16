package Package1;

public class Rapido {

	private boolean premium;
	private double noofkms;
	public Rapido(boolean premium , double noofkms) {
		
		super();
		this.premium=premium;
		this.noofkms=noofkms;
	}
	
	public boolean getPermium() {
		return premium;
	}
	public void setPermium(boolean permium) {
		this.premium = permium;
	}
	public double getNoofkms() {
		return noofkms;
	}
	public void setNoofkms(double noofkms) {
		this.noofkms = noofkms;
	}
	public double calBill() {
		 double Bill=0; 
		if(premium) {
			if(noofkms <= 10) {
				Bill=noofkms*10;
				System.out.println("the bill is "+ noofkms * 10);
			}else {
				Bill=noofkms*15;
			System.out.println("the bill is " + noofkms * 15);
			}
		}else {
			Bill = noofkms*18;
			System.out.println("the bill is " + noofkms * 18);
		}
		
		return calGst(Bill);	
	}
	private  double calGst( double Bill) {
		// TODO Auto-generated method stub
		double Gst= 0.0;
		//tax payers
		if (Bill<=100) {
			Gst = 0;
			System.out.println("the gst bill : "+ Gst);
		}else if (Bill > 100) {
			Gst = Bill * 0.18;
			System.out.println("the gst bill : "+ Gst);
		
		}
		return Gst;
	}
}
