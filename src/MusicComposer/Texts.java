/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicComposer;

/**
 * Class that holds basic texts used by the program.
 * @author cssartori
 */
public class Texts {
    public static final String PLAY_BTN_TEXT = "Play Music";
    public static final String STOP_BTN_TEXT = "Stop Music";
    public static final String PLAY_BTN_TIP = "Plays the input music.";
    public static final String STOP_BTN_TIP = "Stops the music.";
    
    public static final String SPEED_TEXT = "Speed: ";
    public static final String SPEED_TIP = "How fast the music is played in Beats per Minute.";
    public static final String TEXT_AREA_TEXT = "Music as Text: ";
    public static final String TEXT_AREA_TIP = "Enter a music in text form.";
    
    public static final String MODE_TEXT = "Execution Mode: ";
    public static final String FILE_MENU_TEXT = "File";
    public static final String OPEN_FILE_TEXT = "Open File";
    public static final String OPEN_FILE_TIP = "Opens a text file (.txt)";
    public static final String SAVE_AS_MENU_TEXT = "Save as...";
    public static final String SAVE_TIP = "Saves the text in a text file (.txt)";
    public static final String EXIT_BTN_TEXT = "Exit";
    public static final String OPTIONS_MENU_TEXT = "Options";
    public static final String CREATE_MAPPING_FILE_TEXT = "Create Mapping-Key File";
    public static final String CLEAR_TEXT_AREA_TEXT = "Clear Text Box";
    public static final String COMMAND_MENU_TEXT = "Commands";
    public static final String INSTRUCTIONS_MENU_TEXT = "Instructions";
    public static final String EXAMPLES_MENU_TEXT = "Examples";
    
    public static final String BEETHOVEN_EXAMPLE_TEXT = "Beggining of \"Für Elise\" (Beethoven)";
    public static final String CHORD_EXAMPLE_TEXT = "Simple Chordes";
    public static final String CANON_EXAMPLE_TEXT = "Canon";
    
    public static final String ADVANCED_MODE_TEXT = "Advanced Mode";
    public static final String ADVANCED_MODE_TIP = "Requires a specific notation to play notes.";
    public static final String BEGGINERS_MODE_TEXT = "Begginer's Mode";
    public static final String BEGGINERS_MODE_TIP = "Allows free text, without any special notation.";
            
    public static final String INSTRUMENT_OPTIONS_TEXT = "Instrument: ";
    public static final String INSTRUMENT_OPTIONS_TIP = "Selects the instrument which will play the music.";
    public static final String[] INSTRUMENT_OPTIONS_LIST= { "Clarinet", "Flute", "Harmonica", "Piano", "Electronic Piano", "Trumpet", "Guitar", "Violin", "Cello" };
    
    /*String to be used on the Main Window*/
    public static final String MAINWINDOW_TITLE = "Music Composer";
    
