package MusicComposer;

import java.awt.event.InputEvent;
import javax.swing.JDialog;

public class InstructionWindow extends javax.swing.JDialog {

    private MainWindow parent;

    /* Initializes the instruction window */
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
        infoTextArea.setText(Texts.beginnerInfoText);
    }

    public void setAdvancedInfoWindow() {
        advancedBtn.setEnabled(false);
        beginnerBtn.setEnabled(true);
        homeBtn.setEnabled(true);
        infoTextArea.setText(Texts.advancedInfoText);
    }

    public void setHomeInfoWindow() {
        advancedBtn.setEnabled(true);
        beginnerBtn.setEnabled(true);
        homeBtn.setEnabled(false);
        infoTextArea.setText(Texts.homeInfoText);
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
