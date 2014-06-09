// Concrete implementation of Circle

public class Circle extends Shape {
	
	public Circle() {
		type = "Circle"; // Variable is protected and is visible
	}
	
	@Override public void draw() {
		System.out.println("Circle is painted.");
	}
}