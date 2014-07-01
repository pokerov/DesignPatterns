public class Mp4Player implements AdvancedMediaPlayer {
	
	// A concrete implementation of AdvancedMediaPlayer interface

	@Override
	public void playVlc(String fileName) {
		// do nothing
	}
	
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}