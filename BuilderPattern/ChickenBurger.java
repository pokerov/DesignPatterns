public class ChickenBurger extends Burger {

	// This implementation is same as in VegBurger.java,
	// packing is already present and we continue it with price and name

	@Override public float price() {
		return 50.5f;
	}
	
	@Override public String name() {
		return "Chicken Burger";
	}
}