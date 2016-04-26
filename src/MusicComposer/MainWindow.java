/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicComposer;

/**
 * MainWindow of the program
 * @author cssartori
 */
import javax.sound.midi.MidiSystem;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import org.jfugue.Instrument;
import javax.sound.midi.*;

public class MainWindow extends javax.swing.JFrame {
    /*File opened at the moment*/
    private TextFile currentFile = new TextFile(null);
    /*Thread to play the music letting the main window free to be used (specifically, the pause button)*/
    private MusicalThread mThread;
    
    /*Strings to be used on the Main Window*/
    public static final String MAINWINDOW_TITLE = "Music Composer";
    private final String EMPTY_STRING = "";

    /*Constructor*/
    public MainWindow() {
        /*Initializes basic components*/
        initComponents();
        initComponentsText();
        
        /*Make flat buttons*/
        saveBtn.setContentAreaFilled(false);
        openBtn.setContentAreaFilled(false);

        /*Adds the radio buttons to control the mode inside a exclusive option group*/
        modeGroup.add(advancedModeRBtn);
        modeGroup.add(beginnerModeRBtn);

        /*Sets the Begginer's radio button as selected*/
        beginnerModeRBtn.setSelected(true);
        /*Sets the speed field*/
        speedTextField.setText(EMPTY_STRING + speedScroll.getValue());
        setFileNameLabel();
    }
    
