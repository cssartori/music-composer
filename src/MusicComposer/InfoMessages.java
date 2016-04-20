/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MusicComposer;
import javax.swing.*;
import java.awt.Component;

/**
 *
 * @author cssartori
 */
public class InfoMessages {
    
    /*
     *              TÍTULOS DOS ERROS:
     */
    private final static String FILE_TITLE = "Arquivo!";
    private final static String NO_INPUT_ERROR_TITLE = "Sem Entrada!";
    private final static String FILE_ERROR_TITLE = "Erro com arquivo!";
    private final static String MIDI_ERROR_TITLE = "Erro no driver!";
    private final static String DESKTOP_ERROR_TITLE = "Erro com sistema!";
    private final static String INPUT_ERROR_TITLE = "Erro na Entrada!";
    private final static String UNKNOWN_ERROR_TITLE = "Erro desconhecido!";

    /*
     *              MENSAGENS DE ERROS:
     */
    private final static String OPENING_ERROR_MSG = "Ocorreu um erro ao abrir o arquivo selecionado. Nada foi feito.\nPor favor, tente novamente.";
    private final static String SAVING_SUCCESS_MSG = "<html>O arquivo &nbsp;<i>FILENAME</i>&nbsp; foi salvo com sucesso!";
    private final static String FILE_CREATION_ERROR_MSG = "<html> Erro na criação do arquivo: &nbsp; &nbsp; <i>FILENAME</i> \nNada foi feito.\n\nVerifique se não existe nenhum arquivo de mesmo nome na pasta.";
    private final static String NO_INPUT_ERROR_MSG = "Nenhuma entrada foi fornecida.\nPor favor, insira uma entrada no campo de texto e então pressione 'Tocar Músca'.";
    private final static String FILE_DOESNT_EXISTS_ERROR_MSG = "<html> O seguinte Arquivo não existe: &nbsp; &nbsp; <i>FILENAME</i>\n\nCriar o Arquivo?";
    private final static String FILE_READING_ERROR_MSG = "<html>Ocorreu um erro durante a leitura no arquivo: &nbsp; &nbsp;<i>FILENAME</i>\nA operação foi abortada e nada foi feito.\n";
    private final static String FILE_WRITTING_ERROR_MSG = "Ocorreu um erro durante a escrita em arquivo.\nA operação foi abortada e nada foi feito.\n";
    private final static String NO_MIDI_DRIVER_ERROR_MSG = "Não há nenhum driver de som instalado no sistema.\n\nVerifique a instalação e funcionamento dos drivers do computador.\n";
    private final static String INCORRECT_INPUT_MUSIC_ERROR_MSG = "O texto de entrada fornecido contém erros.\n Por favor, verifique novamente a entrada e tente novamente.";
    private final static String DESKTOP_NOT_SUPPORTED_ERROR_MSG = "<html> O comando de <i>Desktop</i> exigido não é suportado. \nVerifique o sistema e o seu <i>browser</i>.";
    private final static String NO_URL_ERROR_MSG = "<html>Nenhum <i>link</i> foi encontrado. Verifique o suporte a URL's.";
    private final static String NO_BROWSER_SUPPORT_ERROR_MSG = "<html> O <i>browser</i> padrão do computador não oferece suporte para a ação de abrir a URL solicitada.";
    private final static String INPUT_ERROR_MSG = "A entrada contém um erro. Verifique a sintaxe e tente novamente.\n";
    private final static String UNKNOWN_ERROR_MSG = "Um erro desconhecido ocorreu e o programa não pode tratá-lo.\nNada foi feito.\nPor favor, tente novamente. Se o problema persistir, tente fechar e abrir o programa novamente.";

    /*String usada para substituir FILENAME pelo respectivo nome de arquivo que se quer usar nas mensagens de erro*/
    private final static String FILENAME_REPLACER = "FILENAME";
    
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
    
    /*
     * Funções internas para impedir que se use a janela principal enquanto uma janela de erro está sendo exibida
     */
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
