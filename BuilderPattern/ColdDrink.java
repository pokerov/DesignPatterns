public abstract class ColdDrink implements Item {
	
	// Same logic as in Burger.java
	// Partial implementation is also present here
	
	@Override public Packing packing() {
		return new Wrapper();
	}
	
	@Override public abstract float price();
}