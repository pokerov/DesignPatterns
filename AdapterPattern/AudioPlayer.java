public class AudioPlayer implements MediaPlayer {
	protected MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		// built-in support for mp3
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType); // Passing the audioType
			mediaAdapter.play(audioType, fileName); // Now mediaAdapter determines either is vlc or mp4 to be played
		}
		else {
			System.out.println("Invalid media. " + audioType + " is not supported."); // Handles any other cases
		}
	}
}