public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "over horizon.mp3");
		audioPlayer.play("mp4", "mtv_jamz.mp4");
		audioPlayer.play("vlc", "far far away.avi");
		audioPlayer.play("mpg", "bone stock.mpg");
	}
}