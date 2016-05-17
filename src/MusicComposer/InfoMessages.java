/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MusicComposer;
import javax.swing.*;
import java.awt.Component;

/**
 * Class that holds basic information messages.
 * @author cssartori
 */
public class InfoMessages {
    
    /* ERRORS' TITLES*/
    private final static String FILE_TITLE = "File!";
    private final static String NO_INPUT_ERROR_TITLE = "No Input!";
    private final static String FILE_ERROR_TITLE = "File Error!";
    private final static String MIDI_ERROR_TITLE = "Sound Driver Error!";
    private final static String DESKTOP_ERROR_TITLE = "System Error!";
    private final static String INPUT_ERROR_TITLE = "Input Error!";
    private final static String UNKNOWN_ERROR_TITLE = "Unknown Error!";

    /* ERRORS' MESSAGES */
    private final static String OPENING_ERROR_MSG = "An error is preventing the selected file to be opened. \n"+
                                                    "Nothing was done.\n"+
                                                    "Please, try again.";                                                   
    private final static String SAVING_SUCCESS_MSG = "<html>The file &nbsp;<i>FILENAME</i>&nbsp; was saved successfuly!";
    private final static String FILE_CREATION_ERROR_MSG = "<html> Error creating file: &nbsp; &nbsp; <i>FILENAME</i> \n"+
                                                          "Nothing was done.\n"+
                                                          "Please, check if there is no other file with the same name in the folder.";
    private final static String NO_INPUT_ERROR_MSG = "No input given.\n"+
                                                     "Please, write an input in the text box and then press 'Play Music'.";
    private final static String FILE_DOESNT_EXISTS_ERROR_MSG = "<html> The following file does not exist: &nbsp; &nbsp; <i>FILENAME</i>\n"+
                                                               "Create new file?";
    private final static String FILE_READING_ERROR_MSG = "<html>An error occurred when reading the file: &nbsp; &nbsp;<i>FILENAME</i>\n"+
                                                         "The operation was aborted and nothing done.";
    private final static String FILE_WRITTING_ERROR_MSG = "An error occurred when writing to file.\n"+
                                                          "The operation was aborted and nothing done.";
    private final static String NO_MIDI_DRIVER_ERROR_MSG = "There is no sound driver installed on the system.\n"+
                                                           "Check installation and correct behaviour of sound driver.";
    private final static String INCORRECT_INPUT_MUSIC_ERROR_MSG = "The input text contains errors.\n"+
                                                                  "Please, look for the errors and try again.";
    private final static String DESKTOP_NOT_SUPPORTED_ERROR_MSG = "<html> The <i>Desktop</i> command required is not supported. \n"+
                                                                  "Check the system and your <i>web browser</i>.";
    private final static String NO_URL_ERROR_MSG = "<html>No <i>link</i> was found. Check the support to URL's.";
    private final static String NO_BROWSER_SUPPORT_ERROR_MSG = "<html> The computer's default <i>web browser</i> can't open the selected URL";
    private final static String INPUT_ERROR_MSG = "The input text contains an error. Check syntax and try again.";
    private final static String UNKNOWN_ERROR_MSG = "An unknown error has occurred and the program can't handle it.\n"+
                                                    "Nothing was done.\n"+
                                                    "Please, try again. If the error persists, try closing and opening the program.";
    
    
    
    /*String used as "placeholder" for the filename that should be inserted. It is used for replacing this string with the correct file name*/
    private final static String FILENAME_REPLACER = "FILENAME";
    
    /*The methods below make the pop-up of a specific message with its specific text and title*/
    public static void fileOpeningErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent); 
        JOptionPane.showMessageDialog(parent, OPENING_ERROR_MSG, FILE_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }
    
    public static void fileSavingSuccessMsg(Component parent, String fileName){
       InfoMessages.setParentDisabled(parent); 
        JOptionPane.showMessageDialog(parent, SAVING_SUCCESS_MSG.replaceAll(FILENAME_REPLACER, fileName), FILE_TITLE, JOptionPane.INFORMATION_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }
    
    public static void fileCreationErrorMsg(Component parent, String fileName){
        InfoMessages.setParentDisabled(parent); 
        JOptionPane.showMessageDialog(parent, FILE_CREATION_ERROR_MSG.replaceAll(FILENAME_REPLACER, fileName), FILE_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }
    
    public static void noInputErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent); 
        JOptionPane.showMessageDialog(parent, NO_INPUT_ERROR_MSG, NO_INPUT_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }
    
    public static int fileDoesntExistErrorMsg(Component parent, String fileName){
        InfoMessages.setParentDisabled(parent); 
        int returnOption =  JOptionPane.showConfirmDialog(parent, FILE_DOESNT_EXISTS_ERROR_MSG.replaceAll(FILENAME_REPLACER, fileName), FILE_ERROR_TITLE, JOptionPane.YES_NO_OPTION);
        InfoMessages.setParentEnabled(parent);   
        return returnOption;
    }
    
    public static void fileReadingErrorMsg(Component parent, String fileName){
        InfoMessages.setParentDisabled(parent); 
        JOptionPane.showMessageDialog(parent, FILE_READING_ERROR_MSG.replaceAll(FILENAME_REPLACER, fileName), FILE_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }

    public static void fileWrittingErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent); 
        JOptionPane.showMessageDialog(parent, FILE_WRITTING_ERROR_MSG, FILE_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }
    
    public static void noMidiDriverErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent);  
        JOptionPane.showMessageDialog(parent, NO_MIDI_DRIVER_ERROR_MSG, MIDI_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }

    public static void incorretInputMusicErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent);
        JOptionPane.showMessageDialog(parent, INCORRECT_INPUT_MUSIC_ERROR_MSG, MIDI_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }

    public static void desktopNotSupportedErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent);
        JOptionPane.showMessageDialog(parent, DESKTOP_NOT_SUPPORTED_ERROR_MSG, DESKTOP_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }

    public static void noUrlErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent);
        JOptionPane.showMessageDialog(parent, NO_URL_ERROR_MSG, DESKTOP_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }

    public static void noBrowserErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent);
        JOptionPane.showMessageDialog(parent, NO_BROWSER_SUPPORT_ERROR_MSG, DESKTOP_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }

    public static void unknownErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent);
        JOptionPane.showMessageDialog(parent, UNKNOWN_ERROR_MSG, UNKNOWN_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }
    
    public static void inputErrorMsg(Component parent){
        InfoMessages.setParentDisabled(parent);
        JOptionPane.showMessageDialog(parent, INPUT_ERROR_MSG, INPUT_ERROR_TITLE, JOptionPane.ERROR_MESSAGE );
        InfoMessages.setParentEnabled(parent);
    }
    
    /*Private method to prevent the main window of being used while an information message is shown*/
    private static void setParentDisabled(Component parent){
        if(parent!=null)
            parent.setEnabled(false);
    }
    
    private static void setParentEnabled(Component parent){
        if(parent!=null){
            parent.setEnabled(true);
            parent.requestFocus();
        }
            
    }
    
}