    /*Strings containing the instructions about each mode (advanced and beginner) and about the "homepage" of instructions*/
    public static final String homeInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n"+
                                              "\r\t<u><b>Instructions: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n&nbsp;&nbsp;&nbsp;&nbsp;" +
                                              "The <i>Music Composer</i> allows music to be created using common keyboard characters to write and describe it. The program implements an GUI interface for the <i>JFugue</i> library, which is used as the basis for the entire application.\n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;"+
                                              "It has two modes, the <i>Beginner</i> and the <i>Advanced</i>, so that different types of user, with different levels of knowledge about music, can make use of the program the same way with a pleasant experience.\n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;"+
                                              "In both modes, it is possible to change the instrument, as well as the speed (given in <i>beats per minute</i> - BPM) with which the music will be played.<br></br><br></br>&nbsp;&nbsp;&nbsp;&nbsp; "+
                                              "For more information about the modes, press the corresponding button bellow.\n                     \n</body></p>\n  </body>\r\n</html>\r\n";
    public static final String advancedInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      "+
                                                  "\r\t<u><b>Advanced Mode Instructions: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;"+
                                                  "The <i>Advanced mode</i> is different from the <i>Beginners' mode</i> because it requires a specific notation in order to write musics. "+
                                                  "\nThis notation is exaclty the same one specified, and used, by the library <i><a href=\"http://www.jfugue.org/\">JFugue (official site)</i></a>.<br></br>\n\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;"+
                                                  "With this specification, one can make use of all musical notes in all scales and variations (sharp and flat). It is also possible to define the Octaves of each note, as well as changes of instrument during the music composition and music speed (on a \"dynamic\" style). It is also possible to insert notes that should be played in parallel.\n"+
                                                  "However, in order to use all this resources and options available, one has to know precisely the sintax and commands of <i>JFugue</i>.\n\n\n</body></p>\n  </body>\r\n</html>\r\n";
    public static final String beginnerInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      "+
                                                  "\r\t<u><b>Beginner's Mode Instructions: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;"+
                                                  "The <i>Beginner's mode</i> is about <i>free format text</i>, so that users can write any text and play a music with it (could be one's Final Project for the Software Engineering class, though it may not sound very good). In this mode, there are no rules, specifications to follow, and commands to memorize, all you have to do is type a text and press <i>Play Music</i>.<br></br>\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;"+
                                                  "Any text given as input will be mapped to a sequence of musical notes the program  can play. The mapping can be seen in the table below, but the user can edit it, just by opening the <i>mapping.txt</i> file.<br></br>\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;"+
                                                  "The mapping is fairly simple, so complex musics or orchestras will not be possible to write in this mode. The notes available are the 12 basic ones: A, B, Bb, C, C#, D, E, Eb, F, F#, G, G#. It is also possible to use octaves (digits from 0 to 9) to delimit the octave of a given note. However, some characters are special and used to delimit the period of time a given note will be played.\n<br></br><br></br>"+
                                                  "<ul><u> Basic Mapping (there is no distinction between lower or upercase letters):</u></ul>\n"+
                                                  "<ul>Octaves: &nbsp;&nbsp;1, 2, 3, 4, 5, 6, 7, 8, 9, 0<br></br>\n"+
                                                  "Durations: &nbsp;&nbsp;W, H, Q, I, S, X, O<br></br>\n"+
                                                  "Note C:&nbsp;&nbsp; C, V, \\, :<br></br>\n"+
                                                  "Note C#: &nbsp;&nbsp;Y, ?, $, %, <, ><br></br>\n"+
                                                  "Note D: &nbsp;&nbsp;D, J, (, )<br></br>\n"+
                                                  "Note E: &nbsp;&nbsp;E, R, _, ^<br></br>\n"+
                                                  "Note Eb: &nbsp;&nbsp;U, L, -<br></br>\n"+
                                                  "Note F: &nbsp;&nbsp;F, Z, =, [, ]<br></br>\n"+
                                                  "Note F#: &nbsp;&nbsp;K, !, ~, +, {, }<br></br>\n"+
                                                  "Note G: &nbsp;&nbsp;G, T, &, '<br></br>\n"+
                                                  "Note G#: &nbsp;&nbsp;N, M, /   <br></br>\n"+
                                                  "Note A: &nbsp;&nbsp;A, @, #, \" <br></br>\n"+
                                                  "Note B: &nbsp;&nbsp;P, , , ; <br></br>\n"+
                                                  "Note Bb: &nbsp;&nbsp;B, . , *, | <br></br>\n</ul>\n<p style=\"margin-top: 0\" align=\"justify\"><br></br>&nbsp;&nbsp;&nbsp;&nbsp;"+
                                                  "It is possible to change this basic mapping. All it is necessary is to open the text file <i>mapping.txt</i> , which should be in the same folder of this program (otherwise it is possible to recreate it in the main menu). Check the struct carefully, and after that change the notes each character maps to (note that characters are separated by a single white space and not commas, as it is here).\n\n</body></p>\n  </body>\r\n</html>\r\n";
    
}
