package iu;

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
    
    //Construction method
    public VentanaPrincipal() {
        
        //Swing init
        initComponents();
        
        //Game init
        xogo = new Xogo(xogoPlacehold,this,10);
        
        attributeHyperset();
        
        //Start ticker
        timerTicks();
        timer.start();
    }

    private void attributeHyperset() {
        //Attribute hyperset
        sizeR.setVisible(true);
        xogoPlacehold.setBounds(xogoPlacehold.getBounds());
        xogoPlacehold.setFocusable(true);
        xogoPlacehold.setBackground(xogoPlacehold.getBackground());
        xogoPlacehold.setBorder(xogoPlacehold.getBorder());
        xogoPlacehold.setSize(xogoPlacehold.getPreferredSize());
        level.setBounds(level.getBounds());
        level.setBackground(level.getBackground());
        level.setBorder(level.getBorder());
        next.setBounds(next.getBounds());
        next.setBackground(next.getBackground());
        next.setBorder(next.getBorder());
        panelLevel.setBounds( panelLevel.getBounds());
        panelLevel.setBackground( panelLevel.getBackground());
        panelLevel.setBorder( panelLevel.getBorder());
        panelNext.setBounds(panelNext.getBounds());
        panelNext.setBackground(panelNext.getBackground());
        panelNext.setBorder(panelNext.getBorder());
        panelScore.setBounds(panelScore.getBounds());
        panelScore.setBackground(panelScore.getBackground());
        panelScore.setBorder(panelScore.getBorder());
        score.setBounds(score.getBounds());
        score.setBackground(score.getBackground());
        score.setBorder(score.getBorder());
        panelScore.setHorizontalAlignment(SwingConstants.CENTER);
        panelScore.setVerticalAlignment(SwingConstants.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xogoPlacehold = new javax.swing.JPanel();
        sizeR = new javax.swing.JPanel();
        panelScore = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        panelLevel = new javax.swing.JPanel();
        panelNext = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        xogoPlacehold.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        xogoPlacehold.setPreferredSize(new java.awt.Dimension(240, 600));
        xogoPlacehold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xogoPlaceholdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout xogoPlaceholdLayout = new javax.swing.GroupLayout(xogoPlacehold);
        xogoPlacehold.setLayout(xogoPlaceholdLayout);
        xogoPlaceholdLayout.setHorizontalGroup(
            xogoPlaceholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        xogoPlaceholdLayout.setVerticalGroup(
            xogoPlaceholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        panelScore.setText("0");
        panelScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        next.setText(" NEXT");
        next.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        level.setText("  LEVEL ");
        level.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        score.setText("SCORE");
        score.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                            .addGap(38, 38, 38)
                            .addComponent(level))
                        .addGroup(sizeRLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(sizeRLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(score))
                        .addGroup(sizeRLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sizeRLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(next)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        sizeRLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelLevel, panelNext});

        sizeRLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {level, next, score});

        sizeRLayout.setVerticalGroup(
            sizeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sizeRLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(next)
                .addGap(18, 18, 18)
                .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(score)
                .addGap(18, 18, 18)
                .addComponent(panelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        sizeRLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelLevel, panelNext});

        sizeRLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {level, next, score});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xogoPlacehold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sizeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xogoPlacehold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xogoPlaceholdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xogoPlaceholdKeyPressed
        
        moveKeyDetection(evt);
    }//GEN-LAST:event_xogoPlaceholdKeyPressed

    public void moveKeyDetection(KeyEvent evt) {
        /*!!!!!!!
        
        Consider changing to xogoPlaceholKeyTyped(java.awt.event.KeyEvent evt);
        
        !!!!!!!*/
        
        if(evt.getKeyChar() == 'a'){
            //Move left
            xogo.moverFichaEsquerda();
            
        } else if(evt.getKeyChar() == 'd'){
            //Move right
            xogo.moverFichaDereita();
            
        } else if(evt.getKeyChar() == 'w'){
            //Rotate 
            xogo.rotarFicha();
            
        } else if(evt.getKeyChar() == 's'){
            //Move down
            xogo.moverFichaAbaixo();

            
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

    private void timerTicks(){
         this.timer = new Timer(500, (ActionEvent e) ->{
            
             xogo.moverFichaAbaixo();
             xogo.fichaActual.updateLabelPos();
             
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel level;
    private javax.swing.JLabel next;
    private javax.swing.JPanel panelLevel;
    private javax.swing.JPanel panelNext;
    private javax.swing.JLabel panelScore;
    private javax.swing.JLabel score;
    private javax.swing.JPanel sizeR;
    private javax.swing.JPanel xogoPlacehold;
    // End of variables declaration//GEN-END:variables
}
