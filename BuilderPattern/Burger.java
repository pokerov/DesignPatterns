public abstract class Burger implements Item {

	// Since it's abstract class it can partial implement the interface
	// Also this class gives us some default implementation of Item interface
	
	@Override public Packing packing() {
		return new Wrapper();
	}
	
	@Override public abstract float price();
}