package Package1;

public class CalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area=new Area(0,0,0,0,0,0);
		
		
		System.out.println("area of a circle: "+Area.calAreacircle(3)+"perimeter of  a circle :"+Area.calPerimetercircle(4));
		System.out.println("area of a square : "+area.calAreasquare(5)+"perimeter of a square : "+area.calPerimetersquare(5));
		System.out.println("area of a cube: "+area.calAreacube(5)+"perimeter of  a cube :"+area.calPerimetercube(5));
		System.out.println("area of a cuboid: "+area.calAreacuboid(2, 3, 4)+"perimeter of  a cuboid :"+area.calPerimetercuboid(2, 3, 4));
		System.out.println("area of a triangle: "+area.calAreatriangle(5, 4)+"perimeter of  a triangle :"+area.calPerimetertriangle(5, 4, 2));
		System.out.println("area of a rectangle: "+area.calArearectangle(6, 4)+"perimeter of  a rectangle :"+area.calPerimeterrectangle(2, 3));
		System.out.println("area of a hexagon: "+area.calAreahexagone(5)+"perimeter of  a hexagon :"+area.calPerimeterhexagon(6));
		

	}

}
