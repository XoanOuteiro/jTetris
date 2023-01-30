package modelo;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Cadrado {
    public int x;
    public int y;
    public Color corRecheo;
    public int lado_cadrado; //same as xogo.java
    public JLabel label_cadrado;
    
    /*???*/public int state;   // 1 means floored piece, 2 means player-controlled piece, 0 (?) void
    
    //Construction
    public Cadrado(int specify, int latSize, int posX, int posY, Color color){
        //Get comps
        this.state = specify;
        this.lado_cadrado = latSize;
        this.x = posX;
        this.y = posY;
        
        //Create label
        this.label_cadrado.setOpaque(true);
        this.label_cadrado.setSize(latSize,latSize);
        this.label_cadrado.setBackground(color);
    }

}
