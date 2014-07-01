public class VlcPlayer implements AdvancedMediaPlayer {

	// A concrete implementation of AdvancedMediaPlayer interface

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}
	
	@Override
	public void playMp4(String fileName) {
		// do nothing
	}
}