public class FactoryProducer {

	// Note static modifier means shared resource for the whole program
	// Also notice we are returning AbstractFactory (abstract class) for method
	// ShapeFactory and ColorFactory are sub-classes of AbstractFactory so we use polymorphism

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) return new ShapeFactory();
		else if (choice.equalsIgnoreCase("COLOR")) return new ColorFactory();
		return null;
	}
}