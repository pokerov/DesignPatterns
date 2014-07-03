public class FacadeDemo {

	// Use of simple methods to hide complexity of the code
	
	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}