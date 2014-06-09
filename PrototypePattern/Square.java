// Concrete implementation of Square

public class Square extends Shape {
	
	public Square() {
		type = "Square"; // Variable is protected and is visible
	}
	
	@Override public void draw() {
		System.out.println("Square is painted.");
	}
}