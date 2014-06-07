public class Pepsi extends ColdDrink {
	
	// Concrete implementation
	
	@Override public float price() {
		return 35.0f;
	}
	
	@Override public String name() {
		return "Pepsi";
	}
}