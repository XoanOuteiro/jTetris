package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public abstract class Ficha {
    //Common atributes
    public Cadrado[] cadrados = new Cadrado[4];
    
    //Common methods
    public void moverDereita(){
        //Get coords of most right square:
        
        
        //IF most right square isnt on border:
        
        
        //Apply change on all pieces:
        for (int i = 0; i < 4; i++) {
            cadrados[i].setX(cadrados[i].getX() + Xogo.LADO_CADRADO);
        }
    }
    
    public void moverEsquerda(){
        //Get coords of most right square:
        
        
        //IF most right square isnt on border:
        
        
        //Apply change on all pieces:
        for (int i = 0; i < 4; i++) {
            cadrados[i].setX(cadrados[i].getX() + Xogo.LADO_CADRADO);
        }
    }
}
