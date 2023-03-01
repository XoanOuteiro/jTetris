package iu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    public Timer gameSpeedTimer;
    public Timer gameTimeTimer;
    boolean playing = false;
    int seconds = 0;
    boolean stickyKeysb = false;

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
    
    public void borrarCadrado(JLabel este){
        xogoMainPane.remove(este);
        xogoMainPane.updateUI();
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
        
        timeField.setBounds(timeField.getBounds());
        timeField.setBackground(timeField.getBackground());
        timeField.setBorder(timeField.getBorder());
        timeField.setHorizontalAlignment(SwingConstants.CENTER);
        timeField.setVerticalAlignment(SwingConstants.CENTER);
        
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
        
        //restart button
        restartButton.setFocusable(false);
        
        //exit button
        exitButton.setFocusable(false);
    }
    
    private void reset() {
        ArrayList <JLabel> labels = xogo.getAllLabels();
        Iterator <JLabel> it = labels.iterator() ;
        while(it.hasNext()){
            xogoMainPane.remove(it.next());
        }    
        gameTimeTimer.restart();
        seconds = 0;
        timeField.setText("0");
        xogo.killAll();
        this.xogo = new Xogo(xogoMainPane, this, 10);
        refreshPanel();
    }

    public void refreshPanel() {
        xogoMainPane.updateUI();
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
        levelSlider = new javax.swing.JSlider();
        stickyKeys = new javax.swing.JCheckBox();
        levelLabel = new javax.swing.JLabel();
        helpMenu = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        xogoMainPane = new javax.swing.JPanel();
        sizeR = new javax.swing.JPanel();
        timeField = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        panelLevel = new javax.swing.JPanel();
        panelNext = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        panelScore1 = new javax.swing.JLabel();
        sizeL = new javax.swing.JPanel();
        playButton = new javax.swing.JToggleButton();
        helpButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        configButton = new javax.swing.JToggleButton();

        levelSlider.setMaximum(25);
        levelSlider.setPaintTicks(true);

        stickyKeys.setText("Sticky Keys");
        stickyKeys.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stickyKeysStateChanged(evt);
            }
        });
        stickyKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stickyKeysActionPerformed(evt);
            }
        });

        levelLabel.setText("Level");

        javax.swing.GroupLayout configMenuLayout = new javax.swing.GroupLayout(configMenu.getContentPane());
        configMenu.getContentPane().setLayout(configMenuLayout);
        configMenuLayout.setHorizontalGroup(
            configMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configMenuLayout.createSequentialGroup()
                .addGroup(configMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(configMenuLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(stickyKeys))
                    .addGroup(configMenuLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(levelLabel))
                    .addGroup(configMenuLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(levelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        configMenuLayout.setVerticalGroup(
            configMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(levelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(levelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(stickyKeys)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jLabel2.setText("W / ^: Rotate");

        jLabel3.setText("A / < :Mov. L");

        jLabel4.setText("D / >:Mov. R");

        jLabel5.setText("Space :Pause");

        jLabel6.setText("Esc: Menu");

        javax.swing.GroupLayout helpMenuLayout = new javax.swing.GroupLayout(helpMenu.getContentPane());
        helpMenu.getContentPane().setLayout(helpMenuLayout);
        helpMenuLayout.setHorizontalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpMenuLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpMenuLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(helpMenuLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)))
                .addGap(17, 17, 17))
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        helpMenuLayout.setVerticalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xogoMainPane.setBackground(new java.awt.Color(204, 204, 204));
        xogoMainPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        xogoMainPane.setForeground(new java.awt.Color(0, 0, 0));
        xogoMainPane.setPreferredSize(new java.awt.Dimension(240, 600));
        xogoMainPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xogoMainPaneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xogoMainPaneKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout xogoMainPaneLayout = new javax.swing.GroupLayout(xogoMainPane);
        xogoMainPane.setLayout(xogoMainPaneLayout);
        xogoMainPaneLayout.setHorizontalGroup(
            xogoMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        xogoMainPaneLayout.setVerticalGroup(
            xogoMainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        timeField.setBackground(new java.awt.Color(153, 153, 153));
        timeField.setText("0");
        timeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        next.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        next.setText(" NEXT");
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        level.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        level.setText("LEVEL ");

        score.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        score.setText("SCORE");

        panelLevel.setBackground(new java.awt.Color(204, 204, 204));
        panelLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

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

        panelNext.setBackground(new java.awt.Color(204, 204, 204));
        panelNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelNext.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelNext.setLayout(new java.awt.BorderLayout());

        timeLabel.setText("Time");

        panelScore1.setBackground(new java.awt.Color(153, 153, 153));
        panelScore1.setText("0");
        panelScore1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout sizeRLayout = new javax.swing.GroupLayout(sizeR);
        sizeR.setLayout(sizeRLayout);
        sizeRLayout.setHorizontalGroup(
            sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizeRLayout.createSequentialGroup()
                .addGroup(sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(level))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(score))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(next))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(timeLabel)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sizeRLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(panelScore1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        sizeRLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelLevel, panelNext});

        sizeRLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {level, next, score});

        sizeRLayout.setVerticalGroup(
            sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sizeRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(next)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(level)
                .addGap(17, 17, 17)
                .addComponent(panelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(score)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sizeRLayout.createSequentialGroup()
                    .addContainerGap(483, Short.MAX_VALUE)
                    .addComponent(panelScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73)))
        );

        sizeRLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelLevel, panelNext});

        sizeRLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {level, next, score});

        playButton.setBackground(new java.awt.Color(255, 255, 255));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/playButton_withButton_unclicked.png"))); // NOI18N
        playButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                playButtonStateChanged(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(255, 255, 255));
        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/yellow_questionmark2_withButton.png"))); // NOI18N
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        restartButton.setText("R");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        exitButton.setText("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        configButton.setBackground(new java.awt.Color(255, 255, 255));
        configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/configButton_withButton_unclicked.png"))); // NOI18N
        configButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                configButtonStateChanged(evt);
            }
        });

        javax.swing.GroupLayout sizeLLayout = new javax.swing.GroupLayout(sizeL);
        sizeL.setLayout(sizeLLayout);
        sizeLLayout.setHorizontalGroup(
            sizeLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sizeLLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(sizeLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(configButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xogoMainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sizeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(xogoMainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sizeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xogoMainPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xogoMainPaneKeyPressed

        moveKeyDetection(evt);
    }//GEN-LAST:event_xogoMainPaneKeyPressed

    private void playButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_playButtonStateChanged
        if (playButton.isSelected()) {
            gameSpeedTimer.start();
            gameTimeTimer.start();
            playing = true;
            playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/playButton_withButton_clicked.png")));
            
        } else {
            gameSpeedTimer.stop();
            gameTimeTimer.stop();
            playing = false;
            playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/playButton_withButton_unclicked.png")));
        }
    }//GEN-LAST:event_playButtonStateChanged

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void stickyKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stickyKeysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stickyKeysActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        reset();
    }//GEN-LAST:event_restartButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void configButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_configButtonStateChanged
        if(configButton.isSelected()){
            
            configMenu.setVisible(true);
            configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/configButton_withButton_clicked.png")));
            
            if(playButton.isSelected()){
                playButton.doClick();
            }
            
        }else{
            
            configMenu.setVisible(false);
            configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonSprites/configButton_withButton_unclicked.png")));
            
        }
    }//GEN-LAST:event_configButtonStateChanged

    private void stickyKeysStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stickyKeysStateChanged
        if(stickyKeys.isSelected()){
            stickyKeysb = true;
        }else{
            stickyKeysb = false;
        }
    }//GEN-LAST:event_stickyKeysStateChanged

    private void xogoMainPaneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xogoMainPaneKeyTyped
        if (playing && !stickyKeysb) {
            
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
    }//GEN-LAST:event_xogoMainPaneKeyTyped

    public void moveKeyDetection(KeyEvent evt) {

        if (playing && stickyKeysb) {
            
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
        
        
        this.gameSpeedTimer = new Timer(500, (ActionEvent e) -> {

            xogo.moverFichaAbaixo();
            xogo.fichaActual.updateLabelPos();

        });
        
        this.gameTimeTimer = new Timer(1000, (ActionEvent e) -> {
            
            seconds++;
            this.timeField.setText(Integer.toString(seconds));

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton configButton;
    private javax.swing.JFrame configMenu;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JFrame helpMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel level;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JSlider levelSlider;
    private javax.swing.JLabel next;
    private javax.swing.JPanel panelLevel;
    private javax.swing.JPanel panelNext;
    private javax.swing.JLabel panelScore1;
    private javax.swing.JToggleButton playButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel score;
    private javax.swing.JPanel sizeL;
    private javax.swing.JPanel sizeR;
    private javax.swing.JCheckBox stickyKeys;
    private javax.swing.JLabel timeField;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel xogoMainPane;
    // End of variables declaration//GEN-END:variables
}
