import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class SoundPlay {
    // https://studio.youtube.com/channel/UCd-_6lm8teW0grk9_psmrDw/music for mp3
    // https://online-audio-converter.com/tw/ mp3 to wav
    public static void main(String[] args)
            throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("Sound.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);


        String response = "";
        while (!response.equals("Q")) {
            System.out.println("P=Play,S=Stop,R=Reset,Q=Quit");
            System.out.println("enter the code");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.close();
                    break;
                default:
                    System.out.println("not order");
            }

        }
        System.out.println("88");
    }
}
