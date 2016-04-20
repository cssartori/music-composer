
package MusicComposer;
import java.awt.Component;
import org.jfugue.JFugueException;


public class MusicalThread extends Thread{
    private Music music;
    private Component button;
    private Component parent;
    
   
    public MusicalThread(Music tmusic, Component btn, Component prnt){
        music=tmusic;
        button=btn;
        parent=prnt;
    }

    @Override
    public void run(){

        button.setEnabled(false);
        
        try{
          music.play();
        }
        catch(Exception e){
            if(e.getMessage() != JFugueException.ERROR_SLEEP)
                InfoMessages.inputErrorMsg(parent);
            System.out.println("Erro na música!!\n"+e);
            music.pause();
            button.setEnabled(true);    
        }
        button.setEnabled(true);
    }


}
