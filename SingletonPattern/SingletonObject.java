public class SingletonObject {

	// Since the constructor is private is denies instantiation with "new" keyword
	// This object is either created or not created by only one way which is static
	// Static creation gives direct access - SingletonObject.getInstance();

	private static SingletonObject instance = new SingletonObject();
	
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		return instance;
	}
	
	// Rest of the code
	
	public void printMessage() {
		System.out.println("Singleton Design Pattern");
	}
}