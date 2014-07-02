public class NullCustomer extends AbstractCustomer {

	// Concrete class for AbstractCustomer
	
	@Override
	public String getName() {
		return "Not available.";
	}
	
	@Override
	public boolean isNil() {
		return true;
	}
}