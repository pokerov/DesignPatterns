// Prototype Pattern

// This pattern is useful when dealing with cached classes where we need to use them later.
// Good example are utility classes where instead of passing reference we can call them directly by clone
// since they provide static access through ShapeCache.

public class PrototypePattern {

	public static void main(String[] args) {
		
		ShapeCache.loadCache(); // Loads our objects
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		
		System.out.println("Shape : " + clonedShape.getType());
		System.out.println("Shape : " + clonedShape2.getType());
		System.out.println("Shape : " + clonedShape3.getType());
	}
}