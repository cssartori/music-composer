package MusicComposer;

import org.jfugue.Player;
import org.jfugue.JFugueException;

public class Music{

    private static String melody;
    public static final int MAX_SPEED = 220;
    public static final int MIN_SPEED = 40;
    public static final int DEFAULT_SPEED = 120;
    private final Player musicPlayer = new Player();
    private int instrument;
    private int speed;

    Music() {

        instrument = 0;
        speed = 120;
        melody = new String();
    }

    public void setMelody(String input) {
        melody = input;
    }

    public String getMelody() {
        return melody;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setInstrument(int indexOfInstrument) {
        instrument = indexOfInstrument;
    }

    public int getInstrument() {
        return instrument;
    }

    public void parse(){
        melody = InputParser.Parse(melody);
    }

    public void play() throws JFugueException {
        setMelody("V[0] "+getMelody());
        try {
           musicPlayer.play(melody);
        } catch (JFugueException e) {
            throw e;
        }
    }

    public void pause() {
        musicPlayer.pause();
    }

    public void setMelodyInstrument(){
        String instStr = "I" + instrument + MusicalNotes.PAUSE_NOTE;
        melody = instStr.concat(melody);
    }

    public void setMelodySpeed(){
        String spdStr = "T" + speed + MusicalNotes.PAUSE_NOTE;
        melody = spdStr.concat(melody);
    }

}