    private void initComponentsText(){
        advancedModeRBtn.setText(Texts.ADVANCED_MODE_TEXT);
        advancedModeRBtn.setToolTipText(Texts.ADVANCED_MODE_TIP);
        
        beginnerModeRBtn.setText(Texts.BEGGINERS_MODE_TEXT);
        beginnerModeRBtn.setToolTipText(Texts.BEGGINERS_MODE_TIP);
        
        saveBtn.setToolTipText(Texts.SAVE_TIP);
        openBtn.setToolTipText(Texts.OPEN_FILE_TIP);
        
        modeLabel.setText(Texts.MODE_TEXT);

        instrumentCombo.setMaximumRowCount(9);
        instrumentCombo.setModel(new javax.swing.DefaultComboBoxModel(Texts.INSTRUMENT_OPTIONS_LIST));
        instrumentCombo.setSelectedIndex(3);
        instrumentCombo.setToolTipText(Texts.INSTRUMENT_OPTIONS_TIP);
        instrumentLabel.setLabelFor(instrumentCombo);
        instrumentLabel.setText(Texts.INSTRUMENT_OPTIONS_TEXT);
        instrumentLabel.setToolTipText(Texts.INSTRUMENT_OPTIONS_TIP);
        
        playBtn.setText(Texts.PLAY_BTN_TEXT);
        playBtn.setToolTipText(Texts.PLAY_BTN_TIP);
        
        speedScroll.setToolTipText(Texts.SPEED_TIP);
        speedTextField.setToolTipText(Texts.SPEED_TIP);
        speedMusicLabel.setText(Texts.SPEED_TEXT);
        speedMusicLabel.setToolTipText(Texts.SPEED_TIP);

        bpmLabel.setToolTipText(Texts.SPEED_TIP);

        stopBtn.setText(Texts.STOP_BTN_TEXT);
        stopBtn.setToolTipText(Texts.STOP_BTN_TIP);
        
        fileMenu.setText(Texts.FILE_MENU_TEXT);

        openMenuBtn.setText(Texts.OPEN_FILE_TEXT);
        
        saveMenuBtn.setText(Texts.SAVE_AS_MENU_TEXT);

        exitMenuBtn.setText(Texts.EXIT_BTN_TEXT);
        
        optionsMenu.setText(Texts.OPEN_FILE_TEXT);

        createMappingFileBtn.setText(Texts.CREATE_MAPPING_FILE_TEXT);

        clearTextAreaMenuBtn.setText(Texts.CLEAR_TEXT_AREA_TEXT);
        
        commandMenu.setText(Texts.COMMAND_MENU_TEXT);

        instructionsMenuBtn.setText(Texts.INSTRUCTIONS_MENU_TEXT);
        
        examplesMenu.setText(Texts.EXAMPLES_MENU_TEXT);
        beethovenExampleMenuBtn.setText(Texts.BEETHOVEN_EXAMPLE_TEXT);
        chordsExampleMenuBtn.setText(Texts.CHORD_EXAMPLE_TEXT);
        canonExampleMenuBtn.setText(Texts.CANON_EXAMPLE_TEXT);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modeGroup = new javax.swing.ButtonGroup();
        advancedModeRBtn = new javax.swing.JRadioButton();
        beginnerModeRBtn = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        saveBtn = new javax.swing.JButton();
        openBtn = new javax.swing.JButton();
        modeLabel = new javax.swing.JLabel();
        instrumentCombo = new javax.swing.JComboBox();
        instrumentLabel = new javax.swing.JLabel();
        playBtn = new javax.swing.JButton();
        textAreaLabel = new javax.swing.JLabel();
        speedScroll = new javax.swing.JSlider();
        speedTextField = new javax.swing.JTextField();
        speedMusicLabel = new javax.swing.JLabel();
        bpmLabel = new javax.swing.JLabel();
        stopBtn = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuBtn = new javax.swing.JMenuItem();
        saveMenuBtn = new javax.swing.JMenuItem();
        exitMenuBtn = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        createMappingFileBtn = new javax.swing.JMenuItem();
        clearTextAreaMenuBtn = new javax.swing.JMenuItem();
        commandMenu = new javax.swing.JMenu();
        instructionsMenuBtn = new javax.swing.JMenuItem();
        examplesMenu = new javax.swing.JMenu();
        beethovenExampleMenuBtn = new javax.swing.JMenuItem();
        chordsExampleMenuBtn = new javax.swing.JMenuItem();
        canonExampleMenuBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setName("MainFrame"); // NOI18N
        setResizable(false);

        advancedModeRBtn.setText("Advanced Mode");
        advancedModeRBtn.setToolTipText("Exige uma notação específica para tocar as músicas");
        advancedModeRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedModeRBtnActionPerformed(evt);
            }
        });

        beginnerModeRBtn.setText("Begginer's Mode");
        beginnerModeRBtn.setToolTipText("Permite texto livre, sem formatação especial.");
        beginnerModeRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginnerModeRBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_2.png"))); // NOI18N
        saveBtn.setToolTipText("Salva o texto em um arquivo texto (.txt)");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saveBtn.setFocusPainted(false);
        saveBtn.setOpaque(false);
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        openBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open_2.png"))); // NOI18N
        openBtn.setToolTipText("Abre um arquivo texto (.txt)");
        openBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openBtnMouseClicked(evt);
            }
        });

        modeLabel.setText("Execution Mode:");

        instrumentCombo.setMaximumRowCount(9);
        instrumentCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clarinete", "Flauta", "Gaita de Boca", "Piano", "Piano Eletrônico", "Trompete", "Violão", "Violino", "Violoncelo" }));
        instrumentCombo.setSelectedIndex(3);
        instrumentCombo.setToolTipText("Seleciona o instrumento que tocará a música de entrada.");

        instrumentLabel.setLabelFor(instrumentCombo);
        instrumentLabel.setText("Instruments:");
        instrumentLabel.setToolTipText("Seleciona o instrumento que tocará a música de entrada.");

        playBtn.setText("Play Music");
        playBtn.setToolTipText("Toca a música de entrada.");
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });

        textAreaLabel.setText("Music as Text:");
        textAreaLabel.setToolTipText("Entrada de música em forma de texto");

        speedScroll.setMaximum(220);
        speedScroll.setMinimum(40);
        speedScroll.setToolTipText("Indica quão rápido a música será tocada em Beats per Minute");
        speedScroll.setValue(120);
        speedScroll.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                speedScrollStateChanged(evt);
            }
        });

        speedTextField.setText("220");
        speedTextField.setToolTipText("Indica quão rápido a música será tocada em Beats per Minute");
        speedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                speedTextFieldFocusLost(evt);
            }
        });

        speedMusicLabel.setText("Speed:");
        speedMusicLabel.setToolTipText("Indica quão rápido a música será tocada em Beats per Minute");

        bpmLabel.setText("BPM");
        bpmLabel.setToolTipText("Indica quão rápido a música será tocada em Beats per Minute");

        stopBtn.setText("Stop Music");
        stopBtn.setToolTipText("Pausa a música de entrada.");
        stopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stopBtnMousePressed(evt);
            }
        });

        fileMenu.setText("File");

        openMenuBtn.setText("Open File");
        openMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openMenuBtnMousePressed(evt);
            }
        });
        fileMenu.add(openMenuBtn);

        saveMenuBtn.setText("Save as...");
        saveMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveMenuBtnMousePressed(evt);
            }
        });
        fileMenu.add(saveMenuBtn);

        exitMenuBtn.setText("Exit");
        exitMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMenuBtnMousePressed(evt);
            }
        });
        fileMenu.add(exitMenuBtn);

        jMenuBar1.add(fileMenu);

        optionsMenu.setText("Options");

        createMappingFileBtn.setText("Create Mapping-Key File");
        createMappingFileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createMappingFileBtnMousePressed(evt);
            }
        });
        optionsMenu.add(createMappingFileBtn);

        clearTextAreaMenuBtn.setText("Clear Text Box");
        clearTextAreaMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearTextAreaMenuBtnMousePressed(evt);
            }
        });
        optionsMenu.add(clearTextAreaMenuBtn);

        jMenuBar1.add(optionsMenu);

        commandMenu.setText("Commands");

        instructionsMenuBtn.setText("Instructions");
        instructionsMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                instructionsMenuBtnMousePressed(evt);
            }
        });
        commandMenu.add(instructionsMenuBtn);

        examplesMenu.setText("Examples");

        beethovenExampleMenuBtn.setText("Beggining of \"Für Elise\" (Beethoven)");
        beethovenExampleMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                beethovenExampleMenuBtnMousePressed(evt);
            }
        });
        examplesMenu.add(beethovenExampleMenuBtn);

        chordsExampleMenuBtn.setText("Simple Chordes");
        chordsExampleMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chordsExampleMenuBtnMousePressed(evt);
            }
        });
        examplesMenu.add(chordsExampleMenuBtn);

        canonExampleMenuBtn.setText("Canon");
        canonExampleMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canonExampleMenuBtnMousePressed(evt);
            }
        });
        examplesMenu.add(canonExampleMenuBtn);

        commandMenu.add(examplesMenu);

        jMenuBar1.add(commandMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instrumentLabel)
                            .addComponent(instrumentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(speedMusicLabel)
                                .addGap(4, 4, 4)
                                .addComponent(speedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(bpmLabel)))
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modeLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(advancedModeRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beginnerModeRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(stopBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textAreaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fileNameLabel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAreaLabel)
                    .addComponent(fileNameLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveBtn)
                            .addComponent(openBtn))
                        .addGap(74, 74, 74)
                        .addComponent(modeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(advancedModeRBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beginnerModeRBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instrumentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instrumentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedMusicLabel)
                            .addComponent(speedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bpmLabel))
                        .addGap(6, 6, 6)
                        .addComponent(speedScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("MainFrame");

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    /*Saves the input text as text*/
    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        JFileChooser saveFileDialog = new JFileChooser();
        String textToWrite = textArea.getText();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (*.txt)", "txt", "text");
        saveFileDialog.setFileFilter(filter);

        if (!(currentFile.isOpened())) {
            /*If there is no file currently selected, ask the user to select one*/
            int openingReturn = saveFileDialog.showSaveDialog(this);
            /*Checks user response*/
            if (openingReturn == JFileChooser.APPROVE_OPTION) {
                /*If the file opened with success, write in it*/
                currentFile = new TextFile(saveFileDialog.getSelectedFile());
                currentFile.setTextExtension();
            } else if (openingReturn == JFileChooser.CANCEL_OPTION) {
                /*If the user canceled the file selection, just return*/
                return;
            } else {
                /*Any other case is considered an error in the opening of the file*/
                InfoMessages.fileOpeningErrorMsg(this);
                return;
            }
        }

        /*Here it is guaranteed that the file is opened*/
        try {
            /*try to write in the file*/
            currentFile.WriteFile(textToWrite);
        } catch (Exception e) {
            /*In case any error occurred during writing, notify the user*/
            InfoMessages.fileWrittingErrorMsg(this);
            /*and close the current file*/
            currentFile.CloseFile();
            return;
        }
        /*If the program reached this line, everything went fine and we can notify the success writing the file*/
        InfoMessages.fileSavingSuccessMsg(this, currentFile.getFileName());
        setFileNameLabel();
    }//GEN-LAST:event_saveBtnMouseClicked
    
    /*Opens a text file*/
    private void openBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseClicked
        /*Chooser to select a file*/
        JFileChooser openFileDialog = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File (*.txt)", "txt", "text");

        openFileDialog.setFileFilter(filter);
        /*Ask the user to select a file to open*/
        int openingReturn = openFileDialog.showOpenDialog(this);

        if (openingReturn == JFileChooser.APPROVE_OPTION) {
            /*If the file was successfully opened, read from it*/
            currentFile.setFile(openFileDialog.getSelectedFile().getPath());

            try {
                /*Try to read from the file*/
                String textRead = currentFile.ReadFile();
                /*Write the text read in the text box*/
                textArea.setText(textRead);
            } catch (Exception e) {
                /*In case any error occurred during file reading*/
                InfoMessages.fileReadingErrorMsg(this, currentFile.getFileName());
                return;
            }

        } else if (openingReturn == JFileChooser.CANCEL_OPTION) {
            /*If the user canceled the file selection, just return*/
            return;
        } else {
            /*Any other error is considered a error opening the file */
            InfoMessages.fileOpeningErrorMsg(this);
        }
        setFileNameLabel();
    }//GEN-LAST:event_openBtnMouseClicked

    /*Play button actions*/
    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
        if (!(playBtn.isEnabled())) {
            /*If the play button is not enabled shouldn't do anything*/
            return;
        }

        /*Checks if the system has a sound driver*/
        try {
            MidiSystem.getSequencer();
        } catch (Exception e) {
            /*If there is no sound driver, notify the user and stop the operation (it is impossible to play music without the driver)*/
            InfoMessages.noMidiDriverErrorMsg(this);
            return;
        }
        
        /*Creates a new music based on the input text*/
        Music inputMusic = new Music();
        inputMusic = prepareMusic(inputMusic);
        
        /*If the music was successfully prepared, play it*/
        if (inputMusic != null) {
            playMusic(inputMusic);
        }

    }//GEN-LAST:event_playBtnMouseClicked
        
    /*Prepare a music based on the input text*/
    private Music prepareMusic(Music inputMusic) {
        /*Sets the music "melody" as the input text*/
        inputMusic.setMelody(textArea.getText());
        
        /*If the input text is empty, its an error*/
        if (inputMusic.getMelody().isEmpty()) {
            /*Notify the user and stop operations*/
            InfoMessages.noInputErrorMsg(this);
            return null;
        }

        /*sets the music instrument according to the one selected by the user*/
        inputMusic.setInstrument(getInstrumentIndex(instrumentCombo.getSelectedIndex()));
        /*sets the music speed according to the one selected by the user*/
        inputMusic.setSpeed(speedScroll.getValue());

        if (beginnerModeRBtn.isSelected()) {
            /*If the begginners mode was selected, must parse the input and make it something playable by the JFugue lib*/
            inputMusic.parse();
        } /*As for the advanced mode, it is already in the JFugue standard*/
        
        inputMusic.setMelodyInstrument();
        inputMusic.setMelodySpeed();
        System.out.println(inputMusic.getMelody());
        /*Returns the music prepared*/
        return inputMusic;
    }
        
    /*Playes a given music*/    
    private void playMusic(Music inputMusic) {
        /*Creates a new thread to play the music, allowing the GUI to keep working while the music is played*/
        mThread = (new MusicalThread(inputMusic, this.playBtn, this));
        mThread.start();
    }
    
    /*Returns the code of the JFugue instrument according to what was selected in the comboBox of instruments*/
    private static int getInstrumentIndex(int comboBoxIndex) {
        switch (comboBoxIndex) {
            case 0:
                return Instrument.CLARINET;
            case 1:
                return Instrument.FLUTE;
            case 2:
                return Instrument.HARMONICA;
            case 3:
                return Instrument.PIANO;
            case 4:
                return Instrument.ELECTRIC_PIANO;
            case 5:
                return Instrument.TRUMPET;
            case 6:
                return Instrument.GUITAR;
            case 7:
                return Instrument.VIOLIN;
            case 8:
                return Instrument.CELLO;
            default: //Piano is the default instrument
                return Instrument.PIANO;
        }
    }

    /*Sets the filename label as the currently selected file' name*/
    private void setFileNameLabel() {
        String setName = currentFile.getFileName();
        setName = "<html> <i>" + setName;
        fileNameLabel.setText(setName);
    }
    
    private void openMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuBtnMousePressed
        openBtnMouseClicked(evt);
    }//GEN-LAST:event_openMenuBtnMousePressed
    
    /*Save as... option*/
    private void saveMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMenuBtnMousePressed
        /*Stores the current file reference*/
        TextFile temp = currentFile;
        /*closes the current file*/
        currentFile.CloseFile();
        /*calls the method to save in file*/
        saveBtnMouseClicked(evt);
        if (currentFile.isOpened()) /*If the user selected a file, just return*/ {
            return;
        } else{
            /*TODO: Must PRINT some error message and reopen the last current file*/
        }
    }//GEN-LAST:event_saveMenuBtnMousePressed
    
    /*Exit Button*/
    private void exitMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuBtnMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMenuBtnMousePressed
    
    /*Create the Mapping-Key file*/
    private void createMappingFileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMappingFileBtnMousePressed
        if (MusicalNotes.createMapFile()) {
            /* If the file was successfully created*/
        } else {
            /*If there was an error creating the file*/
            InfoMessages.fileCreationErrorMsg(this, MusicalNotes.MAPPING_FILE_NAME);
        }
    }//GEN-LAST:event_createMappingFileBtnMousePressed

    private void clearTextAreaMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearTextAreaMenuBtnMousePressed
        /*Clears the input text box, filling it with an empty string*/
        textArea.setText(EMPTY_STRING);
    }//GEN-LAST:event_clearTextAreaMenuBtnMousePressed

    private void speedScrollStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_speedScrollStateChanged
        /*Modifies the text field when the speed scroll is modified*/
        speedTextField.setText(EMPTY_STRING + speedScroll.getValue());

        MidiChannel channel=null;
        try{
            /*Open Synthesizer channel to modify its speed*/
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            MidiChannel[] channels = synthesizer.getChannels();
            channels[0].controlChange(7, 0);
        }
        catch(Exception e){ }
    }//GEN-LAST:event_speedScrollStateChanged

    private void speedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_speedTextFieldFocusLost
        /*Modifies the speed scroll value when the speed text field value is changed*/
        String temp = speedTextField.getText();
        int musicBPM;

        try {
            /*Try to parse the value read*/
            musicBPM = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            musicBPM = Music.DEFAULT_SPEED;
        }

        /*Verify if the value read is inside the boundaries*/
        if (musicBPM < Music.MIN_SPEED) {
            musicBPM = Music.MIN_SPEED;
        } else if (musicBPM > Music.MAX_SPEED) {
            musicBPM = Music.MAX_SPEED;
        }

        speedTextField.setText(EMPTY_STRING + musicBPM);
        speedScroll.setValue(musicBPM);
    }//GEN-LAST:event_speedTextFieldFocusLost
        
    /*Button to stop the music*/    
    private void stopBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBtnMousePressed
        if (mThread != null) {
            /*Interrupt the thread playing the music*/
            mThread.interrupt();
        }
        /*Reactivates the Play Music button*/
        playBtn.setEnabled(true);
    }//GEN-LAST:event_stopBtnMousePressed

    /*Presents the instructions window*/
    private void instructionsMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instructionsMenuBtnMousePressed
        InstructionWindow iw = new InstructionWindow(this);
        iw.setVisible(true);
    }//GEN-LAST:event_instructionsMenuBtnMousePressed

    private void beethovenExampleMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beethovenExampleMenuBtnMousePressed
        /*Example with the first moments of Beethoven's Für Elise, in advanced mode */
        textArea.setText(MusicExamples.getBeethovenExample());
        advancedModeRBtn.setSelected(true);
        speedScroll.setValue(50);
    }//GEN-LAST:event_beethovenExampleMenuBtnMousePressed

    private void chordsExampleMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chordsExampleMenuBtnMousePressed
        textArea.setText(MusicExamples.getChordsExample());
        advancedModeRBtn.setSelected(true);
        speedScroll.setValue(120);
    }//GEN-LAST:event_chordsExampleMenuBtnMousePressed

    private void canonExampleMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canonExampleMenuBtnMousePressed
        textArea.setText(MusicExamples.getCanonExample());
        advancedModeRBtn.setSelected(true);
        instrumentCombo.setSelectedIndex(3);
        speedScroll.setValue(100);
    }//GEN-LAST:event_canonExampleMenuBtnMousePressed

    private void advancedModeRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedModeRBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_advancedModeRBtnActionPerformed

    private void beginnerModeRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginnerModeRBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beginnerModeRBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton advancedModeRBtn;
    private javax.swing.JMenuItem beethovenExampleMenuBtn;
    private javax.swing.JRadioButton beginnerModeRBtn;
    private javax.swing.JLabel bpmLabel;
    private javax.swing.JMenuItem canonExampleMenuBtn;
    private javax.swing.JMenuItem chordsExampleMenuBtn;
    private javax.swing.JMenuItem clearTextAreaMenuBtn;
    private javax.swing.JMenu commandMenu;
    private javax.swing.JMenuItem createMappingFileBtn;
    private javax.swing.JMenu examplesMenu;
    private javax.swing.JMenuItem exitMenuBtn;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JMenuItem instructionsMenuBtn;
    private javax.swing.JComboBox instrumentCombo;
    private javax.swing.JLabel instrumentLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup modeGroup;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JButton openBtn;
    private javax.swing.JMenuItem openMenuBtn;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JMenuItem saveMenuBtn;
    private javax.swing.JLabel speedMusicLabel;
    private javax.swing.JSlider speedScroll;
    private javax.swing.JTextField speedTextField;
    private javax.swing.JButton stopBtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel textAreaLabel;
    // End of variables declaration//GEN-END:variables
}
