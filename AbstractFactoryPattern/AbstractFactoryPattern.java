 // Abstract Factory Pattern
 
 // Note this is not Factory Pattern but the idea is more abstract here,
 // since we are joining two factories in one called Producer.
 // This design pattern divides every part of the program and takes advantage
 // of polymorphism feature of Java. After that joins the two factories to 
 // provide working file which controls everything.
 
 public class AbstractFactoryPattern {
	
	public static void main(String[] args) {
	
		// Use common class (which is abstract) to get our factories
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		// Using polymorphism invoke draw() and fill() methods
		Shape shape1 = shapeFactory.getShape("rectangle");
		Shape shape2 = shapeFactory.getShape("square");
		Shape shape3 = shapeFactory.getShape("circle");
		
		Color color1 = colorFactory.getColor("red");
		Color color2 = colorFactory.getColor("green");
		Color color3 = colorFactory.getColor("blue");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
		color1.fill();
		color2.fill();
		color3.fill();
	}
 }