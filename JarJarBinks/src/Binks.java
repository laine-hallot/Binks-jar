import java.io.*;
import sun.audio.*;

public class Binks{
	static int length;
	static void playSound(String Meesa){
			try{
				InputStream in = new FileInputStream(Meesa);
	
			AudioStream audio = new AudioStream(in);
			AudioPlayer.player.start(audio);
			length = audio.getLength();//dosn't work. Might fix it some day
			//System.out.println(length);
			}catch(IOException c){
				System.out.println("Error");
			}
	}
}

