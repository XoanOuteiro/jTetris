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

        for (int i = 0; i < 4; i++) {
            cadrados[i].setX(cadrados[i].getX() + Xogo.LADO_CADRADO);
        }
        
        //Update label
        this.updateLabelPos();
    }
    
    public void moverEsquerda(){

        for (int i = 0; i < 4; i++) {
            cadrados[i].setX(cadrados[i].getX() - Xogo.LADO_CADRADO);
        }
        
        //Update label
        this.updateLabelPos();
    }
    
    public void moverAbaixo(){
        
        for (int i = 0; i < 4; i++) {
            cadrados[i].setY(cadrados[i].getY() + Xogo.LADO_CADRADO);
        }
        
        //Update label
        this.updateLabelPos();
    }
    
    public void updateLabelPos(){
        for (int i = 0; i < 4; i++) {
            this.cadrados[i].label_cadrado.setLocation(this.cadrados[i].getX(),this.cadrados[i].getY());
        }
    }
    
    //Get [pos] piece
    public Cadrado getMostDownSquare(){
        Cadrado currentLower = this.cadrados[0];
                
        for (int i = 0; i < 4; i++) {
            if(this.cadrados[i].getY() > currentLower.getY()){
                currentLower = this.cadrados[i];
            }
        }
        
        return currentLower;
    }
    
    public Cadrado getMostRightSquare(){
        Cadrado currentLesser = this.cadrados[0];
                
        for (int i = 0; i < 4; i++) {
            if(this.cadrados[i].getX() > currentLesser.getX()){
                currentLesser = this.cadrados[i];
                
            }
        }
        
        return currentLesser;
    }
    
    public Cadrado getMostLeftSquare(){
        Cadrado currentGreatest = this.cadrados[0];
                
        for (int i = 0; i < 4; i++) {
            if(this.cadrados[i].getX() < currentGreatest.getX()){
                currentGreatest = this.cadrados[i];
            }
        }
        
        return currentGreatest;
    }

}
