package BiggestRectangleApp;

public class Room extends Rectangle {
	private String name;

	public Room() {
		super();
	}

	public Room(String name, double length, double width) {
		super(length, width);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + ", length=" + getLength() + ", width=" + getWidth() + "]";
	}
	
	
	
}