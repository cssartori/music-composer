/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicComposer;

import javax.swing.JOptionPane;
import javax.sound.midi.*;

/**
 *
 * @author Hyago
 */
public class Main {

    public static void main(String[] args) {

        /*
         * Inicialmente verifica se há algum driver de som instalado no sistema
         */
        try {
            MidiSystem.getSequencer();
        } catch (Exception e) {
            /*Se não houver nenhum driver instalado, exibe uma mensagem informando ao usuário*/
            InfoMessages.noMidiDriverErrorMsg(null);
        }

         /*
         * Verifica se o arquivo de mapeamento existe e se é possível ler dele
         * o mapa de caracteres para cada nota
         */
        if (!MusicalNotes.setMappingFromFile()) {
            /*Se não existir, informa ao usuário e pergunta se ele deseja criar o arquivo*/
            int returnOption = InfoMessages.fileDoesntExistErrorMsg(null, MusicalNotes.MAPPING_FILE_NAME);
            if ((returnOption == JOptionPane.NO_OPTION)
                    || (returnOption == JOptionPane.CLOSED_OPTION)) {
                /*Se a opção escolhida for 'não' ou 'fechar', encerra o programa*/
                System.exit(0);
            } else {
                /*Caso contrário, cria o arquivo no computador e seta o mapeamento corretamente*/
                MusicalNotes.createMapFile();
                MusicalNotes.setMappingFromFile();
            }
        }

        /*Inicializa e cria o mapa de notas*/
        MusicalMap.initializeMap();
        MusicalMap.AddNotesToMap();

        /*Cria a janela principal do programa*/
        MainWindow m = new MainWindow();
        m.setName(MainWindow.MAINWINDOW_TITLE);
        m.setTitle(MainWindow.MAINWINDOW_TITLE);
        m.setVisible(true);

    }
}
