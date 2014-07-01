public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer; // Initially is null, since it's an object

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer(); // Concrete representation of the interface
		}
		else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player(); // Concrete representation of the interface
		}
	}
	
	// Since advancedMediaPlayer is either of type VlcPlayer or Mp4Player it behaves differently

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName); // Concrete representation of the play() method
		}
		else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName); // Concrete representation of the play() method
		}
	}
}