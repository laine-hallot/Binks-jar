import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/**
 * Created by meyerhallot on 6/2/17.
 */
public class BinksUtils {

    void playSound(String Meesa){
        InputStream in = null;
        AudioStream audio = null;
        try{
            in = new FileInputStream(Meesa);
            audio = new AudioStream(in);
        }catch(IOException c) {
            System.out.println("Error");
        }
        AudioPlayer.player.start(audio);
        System.out.println("Sound Played");
    }
    public int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
