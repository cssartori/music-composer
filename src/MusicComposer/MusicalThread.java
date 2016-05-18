package MusicComposer;
import java.awt.Component;
import org.jfugue.JFugueException;

/**
 * Class that holds the thread to play a music.
 * This way, the MainWindow is allowed to continue working while the music plays in "background".
 * @author cssartori
 */
public class MusicalThread extends Thread{
    /*The music object reference*/
    private Music music;
    /*The reference to the button responsible for the "play" action*/
    private Component playButton;
    /*Reference to the parent window of this thread (in this particular case, it is the MainWindow)*/
    private Component parent;
    
    public MusicalThread(Music music, Component playButton, Component parent){
        this.music=music;
        this.playButton=playButton;
        this.parent=parent;
    }

    @Override
    public void run(){
        playButton.setEnabled(false);        
        try{
          music.play();
        }catch(Exception e){
            if(!e.getMessage().equals(JFugueException.ERROR_SLEEP))
                InfoMessages.inputErrorMsg(parent);
            music.pause();
            playButton.setEnabled(true);    
        }
        playButton.setEnabled(true);
    }


}
