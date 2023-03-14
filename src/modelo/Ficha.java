package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public abstract class Ficha {
    //Common atributes
    protected Cadrado[] cadrados = new Cadrado[4];
    
    //Common methods
    public Cadrado[] getCadrados(){
        return cadrados;
    }
    
    //Movement
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
    
    public abstract void rotar();
    
    //Graphical updates
    /**
     * Updates all labels to their respective X and Y positions of square
     */ 
    public void updateLabelPos(){
        for (int i = 0; i < 4; i++) {
            this.cadrados[i].getLabel().setLocation(this.cadrados[i].getX(),this.cadrados[i].getY());
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
    
    /**
     * 
     * @return Cadrado
     * 
     * Iterates through ficha,
     * finding the squared with the most
     * negative X value
     */
    public Cadrado getMostRightSquare(){
        Cadrado currentLesser = this.cadrados[0];
                
        for (int i = 0; i < 4; i++) {
            if(this.cadrados[i].getX() > currentLesser.getX()){
                currentLesser = this.cadrados[i];
                
            }
        }
        
        return currentLesser;
    }
    
        /**
     * 
     * @return Cadrado
     * 
     * Iterates through ficha,
     * finding the squared with the most
     * positive X value
     */
    public Cadrado getMostLeftSquare(){
        Cadrado currentGreatest = this.cadrados[0];
                
        for (int i = 0; i < 4; i++) {
            if(this.cadrados[i].getX() < currentGreatest.getX()){
                currentGreatest = this.cadrados[i];
            }
        }
        
        return currentGreatest;
    }

    //Floor checking and Bounding
    
    /**
     * Checks if the "MostDownSquare" has reached the
     * lower limit of the game area
     * 
     * @return boolean 
     * 
     * true if has collided, false otherwise
     */
    public boolean isCollideWithLowerLimit(){
        if(this.getMostDownSquare().getY() >= Xogo.MAX_Y){   //Remember Y increments as pieces descend
            
            return true;
            
        } else {
            
            return false;
            
        }
    }
    
}
