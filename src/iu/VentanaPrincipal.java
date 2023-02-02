package iu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import modelo.Xogo;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //Atributes
    public Xogo xogo;
    public Timer timer;
    boolean playing = false;

    //Construction method
    public VentanaPrincipal() {

        //Swing init
        initComponents();

        //Game init
        xogo = new Xogo(xogoMainPane, this, 10);

        attributeHyperset();

        //Start ticker
        timerTicks();

    }

    private void attributeHyperset() {
        //Attribute hyperset
        sizeR.setVisible(true);
        
        xogoMainPane.setBounds(xogoMainPane.getBounds());
        xogoMainPane.setFocusable(true);
        xogoMainPane.setBackground(xogoMainPane.getBackground());
        xogoMainPane.setBorder(xogoMainPane.getBorder());
        xogoMainPane.setSize(xogoMainPane.getPreferredSize());
        
        level.setBounds(level.getBounds());
        level.setBackground(level.getBackground());
        level.setBorder(level.getBorder());
        
        next.setBounds(next.getBounds());
        next.setBackground(next.getBackground());
        next.setBorder(next.getBorder());
        
        panelLevel.setBounds(panelLevel.getBounds());
        panelLevel.setBackground(panelLevel.getBackground());
        panelLevel.setBorder(panelLevel.getBorder());
        
        panelNext.setBounds(panelNext.getBounds());
        panelNext.setBackground(panelNext.getBackground());
        panelNext.setBorder(panelNext.getBorder());
        
        panelScore.setBounds(panelScore.getBounds());
        panelScore.setBackground(panelScore.getBackground());
        panelScore.setBorder(panelScore.getBorder());
        panelScore.setHorizontalAlignment(SwingConstants.CENTER);
        panelScore.setVerticalAlignment(SwingConstants.CENTER);
        
        score.setBounds(score.getBounds());
        score.setBackground(score.getBackground());
        score.setBorder(score.getBorder());
        
        //Config Button
        configButton.setFocusable(false);
        configButton.setOpaque(false);
        configButton.setContentAreaFilled(true);
        configButton.setBorderPainted(false);
        
        //Play button
        playButton.setFocusable(false);
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(true);
        playButton.setBorderPainted(false);
        
        //help Button
        helpButton.setFocusable(false);
        helpButton.setOpaque(false);
        helpButton.setContentAreaFilled(true);
        helpButton.setBorderPainted(false);
        
        //Config Menu
        configMenu.setVisible(false);
        configMenu.setSize(new Dimension(400, 500));
        configMenu.setMinimumSize(new Dimension(200, 200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configMenu = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        xogoMainPane = new javax.swing.JPanel();
        sizeR = new javax.swing.JPanel();
        panelScore = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        panelLevel = new javax.swing.JPanel();
        panelNext = new javax.swing.JPanel();
        sizeL = new javax.swing.JPanel();
        configButton = new javax.swing.JButton();
        playButton = new javax.swing.JToggleButton();
        helpButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 60)); // NOI18N
        jLabel1.setText("Tetris");

        javax.swing.GroupLayout configMenuLayout = new javax.swing.GroupLayout(configMenu.getContentPane());
        configMenu.getContentPane().setLayout(configMenuLayout);
        configMenuLayout.setHorizontalGroup(
            configMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configMenuLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        configMenuLayout.setVerticalGroup(
            configMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xogoMainPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        xogoMainPane.setPreferredSize(new java.awt.Dimension(240, 600));
        xogoMainPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xogoMainPaneKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout xogoMainPaneLayout = new javax.swing.GroupLayout(xogoMainPane);
        xogoMainPane.setLayout(xogoMainPaneLayout);
        xogoMainPaneLayout.setHorizontalGroup(
            xogoMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        xogoMainPaneLayout.setVerticalGroup(
            xogoMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        panelScore.setText("0");
        panelScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        next.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        next.setText(" NEXT");
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        level.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        level.setText("LEVEL ");

        score.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        score.setText("SCORE");

        panelLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelLevelLayout = new javax.swing.GroupLayout(panelLevel);
        panelLevel.setLayout(panelLevelLayout);
        panelLevelLayout.setHorizontalGroup(
            panelLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        panelLevelLayout.setVerticalGroup(
            panelLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        panelNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelNext.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelNext.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout sizeRLayout = new javax.swing.GroupLayout(sizeR);
        sizeR.setLayout(sizeRLayout);
        sizeRLayout.setHorizontalGroup(
            sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizeRLayout.createSequentialGroup()
                .addGroup(sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(sizeRLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(sizeRLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(sizeRLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(next))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(level))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(score)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        sizeRLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelLevel, panelNext});

        sizeRLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {level, next, score});

        sizeRLayout.setVerticalGroup(
            sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sizeRLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(next)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(score)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        sizeRLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelLevel, panelNext});

        sizeRLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {level, next, score});

        configButton.setBackground(new java.awt.Color(255, 255, 255));
        configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/configButton.png"))); // NOI18N
        configButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(255, 255, 255));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/playButton.png"))); // NOI18N
        playButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                playButtonStateChanged(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(255, 255, 255));
        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/yellow_questionmark2.png"))); // NOI18N

        javax.swing.GroupLayout sizeLLayout = new javax.swing.GroupLayout(sizeL);
        sizeL.setLayout(sizeLLayout);
        sizeLLayout.setHorizontalGroup(
            sizeLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizeLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sizeLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        sizeLLayout.setVerticalGroup(
            sizeLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizeLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sizeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xogoMainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xogoMainPane, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addComponent(sizeR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(sizeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xogoMainPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xogoMainPaneKeyPressed

        moveKeyDetection(evt);
    }//GEN-LAST:event_xogoMainPaneKeyPressed

    private void configButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configButtonActionPerformed
        // TODO add your handling code here:
        configMenu.setVisible(true);
    }//GEN-LAST:event_configButtonActionPerformed

    private void playButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_playButtonStateChanged
        if (playButton.isSelected()) {
            timer.start();
            playing = true;
        } else {
            timer.stop();
            playing = false;
        }
    }//GEN-LAST:event_playButtonStateChanged

    public void moveKeyDetection(KeyEvent evt) {
        /*!!!!!!!
        
        Consider changing to xogoPlaceholKeyTyped(java.awt.event.KeyEvent evt);
        
        !!!!!!!*/
        if (playing) {

            if (evt.getKeyChar() == 'a') {
                //Move left
                xogo.moverFichaEsquerda();

            } else if (evt.getKeyChar() == 'd') {
                //Move right
                xogo.moverFichaDereita();

            } else if (evt.getKeyChar() == 'w') {
                //Rotate 
                xogo.rotarFicha();

            } else if (evt.getKeyChar() == 's') {
                //Move down
                xogo.moverFichaAbaixo();

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void timerTicks() {
        this.timer = new Timer(500, (ActionEvent e) -> {

            xogo.moverFichaAbaixo();
            xogo.fichaActual.updateLabelPos();

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configButton;
    private javax.swing.JFrame configMenu;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel level;
    private javax.swing.JLabel next;
    private javax.swing.JPanel panelLevel;
    private javax.swing.JPanel panelNext;
    private javax.swing.JLabel panelScore;
    private javax.swing.JToggleButton playButton;
    private javax.swing.JLabel score;
    private javax.swing.JPanel sizeL;
    private javax.swing.JPanel sizeR;
    private javax.swing.JPanel xogoMainPane;
    // End of variables declaration//GEN-END:variables
}
