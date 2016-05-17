package MusicComposer;
import java.awt.Component;
import org.jfugue.JFugueException;

/**
 * Class that holds the thread to play a music.
 * This way, the MainWindow is allowed to continue working while the music plays in "background".
 * @author cssartori
 */
public class MusicalThread extends Thread{
    private Music music;
    private Component button;
    private Component parent;
    
    public MusicalThread(Music music, Component button, Component parent){
        this.music=music;
        this.button=button;
        this.parent=parent;
    }

    @Override
    public void run(){

        button.setEnabled(false);
        
        try{
          music.play();
        }catch(Exception e){
            if(!e.getMessage().equals(JFugueException.ERROR_SLEEP))
                InfoMessages.inputErrorMsg(parent);
            music.pause();
            button.setEnabled(true);    
        }
        button.setEnabled(true);
    }


}
