package BiggestRectangleApp;

import java.util.ArrayList;

public class BiggestRectangeApp {

	public static void main(String[] args) {
		ArrayList<Rectangle> list = new ArrayList<>();
		list.add(new Rectangle(5.0, 9.0));
		list.add(new Rectangle(1, 20));
		list.add(new Rectangle(3.5, 13));
		
		Room sunRoom = new Room("SUn", 35, 22);
		//yes. can do implicit narrowing conversion.
		Rectangle sunRect = sunRoom;
		//np. can not do implicit narrowing conversion.
		sunRoom = sunRect;
		//Room theRoom = sunRect;
		
		//Same concept as widening/narrowing conversion
		int x = 1;
		double y =x;
		x=(int) y;
		
		
		System.out.println(sunRoom.getLength());
		System.out.println(sunRoom.getName());
		
		System.out.println(sunRect.getLength());
		System.out.println(sunRect.getName());
		
		// We have to set initial largest to any rectangle
		Rectangle largest = list.get(0);
		for (Rectangle rectangle : list) {
			if (rectangle.getArea() > largest.getArea()) {
				largest = rectangle;
			}
		}
		
		System.out.println("Largest rectangle is " + largest.getLength() + "x" + largest.getWidth());
	}

}