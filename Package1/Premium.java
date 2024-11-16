package Package1;
public class Premium {
	public static void main(String arg[] ) {
		Rapido cust1= new Rapido(false, 20);
		cust1.calBill();
		Rapido cust2= new Rapido(true,10);
		cust2.calBill();
		Rapido cust3= new Rapido(false, 20);
		cust3.calBill();
		Rapido cust4= new Rapido(true, 30);
		cust4.calBill();
		Rapido cust5= new Rapido(false, 4);
		cust5.calBill();
		Rapido cust6= new Rapido(true, 50);
		cust6.calBill();
		Rapido cust7= new Rapido(false, 6);
		cust7.calBill();
		Rapido cust8= new Rapido(true, 70);
		cust8.calBill();
		Rapido cust9= new Rapido(false, 8);
		cust9.calBill();
		Rapido cust10= new Rapido(true, 90);
		cust10.calBill();
	}
}