public class VegBurger extends Burger {

	// This is concrete implementation of end item - Vegetarian Burger
	// Note we are inheriting default implementation and method packing is set already
	
	@Override public float price() {
		return 25.0f;
	}
	
	@Override public String name() {
		return "Vegetarian Burger";
	}
}