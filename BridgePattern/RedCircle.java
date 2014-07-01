public class RedCircle implements DrawAPI {

	// Concrete implementation of DrawAPI
	
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing circle: [" + radius + "/" + x + ":" + y + "] in RED.");
	}
}