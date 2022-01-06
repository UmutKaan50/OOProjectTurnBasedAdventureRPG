package gazi.university;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music_Adder {

    String pn1 = "C:\\Users\\nothi\\Desktop\\Music\\";
    String pn2 = "C:\\Users\\umuta\\Downloads\\";

    File file;
    AudioInputStream audioStream;
    Clip clip;

    public Music_Adder(String name) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        this.file = new File(pn2 + name);
        this.audioStream =  AudioSystem.getAudioInputStream(file);
        this.clip = AudioSystem.getClip();
        clip.open(audioStream);
    }

    public void Start_Music(){
        clip.start();
    }

    public void Stop_Music(){
        clip.stop();
    }

}

