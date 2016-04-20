package MusicComposer;

import java.awt.event.InputEvent;
import javax.swing.JDialog;

public class InstructionWindow extends javax.swing.JDialog {

    /*
     * Strings Constantes contendo os textos sobre cada modo e o texto da "home" de instruções
     */
    private final String homeInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      \r\t<u><b>Instruções: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n&nbsp;&nbsp;&nbsp;&nbsp;O <i>Music Composer</i> permite que músicas sejam criadas utilizando como forma de notação a escrita comum, com caracteres encontrados no teclado. O programa cria uma implementação e interface para a biblioteca <i>JFugue</i>, utilizada como base para o funcionamento do todo.\n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;Contando com dois modos, o <i>Iniciante</i> e o <i>Avançado</i>, o programa consegue abrangir diferentes tipo de usuário, com diferentes graus de conhecimento sobre o mundo musical e suas implicações.\n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;Em qualquer um dos modos é possível modificar inicialmente o instrumento que tocará a música, bem como a velocidade com que o som será tocado (dada em <i>beats per minute</i> - BPM).<br></br><br></br>&nbsp;&nbsp;&nbsp;&nbsp;  Para obter mais informações sobre os modos, pressione um dos botões abaixo.\n                     \n</body></p>\n  </body>\r\n</html>\r\n";
    private final String beginnerInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      \r\t<u><b>Instruções do modo Iniciante: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;O <i>Modo Iniciante</i> trata da escrita da música em formato de texto livre, sem estruturação alguma, sem notações específicas ou regras estritas a serem seguidas. Qualquer texto inserido \nno campo de entrada será mapeado para notas musicais de acordo com um mapeamento pré-definido, e então o resultado será tocado ao usuário em forma de som, nota por nota.<br></br>\n\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;As possibilidades de notas e modificações destas são um pouco limitadas. Ao todo, conta-se com 12 notas ( Dó, Dó#, Ré, Mi, Mib, Fá, Fá#, Sol, Sol#, Lá, Si, Sib). Além delas, é possível fazer uso\nda notação de oitavas (dígitos de 0 a 9) para delimitar a oitava de uma dada nota. Por fim, alguns caracteres são específicos para determinar qual o período de toque de uma certa nota.\n<br></br><br></br> <ul><u> Mapeamento básico (não faz distinção entre maiusculas e minusculas):</u></ul>\n<ul>Oitavas: &nbsp;&nbsp;1, 2, 3, 4, 5, 6, 7, 8, 9, 0<br></br>\n        Durações: &nbsp;&nbsp;W, H, Q, I, S, X, O<br></br>\n        Nota Dó:&nbsp;&nbsp; C, V, \\, :<br></br>\n        Nota Dó#: &nbsp;&nbsp;Y, ?, $, %, <, ><br></br>\n        Nota Ré: &nbsp;&nbsp;D, J, (, )<br></br>\n        Nota Mi: &nbsp;&nbsp;E, R, _, ^<br></br>\n        Nota Mib: &nbsp;&nbsp;U, L, -<br></br>\n        Nota Fá: &nbsp;&nbsp;F, Z, =, [, ]<br></br>\n        Nota Fá#: &nbsp;&nbsp;K, !, ~, +, {, }<br></br>\n        Nota Sol: &nbsp;&nbsp;G, T, &, '<br></br>\n        Nota Sol#: &nbsp;&nbsp;N, M, /   <br></br>\n        Nota Lá: &nbsp;&nbsp;A, @, #, \" <br></br>\n        Nota Si: &nbsp;&nbsp;P, , , ; <br></br>\n        Nota Sib: &nbsp;&nbsp;B, . , *, | <br></br>\n</ul>\n<p style=\"margin-top: 0\" align=\"justify\"><br></br>&nbsp;&nbsp;&nbsp;&nbsp;É possível modificar este mapeamento básico, bastando abrir o arquivo texto <i>mapping.txt</i> , localizado na mesma pasta do programa e modificar diretamente\nali o que cada caractere do teclado deve representar como nota (note que a separação entre cada caractere é feito por um espaço simples e não por vírgulas como aqui).\n\n</body></p>\n  </body>\r\n</html>\r\n";
    private final String advancedInfoText = "<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      \r\t<u><b>Instruções do modo Avançado: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;O <i>Modo Avançado</i>, diferente do <i>Iniciante</i>, exige que se utilize uma forma de notação específica para a formação de uma música. \nEssa notação é a mesma utilizada na biblioteca de música <i><a href=\"www.jfugue.org/jfugue-chapter2.pdf\">JFugue (link com manual)</i></a>.<br></br>\n\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;A partir dela é possível fazer uso de todas as notas básicas, com suas respectivas escalas sustenido e bemol. É ainda possível definir as oitavas de cada nota,\nbem como mudanças de instrumentos ao longo da música, notas tocadas em paralelo, mudar a velocidade \"dinamicamente\" entre outros tantos comandos. Porém, para fazer uso de todos estes recursos\ndisponíveis, é preciso que se conheça a fundo a sintaxe e notação da <i>JFugue</i>.\n\n\n</body></p>\n  </body>\r\n</html>\r\n";
    private MainWindow parent;

    /**
     * Inicializa a janela de instruções
     */
    public InstructionWindow(MainWindow p) {
        parent = p;
        initComponents();
        this.setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
        this.setAlwaysOnTop(true);
        setHomeInfoWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextPane();
        beginnerBtn = new javax.swing.JButton();
        advancedBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        infoTextArea.setBackground(new java.awt.Color(204, 204, 204));
        infoTextArea.setContentType("text/html"); // NOI18N
        infoTextArea.setEditable(false);
        infoTextArea.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\" align=\"center\">\r\n      \r\t<u><b>Instruções do modo Avançado: </u></b>\n    </p>\r\n<p style=\"margin-top: 0\" align=\"justify\"><body style= \"font-family:\"MS Shell Dlg 2\"> <br></br>\n\t      \n<br></br>&nbsp;&nbsp;&nbsp;&nbsp;O <i>Modo Avançado</i>, diferente do <i>Iniciante</i>, exige que se utilize uma forma de notação específica para a formação de uma música. \nEssa notação é a mesma utilizada na biblioteca de música <i><a href=\"www.jfugue.org/jfugue-chapter2.pdf\">JFugue (link com manual)</i></a>.<br></br>\n\n<br></br> &nbsp;&nbsp;&nbsp;&nbsp;A partir dela é possível fazer uso de todas as notas básicas, com suas respectivas escalas sustenido e bemol. É ainda possível definir as oitavas de cada nota,\nbem como mudanças de instrumentos ao longo da música, notas tocadas em paralelo, mudar a velocidade \"dinamicamente\" entre outros tantos comandos. Porém, para fazer uso de todos estes recursos\ndisponíveis, é preciso que se conheça a fundo a sintaxe e notação da <i>JFugue</i>.\n\n\n</body></p>\n  </body>\r\n</html>\r\n");
        infoTextArea.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                infoTextAreaHyperlinkUpdate(evt);
            }
        });
        jScrollPane3.setViewportView(infoTextArea);

        beginnerBtn.setText("Modo Iniciante");
        beginnerBtn.setMaximumSize(new java.awt.Dimension(109, 23));
        beginnerBtn.setPreferredSize(new java.awt.Dimension(135, 23));
        beginnerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                beginnerBtnMousePressed(evt);
            }
        });

        advancedBtn.setText("Modo Avançado");
        advancedBtn.setPreferredSize(new java.awt.Dimension(135, 23));
        advancedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                advancedBtnMousePressed(evt);
            }
        });

        homeBtn.setText("Instruções");
        homeBtn.setPreferredSize(new java.awt.Dimension(135, 23));
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(beginnerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(advancedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beginnerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(advancedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setBeginnerInfoWindow() {
        beginnerBtn.setEnabled(false);
        advancedBtn.setEnabled(true);
        homeBtn.setEnabled(true);
        infoTextArea.setText(beginnerInfoText);
    }

    public void setAdvancedInfoWindow() {
        advancedBtn.setEnabled(false);
        beginnerBtn.setEnabled(true);
        homeBtn.setEnabled(true);
        infoTextArea.setText(advancedInfoText);
    }

    public void setHomeInfoWindow() {
        advancedBtn.setEnabled(true);
        beginnerBtn.setEnabled(true);
        homeBtn.setEnabled(false);
        infoTextArea.setText(homeInfoText);
    }

    private void infoTextAreaHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_infoTextAreaHyperlinkUpdate
        String clickedURL = evt.getDescription();
        InputEvent pressEvent = evt.getInputEvent();

        if (pressEvent.getModifiers() == InputEvent.BUTTON1_MASK) {

            if (!java.awt.Desktop.isDesktopSupported()) {
                InfoMessages.desktopNotSupportedErrorMsg(parent);
                this.dispose();
            }

            if (clickedURL.length() == 0) {
                InfoMessages.noUrlErrorMsg(parent);
                this.dispose();
            }

            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (!desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                InfoMessages.noBrowserErrorMsg(parent);
                this.dispose();
            }


            try {
                java.net.URI uri = new java.net.URI(clickedURL);
                desktop.browse(uri);
            } catch (Exception e) {
                InfoMessages.unknownErrorMsg(parent);
                this.dispose();
            }

        }

    }//GEN-LAST:event_infoTextAreaHyperlinkUpdate

    private void beginnerBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beginnerBtnMousePressed
        setBeginnerInfoWindow();
    }//GEN-LAST:event_beginnerBtnMousePressed

    private void homeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMousePressed
        setHomeInfoWindow();
    }//GEN-LAST:event_homeBtnMousePressed

    private void advancedBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advancedBtnMousePressed
        setAdvancedInfoWindow();
    }//GEN-LAST:event_advancedBtnMousePressed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton advancedBtn;
    private javax.swing.JButton beginnerBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JTextPane infoTextArea;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
