// Concrete implementation of Rectangle

public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "Rectangle"; // Variable is protected and is visible
	}
	
	@Override public void draw() {
		System.out.println("Rectangle is painted.");
	}
}