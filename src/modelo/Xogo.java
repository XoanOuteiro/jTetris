package modelo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Xogo extends JPanel {
    
    public final int LADO_CADRADO = 10;
    public final int MAX_X = 200;
    public final int MAX_Y = 200;
    public boolean pausa;
    public int numeroLineas;
    public int rowAM ;
    public int colAM ;
    public int celSiz ;//= to lado¿

    
    //Construction
    public Xogo(JPanel holder, int colAm){
        //Match styles
        holder.setVisible(false);
        this.setBounds(holder.getBounds());
        this.setBackground(holder.getBackground());
        this.setBorder(holder.getBorder());
        
        //Create grid
        this.colAM = colAm;
        this.celSiz = this.getBounds().width/colAm;
        this.rowAM = this.getBounds().height/celSiz;
    }
    
    //OVERRIDES
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i=0; i<rowAM; i++){
            for (int j = 0; j < colAM; j++) {
                
                g.drawRect(j*celSiz, i*celSiz , celSiz, celSiz);
            }
        }
    }
}
