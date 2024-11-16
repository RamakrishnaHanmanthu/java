package Package1;

public class Area {
	private double side;
	private double length;
	private double breadth;
	private double height;
	private double base;
	private double radius;

	public Area(double side, double length, double breadth, double height, double base, double radius) {
		super();
		this.side = side;
		this.radius = radius;
		this.height = height;
		this.length = length;
		this.base = base;
		this.breadth = breadth;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calAreasquare(double side) {
		return side * side;
	}

	public double calArearectangle(double length, double breadth) {

		return length * breadth;
	}

	public double calAreatriangle(double base, double height) {

		return 0.5 * base * height;
	}

	public double calAreacube(double side) {

		return 6 * (side * side);
	}

	public double calAreacuboid(double length, double height, double breadth) {

		return 2 * ((length * breadth) + (breadth * height) + (height * length));
	}

	public static double calAreacircle(double radius) {

		return 3.14159265359 * (radius * radius);

	}

	public double calAreahexagone(double side) {

		return (3 * Math.sqrt(3) * side * side) / 2;
	}

	public double calPerimetersquare(double side) {

		return 4 * side;

	}

	public double calPerimeterrectangle(double length, double breadth) {
		return 2 * (length + breadth);

	}

	public double calPerimetercube(double side) {
		return 12 * side;

	}

	public double calPerimetercuboid(double length, double breadth, double height) {
		return 4 * (length + height + breadth);

	}

	public double calPerimetertriangle(double side1, double side2, double side3) {

		return side1 + side2 + side3;

	}

	public double calPerimeterhexagon(double side) {
		
		return 6 * side;

	}
	public static double calPerimetercircle(double radius) {
		
		return 2*3.14159265359*radius;
		
	}
	public static void main(String[] args) {
		
		System.out.println("the area of circlr : " + calAreacircle(2)+ "the perimeter of circle : " +calPerimetercircle(3));
		
	}

}
