package Package1;

public class Methods {

	public static double calSalary(int numberOfWorkingDays, int perDayWages) {

		double salary = numberOfWorkingDays * perDayWages;

		return salary;
	}

	public static double calTax(double salary) {

		double tax = 0;

		if (salary > 10000 && salary < 15000) {
			tax = (salary * 10) / 100;
		} else if (salary > 15000) {
			tax = (salary * 20) / 100;
		}

		return tax;

	}

	public static void main(String[] args) {
		double salary = calSalary(12, 1000);
		double salary1 = calSalary(20, 1000);

		double tax = calTax(salary);
		double tax1 = calTax(salary1);

		System.out.println("the salary is : " + salary + " and tax is " + tax);
		System.out.println("the salary is : " + salary1 + " and tax is " + tax1);
	}

}