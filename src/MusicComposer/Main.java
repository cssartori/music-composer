/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicComposer;

import javax.swing.JOptionPane;
import javax.sound.midi.*;

/**
 * Main method to initiate the program.
 * @author cssartori
 */
public class Main {

    public static void main(String[] args) {

        /*First, check if there is any sound driver installed on the system*/
        try {
            MidiSystem.getSequencer();
        } catch (Exception e) {
            /*If there is no driver, warn the user of the problem with a error message*/
            InfoMessages.noMidiDriverErrorMsg(null);
        }

         /*Checks if the mapping-keys file exists and if it is possible to read from it the character for each note*/
        if (!MusicalNotes.setMappingFromFile()) {
            /*If the mapping file does not exist, ask if the user wants to create the file*/
            int returnOption = InfoMessages.fileDoesntExistErrorMsg(null, MusicalNotes.MAPPING_FILE_NAME);
            if ((returnOption == JOptionPane.NO_OPTION)
                    || (returnOption == JOptionPane.CLOSED_OPTION)) {
                /*if the option is no, or if the user closed the dialog, end the program (there must be a mapping file)*/
                System.exit(0);
            } else {
                /*If the answer is yes, creates the mapping file and reads the notes from it*/
                MusicalNotes.createMapFile();
                MusicalNotes.setMappingFromFile();
            }
        }

        /*Initializes the in-memory map, adding notes to it*/
        MusicalMap.initializeMap();
        MusicalMap.addNotesToMap();

        /*Creates program's main window and shows it to the user*/
        MainWindow m = new MainWindow();
        m.setName(MainWindow.MAINWINDOW_TITLE);
        m.setTitle(MainWindow.MAINWINDOW_TITLE);
        m.setVisible(true);

    }
}
