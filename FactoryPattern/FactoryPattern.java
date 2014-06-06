// Factory Pattern

// This is one of the most popular patterns used to create an object.
// In this patter we crate an object without exposing creation logic and refer to the new object using common interface.

public class FactoryPattern {

	public static void main(String[] args) {
		
		// Our factory which returns known objects
		ShapeFactory factory = new ShapeFactory();
		
		// Get objects by common interface (Shape)
		Shape rectangle = factory.getShape("rectangle");
		Shape square = factory.getShape("Square");
		Shape circle = factory.getShape("CIRCLE");
		
		// To prove we are having these object we call draw() method on each
		rectangle.draw();
		square.draw();
		circle.draw();
	}
}