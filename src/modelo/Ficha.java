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
        
        //Update label
        this.updateLabelPos();
    }
    
    public void moverEsquerda(){
        //Get coords of most right square:
        
        
        //IF most right square isnt on border:
        
        
        //Apply change on all pieces:
        for (int i = 0; i < 4; i++) {
            cadrados[i].setX(cadrados[i].getX() - Xogo.LADO_CADRADO);
        }
        
        //Update label
        this.updateLabelPos();
    }
    
    public void moverAbaixo(){
        //Get coords of most right square:
        
        
        //IF most right square isnt on border:
        
        
        //Apply change on all pieces:
        for (int i = 0; i < 4; i++) {
            cadrados[i].setY(cadrados[i].getY() + Xogo.LADO_CADRADO);
        }
        
        //Update label
        this.updateLabelPos();
    }
    
    public void updateLabelPos(){
        for (int i = 0; i < 4; i++) {
            this.cadrados[i].label_cadrado.setLocation(cadrados[i].getX(),cadrados[i].getY());
        }
    }
}
