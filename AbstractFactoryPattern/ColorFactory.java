public class ColorFactory extends AbstractFactory {
	
	// Mandatory (by AbstractFactory) implementation of getShape() method
	
	@Override public Shape getShape(String shapeType) {
		return null;
	}
	
	// Separated implementation for colors, located in separated file
	
	@Override public Color getColor(String color) {
		if (color == null) return null;
		else if (color.equalsIgnoreCase("RED")) return new Red();
		else if (color.equalsIgnoreCase("GREEN")) return new Green();
		else if (color.equalsIgnoreCase("BLUE")) return new Blue();
		return null;
	}
}