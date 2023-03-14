package modelo;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Cadrado {
    private int x;
    private int y;
    private Color corRecheo;
    private int lado_cadrado ; //same as xogo.java
    private JLabel label_cadrado;
    private boolean isFloored;
    
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
        this.label_cadrado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    //Getters & Setters
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
        this.label_cadrado.setLocation(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public JLabel getLabel(){
        return this.label_cadrado;
    }
    
    /**
     * 
     * @return int[2]
     * 
     * Returns the x and y position values of a square in the {x,y} format
     */
    public int[] getCoordenadas(){
        int[] returnable = {this.x,this.y};
        return returnable;
    } 
    

}
