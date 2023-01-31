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
    public int lado_cadrado ; //same as xogo.java
    public JLabel label_cadrado;
    public boolean isFloored;
    
    //Construction
    public Cadrado(boolean specify, int posX, int posY, Color color){
        //Get comps
        this.isFloored = specify;
        this.lado_cadrado = Xogo.LADO_CADRADO;
        this.x = posX;
        this.y = posY;
        
        //Create label
        this.label_cadrado = new JLabel("");
        this.label_cadrado.setOpaque(true);
        this.label_cadrado.setSize(lado_cadrado,lado_cadrado);
        this.label_cadrado.setBackground(color);
        this.label_cadrado.setBounds(x,y,lado_cadrado,lado_cadrado);    
    }

}
