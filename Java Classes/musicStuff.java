package projekat;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class musicStuff {
	
/* 
The Clip interface represents a special kind of data line whose audiodata can be loaded prior to playback, instead of being streamed in real time. 

Because the data is pre-loaded and has a known length, you can set a clip to start playing at any position in its audio data. You can also create a loop,
so that when the clip is played it will cycle repeatedly. Loops are specified with a starting and ending sample frame, along with the number of times 
that the loop should be played. 
	 */
	Clip clip;
	 
	 // Calling a method that will take music location (This one is not used in the current Program. It was only made to show a different way instead 
	 // of using URL method.
	 
	 	void playMus (String musicLocation) {
		 try {
			// Calling File
			File musicPath = new File(musicLocation);
			
			if(musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
	 }
 }
	 	// Using an URL method instead.
	 	public void setURL(URL soundFileName) {
	
	 		try {
	 			AudioInputStream sound = AudioSystem.getAudioInputStream(soundFileName);
	 			clip = AudioSystem.getClip();
	 			clip.open(sound);
	 			clip.start();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	 // Method to play the audio files
	 public void play() {
	
	 	clip.setFramePosition(0);
	 	clip.start();
	 	clip.loop(clip.LOOP_CONTINUOUSLY);
	 }
}
