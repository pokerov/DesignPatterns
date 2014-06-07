// Singleton Design Pattern

// Idea behind this design pattern is to restrict access to only one. You can
// create a synchronized return of the object while working with concurrency.

 public class SingletonPattern {
 
	public static void main(String[] args) {
		
		// If you try to create new instance of SingletonObject - Illegal construct
		// because constructor is hidden (private).
		
		SingletonObject so = SingletonObject.getInstance();
		so.printMessage();
	}
 }