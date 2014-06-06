 public class ShapeFactory extends AbstractFactory {
 
	// Unlike Factory Pattern, here we inherit an abstract class
	
	@Override public Shape getShape(String shapeType) {
		if (shapeType == null) return null;
		else if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		else if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		else if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
		return null;
	}
	
	// Mandatory (by AbstractFactory) implementation of getColor() method
	
	@Override public Color getColor(String color) {
		return null;
	}
 
 }