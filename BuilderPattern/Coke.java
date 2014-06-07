public class Coke extends ColdDrink {
	
	// Concrete implementation of ColdDrink with already present packing
	
	@Override public float price() {
		return 30.0f;
	}
	
	@Override public String name() {
		return "Coke";
	}
}