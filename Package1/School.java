package Package1;

public class School<string> {

	private String stdName;
	private String stdRollno;
	private String stdsection;

	public School(String stdName, String stdRollno, String stdsection) {
		super();
		this.stdName = stdName;
		this.stdRollno = stdRollno;
		this.stdsection = stdsection;
	}

	public String getsstdName() {
		return stdName;
	}

	public String getsstdRollno() {
		return stdRollno;
	}

	public String getsstdsection() {
		return stdsection;
	}

	public void setstdName(String stdName) {
		this.stdName = stdName;
	}

	public void setstdRollno(String stdRollno) {
		this.stdRollno = stdRollno;
	}

	public void setsection(String stdsection) {
		this.stdsection = stdsection;
	}

	public static void main(String[] args) {
		School std = new School("pspk", "01", "A");
		School std1 = new School("rama", "02", "A");
		School std2 = new School("shiva", "1", "A");
		System.out.println(std2.getsstdName());
		System.out.println();
		System.out.println(std2.getsstdRollno());
		System.out.println(std2.stdsection);
		System.out.println(std2.getClass());
	}

}
