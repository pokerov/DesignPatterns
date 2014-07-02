public class CustomerFactory {
	
	public static final String[] names = {"Rob", "Bob", "Maya"};
	
	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name); // If the customer exists in the "DB" return it
			}
		}
		return new NullCustomer(); // Otherwise return null
	}
}