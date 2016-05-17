package MusicComposer;

import org.jfugue.Player;
import org.jfugue.JFugueException;

/**
 * Class that represents a music inside the program.
 * @author cssartori
 */
public class Music{
    
    /*String to hold the sequence of music notes to be played*/
    private static String melody;
    private final Player musicPlayer = new Player();
    private int instrument;
    private int speed;
  
    Music(String melody) {
        this.instrument = Constants.DEFAULT_INSTRUMENT_INDEX;
        this.speed = Constants.MUSIC_DEFAULT_SPEED;
        this.melody = melody;
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
        melody = InputParser.parse(melody);
    }

    public void play() throws JFugueException {
        /*It is necessary to add "V[0]" to the beginning of the music*/
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
        /*To identify the instrument, it is necessary to add "I" and the instrument index at the beggining*/
        String instStr = "I" + instrument + MusicalNotes.PAUSE_NOTE;
        melody = instStr.concat(melody);
    }

    public void setMelodySpeed(){
         /*To identify the speed, it is necessary to add "T" and the speed at the beggining*/
        String spdStr = "T" + speed + MusicalNotes.PAUSE_NOTE;
        melody = spdStr.concat(melody);
    }

}
