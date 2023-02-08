
package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class FichaBarra extends Ficha{
    //Cadrados
    /*
        [0]
        [1]
        [2]
        [3]
    */
    public Color tColor = Color.yellow;
    private int curPos;
    
    //Construcion
    public FichaBarra(int masterX, int masterY){
        this.cadrados[0] = new Cadrado(false,masterX ,masterY,tColor);
        this.cadrados[1] = new Cadrado(false,masterX ,masterY + Xogo.LADO_CADRADO,tColor);
        this.cadrados[2] = new Cadrado(false,masterX ,masterY + (Xogo.LADO_CADRADO *2),tColor);
        this.cadrados[3] = new Cadrado(false,masterX ,masterY + (Xogo.LADO_CADRADO *3),tColor);
    }
    
    //Abstract extension
    @Override
    public void rotar(){
        switch(curPos){
            case 0:
                
                rotatePos0to1();
                
                this.updateLabelPos();
                this.curPos ++;
                break;
            
            case 1:
                
                rotatePos1to0(); 
                
                this.updateLabelPos();
                this.curPos = 0;
                break;
                
            default:
                break;
        }
    }

    private void rotatePos1to0() {
        this.cadrados[0].setX(this.cadrados[0].getX() + Xogo.LADO_CADRADO);
        this.cadrados[0].setY(this.cadrados[0].getY() - Xogo.LADO_CADRADO);
        
        this.cadrados[2].setX(this.cadrados[2].getX() - Xogo.LADO_CADRADO);
        this.cadrados[2].setY(this.cadrados[2].getY() + Xogo.LADO_CADRADO);
        
        this.cadrados[3].setX(this.cadrados[3].getX() - (Xogo.LADO_CADRADO*2));
        this.cadrados[3].setY(this.cadrados[3].getY() + (Xogo.LADO_CADRADO*2));
    }

    private void rotatePos0to1() {
        this.cadrados[0].setX(this.cadrados[0].getX() - Xogo.LADO_CADRADO);
        this.cadrados[0].setY(this.cadrados[0].getY() + Xogo.LADO_CADRADO);
        
        this.cadrados[2].setX(this.cadrados[2].getX() + Xogo.LADO_CADRADO);
        this.cadrados[2].setY(this.cadrados[2].getY() - Xogo.LADO_CADRADO);
        
        this.cadrados[3].setX(this.cadrados[3].getX() + (Xogo.LADO_CADRADO*2));
        this.cadrados[3].setY(this.cadrados[3].getY() - (Xogo.LADO_CADRADO*2));
    }
}
