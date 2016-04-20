package MusicComposer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on 02/06/2014, 19:31:19
 */
import javax.sound.midi.MidiSystem;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import org.jfugue.Instrument;
import javax.sound.midi.*;

public class MainWindow extends javax.swing.JFrame {

    /*Arquivo texto aberto no momento*/
    private TextFile currentFile = new TextFile(null);
    /*Thread para tocar a música em paralelo ao uso da interface do programa*/
    private MusicalThread mThread;
    
    /*
     * Algumas Strings para uso na Janela Principal
     */
    public static final String MAINWINDOW_TITLE = "Music Composer";
    private final String EMPTY_STRING = "";

    /**
     * Inicializa a janela principal
     */
    public MainWindow() {
        initComponents();

        /*Faz botões serem flat*/
        saveBtn.setContentAreaFilled(false);
        openBtn.setContentAreaFilled(false);

        /*Adiciona os dois RadioButtons de modos a um grupo de exclusão mútua*/
        modeGroup.add(advancedModeRBtn);
        modeGroup.add(beginnerModeRBtn);

        /*Seta o RadioButton de iniciante como o selecionado inicialmente*/
        beginnerModeRBtn.setSelected(true);
        speedTextField.setText(EMPTY_STRING + speedScroll.getValue());
        setFileNameLabel();
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

        advancedModeRBtn.setText("Modo Avançado");
        advancedModeRBtn.setToolTipText("Exige uma notação específica para tocar as músicas");

        beginnerModeRBtn.setText("Modo Iniciante");
        beginnerModeRBtn.setToolTipText("Permite texto livre, sem formatação especial.");

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

        modeLabel.setText("Modo de Execução:");

        instrumentCombo.setMaximumRowCount(9);
        instrumentCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clarinete", "Flauta", "Gaita de Boca", "Piano", "Piano Eletrônico", "Trompete", "Violão", "Violino", "Violoncelo" }));
        instrumentCombo.setSelectedIndex(3);
        instrumentCombo.setToolTipText("Seleciona o instrumento que tocará a música de entrada.");

        instrumentLabel.setLabelFor(instrumentCombo);
        instrumentLabel.setText("Instrumento:");
        instrumentLabel.setToolTipText("Seleciona o instrumento que tocará a música de entrada.");

        playBtn.setText("Tocar Música");
        playBtn.setToolTipText("Toca a música de entrada.");
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });

        textAreaLabel.setText("Música em texto:");
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

        speedMusicLabel.setText("Velocidade:");
        speedMusicLabel.setToolTipText("Indica quão rápido a música será tocada em Beats per Minute");

        bpmLabel.setText("BPM");
        bpmLabel.setToolTipText("Indica quão rápido a música será tocada em Beats per Minute");

        stopBtn.setText("Parar Música");
        stopBtn.setToolTipText("Pausa a música de entrada.");
        stopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stopBtnMousePressed(evt);
            }
        });

        fileNameLabel.setText("Modo de Execução:");

        fileMenu.setText("Arquivo");

        openMenuBtn.setText("Abrir Arquivo");
        openMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openMenuBtnMousePressed(evt);
            }
        });
        fileMenu.add(openMenuBtn);

        saveMenuBtn.setText("Salvar Como...");
        saveMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveMenuBtnMousePressed(evt);
            }
        });
        fileMenu.add(saveMenuBtn);

        exitMenuBtn.setText("Sair");
        exitMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMenuBtnMousePressed(evt);
            }
        });
        fileMenu.add(exitMenuBtn);

        jMenuBar1.add(fileMenu);

        optionsMenu.setText("Opções");

        createMappingFileBtn.setText("Criar Arquivo de Mapeamento");
        createMappingFileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createMappingFileBtnMousePressed(evt);
            }
        });
        optionsMenu.add(createMappingFileBtn);

        clearTextAreaMenuBtn.setText("Limpar Caixa de Texto");
        clearTextAreaMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearTextAreaMenuBtnMousePressed(evt);
            }
        });
        optionsMenu.add(clearTextAreaMenuBtn);

        jMenuBar1.add(optionsMenu);

        commandMenu.setText("Comandos");

        instructionsMenuBtn.setText("Instruções");
        instructionsMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                instructionsMenuBtnMousePressed(evt);
            }
        });
        commandMenu.add(instructionsMenuBtn);

        examplesMenu.setText("Exemplos");

        beethovenExampleMenuBtn.setText("Início de \"Für Elise\" (Beethoven)");
        beethovenExampleMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                beethovenExampleMenuBtnMousePressed(evt);
            }
        });
        examplesMenu.add(beethovenExampleMenuBtn);

        chordsExampleMenuBtn.setText("Cordas Simples");
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
                        .addComponent(textAreaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fileNameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instrumentLabel)
                                    .addComponent(instrumentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(speedScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(speedMusicLabel)
                                        .addGap(4, 4, 4)
                                        .addComponent(speedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(bpmLabel)))
                                .addGap(115, 115, 115)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stopBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modeLabel)
                            .addComponent(playBtn)
                            .addComponent(advancedModeRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beginnerModeRBtn))))
                .addContainerGap(27, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(modeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(advancedModeRBtn)
                        .addGap(4, 4, 4)
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

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        JFileChooser saveFileDialog = new JFileChooser();
        String textToWrite = textArea.getText();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos texto (*.txt)", "txt", "texto");
        saveFileDialog.setFileFilter(filter);

        if (!(currentFile.isOpened())) {
            /*Se não houver um arquivo aberto, pede para o usuário selecionar um arquivo*/

            int openingReturn = saveFileDialog.showSaveDialog(this);

            if (openingReturn == JFileChooser.APPROVE_OPTION) {
                /*Se o arquivo escolhido abrir com sucesso, escreve nele*/
                currentFile = new TextFile(saveFileDialog.getSelectedFile());

                currentFile.setTextExtension();
            } else if (openingReturn == JFileChooser.CANCEL_OPTION) {
                /*Caso o usuário tenha cancelado a escolha de arquivo, apenas retorna*/
                return;
            } else {
                /*Qualquer outro caso é definido como erro na abertura*/
                InfoMessages.fileOpeningErrorMsg(this);
                return;
            }
        }

        /*Com um arquivo já aberto, tenta escrever nele*/
        try {
            currentFile.WriteFile(textToWrite);
        } catch (Exception e) {
            InfoMessages.fileWrittingErrorMsg(this);
            currentFile.CloseFile();
            return;
        }
        /*Se chegou ao final da função, a mensagem apresentada é de que houve sucesso salvando o arquivo*/
        InfoMessages.fileSavingSuccessMsg(this, currentFile.getFileName());
        setFileNameLabel();
    }//GEN-LAST:event_saveBtnMouseClicked

    private void openBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseClicked

        JFileChooser openFileDialog = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos texto (*.txt)", "txt", "texto");

        openFileDialog.setFileFilter(filter);
        /*Pede para o usuário selecionar o arquivo que quer abrir*/
        int openingReturn = openFileDialog.showOpenDialog(this);

        if (openingReturn == JFileChooser.APPROVE_OPTION) {
            /*Se houve sucesso ao abrir o arquivo, lê dele*/
            currentFile.setFile(openFileDialog.getSelectedFile().getPath());

            try {
                String textRead = currentFile.ReadFile();
                textArea.setText(textRead);
            } catch (Exception e) {
                InfoMessages.fileReadingErrorMsg(this, currentFile.getFileName());
                return;
            }

        } else if (openingReturn == JFileChooser.CANCEL_OPTION) {
            /*Caso o usuário tenha cancelado a escolha de arquivo, apenas retorna*/
            return;
        } else {
            /*Qualquer outro caso é definido como erro na abertura*/
            InfoMessages.fileOpeningErrorMsg(this);
        }
        setFileNameLabel();
    }//GEN-LAST:event_openBtnMouseClicked

    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
        if (!(playBtn.isEnabled())) {
            /*Se o botão de play não estiver habilitado, não deve fazer nada*/
            return;
        }

        /*Verifica a existência de um driver no sistema*/
        try {
            MidiSystem.getSequencer();
        } catch (Exception e) {
            /*Se não houver driver, emite uma mensagem de erro e não continua a operação*/
            InfoMessages.noMidiDriverErrorMsg(this);
            return;
        }
        
        Music inputMusic = new Music();

        inputMusic = prepareMusic(inputMusic);

        if (inputMusic != null) {
            playMusic(inputMusic);
        }

    }//GEN-LAST:event_playBtnMouseClicked

    private Music prepareMusic(Music inputMusic) {

        inputMusic.setMelody(textArea.getText());

        if (inputMusic.getMelody().isEmpty()) {
            InfoMessages.noInputErrorMsg(this);
            return null;
        }

        /*seta o instrumento da música de acordo com a opção selecionada no comboBox de instrumentos*/
        inputMusic.setInstrument(getInstrumentIndex(instrumentCombo.getSelectedIndex()));
        /*seta a velocidade da música de acordo com o valor na barra de velocidade*/
        inputMusic.setSpeed(speedScroll.getValue());

        if (beginnerModeRBtn.isSelected()) {
            /*Se for modo iniciante, deve analisar e tratar a entrada para transformá-la em algo válido para a JFugue*/
            inputMusic.parse();
        }

        inputMusic.setMelodyInstrument();
        inputMusic.setMelodySpeed();
        System.out.println(inputMusic.getMelody());

        return inputMusic;
    }

    private void playMusic(Music inputMusic) {
        /*Cria uma nova Thread onde a música irá tocar, permitindo que o restante da interface continue
        funcionando ao mesmo tempo*/
      
        mThread = (new MusicalThread(inputMusic, this.playBtn, this));
        mThread.start();

    }

    private static int getInstrumentIndex(int comboBoxIndex) {
        /*Devolve o código do instrumento da JFugue de acordo com o índice referido
        Por default é PIANO
         */
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
            default:
                return Instrument.PIANO;
        }
    }

    private void setFileNameLabel() {
        String setName = currentFile.getFileName();
        setName = "<html> <i>" + setName;
        fileNameLabel.setText(setName);
    }
    private void openMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuBtnMousePressed
        openBtnMouseClicked(evt);
    }//GEN-LAST:event_openMenuBtnMousePressed

    private void saveMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMenuBtnMousePressed
        /*Opção Salvar como...*/
        /*Armazena a referência do arquivo atual*/
        TextFile temp = currentFile;
        /*Fecha o arquivo atual*/
        currentFile.CloseFile();
        /*Chama função para salvar em arquivo texto*/
        saveBtnMouseClicked(evt);
        if (currentFile.isOpened()) /*Se o usuário escolheu um arquivo, apenas retorna*/ {
            return;
        } else /*Se houve erro ao abrir o arquivo selecionado, ou o usuário cancelou a escolha de arquivo
        retorna a referência inicial do arquivo para o arquivo atual
         */ {
            currentFile = temp;
        }
    }//GEN-LAST:event_saveMenuBtnMousePressed

    private void exitMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuBtnMousePressed
        /*Botão de saída*/
        System.exit(0);
    }//GEN-LAST:event_exitMenuBtnMousePressed

    private void createMappingFileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMappingFileBtnMousePressed
        if (MusicalNotes.createMapFile()) {
            /* Se o arquivo foi criado com sucesso*/
        } else {
            /*Se houve erro na criação do arquivo*/
            InfoMessages.fileCreationErrorMsg(this, MusicalNotes.MAPPING_FILE_NAME);
        }
    }//GEN-LAST:event_createMappingFileBtnMousePressed

    private void clearTextAreaMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearTextAreaMenuBtnMousePressed
        /*Limpa a área de texto de entrada, preenchendo com uma String vazia*/
        textArea.setText(EMPTY_STRING);
    }//GEN-LAST:event_clearTextAreaMenuBtnMousePressed

    private void speedScrollStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_speedScrollStateChanged
        /*Modifica o campo de texto da velocidade quando o Scroll é modificado*/
        speedTextField.setText(EMPTY_STRING + speedScroll.getValue());


        MidiChannel channel=null;
        try{
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            MidiChannel[] channels = synthesizer.getChannels();
            channels[0].controlChange(7, 0);
	
        }
        catch(Exception e){
            System.out.println("ERROU!\n");
        }


    }//GEN-LAST:event_speedScrollStateChanged

    private void speedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_speedTextFieldFocusLost
        /*Modifica o valor do Scroll quando o campo de texto da velocidade é modificado*/
        String tempo = speedTextField.getText();

        int musicBPM;

        try {
            musicBPM = Integer.parseInt(tempo);
        } catch (NumberFormatException e) {
            musicBPM = Music.DEFAULT_SPEED;
        }

        /*Verifica se está fora dos limites máximo ou mínimo da velocidade*/
        if (musicBPM < Music.MIN_SPEED) {
            musicBPM = Music.MIN_SPEED;
        } else if (musicBPM > Music.MAX_SPEED) {
            musicBPM = Music.MAX_SPEED;
        }

        speedTextField.setText(EMPTY_STRING + musicBPM);
        speedScroll.setValue(musicBPM);
    }//GEN-LAST:event_speedTextFieldFocusLost

    private void stopBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBtnMousePressed
        /*Botão de parada da música*/
        if (mThread != null) {
            mThread.interrupt();
        }
        playBtn.setEnabled(true);
    }//GEN-LAST:event_stopBtnMousePressed

    private void instructionsMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instructionsMenuBtnMousePressed
        /*Apresenta a janela de instruções*/
        InstructionWindow iw = new InstructionWindow(this);
        iw.setVisible(true);
    }//GEN-LAST:event_instructionsMenuBtnMousePressed

    private void beethovenExampleMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beethovenExampleMenuBtnMousePressed
        /*Exemplo com os primeiros momentos de Für Elise de Beethoven no modo avançado*/
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
    /**
     * @param args the command line arguments
     */
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
