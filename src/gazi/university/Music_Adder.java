package gazi.university;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music_Adder {

    String pn1 = "C:\\Users\\nothi\\Desktop\\Music\\";
    String pn2 = "C:\\Users\\umuta\\Downloads\\";

    public Music_Adder(String name) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File(pn2 + name);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();

    }

}

