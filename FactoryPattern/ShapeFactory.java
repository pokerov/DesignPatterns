public class ShapeFactory {

	// Here we return our custom implementations of Rectangle, Square and Circle classes.
	// This method only returns the either object or null without exposing implementation.
	
	// Note: Objects (like String) are null terminated in Java.

	public Shape getShape(String shapeType) {
		if (shapeType == null) return null;
		else if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		else if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		else if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
		return null;
	}
}