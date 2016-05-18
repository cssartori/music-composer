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
    public static final String advancedInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      \r\t<u><b>Instru\u00e7\u00f5es do modo Avan\u00e7ado: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;O <i>Modo Avan\u00e7ado</i>, diferente do <i>Iniciante</i>, exige que se utilize uma forma de nota\u00e7\u00e3o espec\u00edfica para a forma\u00e7\u00e3o de uma m\u00fasica. \nEssa nota\u00e7\u00e3o \u00e9 a mesma utilizada na biblioteca de m\u00fasica <i><a href=\"www.jfugue.org/jfugue-chapter2.pdf\">JFugue (link com manual)</i></a>.<br></br>\n\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;A partir dela \u00e9 poss\u00edvel fazer uso de todas as notas b\u00e1sicas, com suas respectivas escalas sustenido e bemol. \u00c9 ainda poss\u00edvel definir as oitavas de cada nota,\nbem como mudan\u00e7as de instrumentos ao longo da m\u00fasica, notas tocadas em paralelo, mudar a velocidade \"dinamicamente\" entre outros tantos comandos. Por\u00e9m, para fazer uso de todos estes recursos\ndispon\u00edveis, \u00e9 preciso que se conhe\u00e7a a fundo a sintaxe e nota\u00e7\u00e3o da <i>JFugue</i>.\n\n\n</body></p>\n  </body>\r\n</html>\r\n";
    public static final String beginnerInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      \r\t<u><b>Instru\u00e7\u00f5es do modo Iniciante: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;O <i>Modo Iniciante</i> trata da escrita da m\u00fasica em formato de texto livre, sem estrutura\u00e7\u00e3o alguma, sem nota\u00e7\u00f5es espec\u00edficas ou regras estritas a serem seguidas. Qualquer texto inserido \nno campo de entrada ser\u00e1 mapeado para notas musicais de acordo com um mapeamento pr\u00e9-definido, e ent\u00e3o o resultado ser\u00e1 tocado ao usu\u00e1rio em forma de som, nota por nota.<br></br>\n\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;As possibilidades de notas e modifica\u00e7\u00f5es destas s\u00e3o um pouco limitadas. Ao todo, conta-se com 12 notas ( D\u00f3, D\u00f3#, R\u00e9, Mi, Mib, F\u00e1, F\u00e1#, Sol, Sol#, L\u00e1, Si, Sib). Al\u00e9m delas, \u00e9 poss\u00edvel fazer uso\nda nota\u00e7\u00e3o de oitavas (d\u00edgitos de 0 a 9) para delimitar a oitava de uma dada nota. Por fim, alguns caracteres s\u00e3o espec\u00edficos para determinar qual o per\u00edodo de toque de uma certa nota.\n<br></br><br></br> <ul><u> Mapeamento b\u00e1sico (n\u00e3o faz distin\u00e7\u00e3o entre maiusculas e minusculas):</u></ul>\n<ul>Oitavas: &nbsp;&nbsp;1, 2, 3, 4, 5, 6, 7, 8, 9, 0<br></br>\n        Dura\u00e7\u00f5es: &nbsp;&nbsp;W, H, Q, I, S, X, O<br></br>\n        Nota D\u00f3:&nbsp;&nbsp; C, V, \\, :<br></br>\n        Nota D\u00f3#: &nbsp;&nbsp;Y, ?, $, %, <, ><br></br>\n        Nota R\u00e9: &nbsp;&nbsp;D, J, (, )<br></br>\n        Nota Mi: &nbsp;&nbsp;E, R, _, ^<br></br>\n        Nota Mib: &nbsp;&nbsp;U, L, -<br></br>\n        Nota F\u00e1: &nbsp;&nbsp;F, Z, =, [, ]<br></br>\n        Nota F\u00e1#: &nbsp;&nbsp;K, !, ~, +, {, }<br></br>\n        Nota Sol: &nbsp;&nbsp;G, T, &, '<br></br>\n        Nota Sol#: &nbsp;&nbsp;N, M, /   <br></br>\n        Nota L\u00e1: &nbsp;&nbsp;A, @, #, \" <br></br>\n        Nota Si: &nbsp;&nbsp;P, , , ; <br></br>\n        Nota Sib: &nbsp;&nbsp;B, . , *, | <br></br>\n</ul>\n<p style=\"margin-top: 0\" align=\"justify\"><br></br>&nbsp;&nbsp;&nbsp;&nbsp;\u00c9 poss\u00edvel modificar este mapeamento b\u00e1sico, bastando abrir o arquivo texto <i>mapping.txt</i> , localizado na mesma pasta do programa e modificar diretamente\nali o que cada caractere do teclado deve representar como nota (note que a separa\u00e7\u00e3o entre cada caractere \u00e9 feito por um espa\u00e7o simples e n\u00e3o por v\u00edrgulas como aqui).\n\n</body></p>\n  </body>\r\n</html>\r\n";
    
}
