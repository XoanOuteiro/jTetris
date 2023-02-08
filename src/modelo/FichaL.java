
package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class FichaL extends Ficha{
    //Cadrado
    /*
    [0]
    [1]
    [2][3]
    */
    public Color tColor = Color.green;
    private int curPos;
    
    //Construction
    public FichaL(int masterX, int masterY){
        this.cadrados[0] = new Cadrado(false,masterX ,masterY,tColor);
        this.cadrados[1] = new Cadrado(false,masterX ,masterY + Xogo.LADO_CADRADO,tColor);
        this.cadrados[2] = new Cadrado(false,masterX ,masterY + (Xogo.LADO_CADRADO *2),tColor);
        this.cadrados[3] = new Cadrado(false,masterX + Xogo.LADO_CADRADO ,masterY + (Xogo.LADO_CADRADO *2),tColor);
    }
    
    //Abstract extension
    @Override
    public void rotar(){
        switch (curPos) {   //On each we need to update X and Y per Square and set those as the labels coordinates
            case 0:
                
                rotatePos0to1();
                
                this.updateLabelPos();
                this.curPos ++;
                break;
                
            case 1:
                
                rotatePos1to2();                
                
                this.updateLabelPos();
                this.curPos ++;
                break;
                
            case 2:
                rotatePos2to3();                
                
                this.updateLabelPos();
                this.curPos ++;
                break;
                
            case 3:
                rotatePos3to0();                
                
                this.updateLabelPos();
                this.curPos = 0;
                break;
                
            default:
                break;
        }
    }

    private void rotatePos3to0() {
        this.cadrados[0].setX(this.cadrados[0].getX() - Xogo.LADO_CADRADO);
        this.cadrados[0].setY(this.cadrados[0].getY() - Xogo.LADO_CADRADO);
        
        this.cadrados[2].setX(this.cadrados[2].getX() + Xogo.LADO_CADRADO);
        this.cadrados[2].setY(this.cadrados[2].getY() + Xogo.LADO_CADRADO);
        
        this.cadrados[3].setX(this.cadrados[3].getX() + (Xogo.LADO_CADRADO*2));
        this.cadrados[3].setY(this.cadrados[3].getY() );
    }

    private void rotatePos2to3() {
        this.cadrados[0].setX(this.cadrados[0].getX() + Xogo.LADO_CADRADO);
        this.cadrados[0].setY(this.cadrados[0].getY() - Xogo.LADO_CADRADO);
        
        this.cadrados[2].setX(this.cadrados[2].getX() - Xogo.LADO_CADRADO);
        this.cadrados[2].setY(this.cadrados[2].getY() + Xogo.LADO_CADRADO);
        
        this.cadrados[3].setX(this.cadrados[3].getX() );
        this.cadrados[3].setY(this.cadrados[3].getY() + (Xogo.LADO_CADRADO*2));
    }

    private void rotatePos1to2() {
        this.cadrados[0].setX(this.cadrados[0].getX() + Xogo.LADO_CADRADO);
        this.cadrados[0].setY(this.cadrados[0].getY() + Xogo.LADO_CADRADO);
        
        this.cadrados[2].setX(this.cadrados[2].getX() - Xogo.LADO_CADRADO);
        this.cadrados[2].setY(this.cadrados[2].getY() - Xogo.LADO_CADRADO);
        
        this.cadrados[3].setX(this.cadrados[3].getX() - (Xogo.LADO_CADRADO*2));
        this.cadrados[3].setY(this.cadrados[3].getY());
    }

    private void rotatePos0to1() {
        this.cadrados[0].setX(this.cadrados[0].getX() - Xogo.LADO_CADRADO);
        this.cadrados[0].setY(this.cadrados[0].getY() + Xogo.LADO_CADRADO);
        
        this.cadrados[2].setX(this.cadrados[2].getX() + Xogo.LADO_CADRADO);
        this.cadrados[2].setY(this.cadrados[2].getY() - Xogo.LADO_CADRADO);
        
        this.cadrados[3].setX(this.cadrados[3].getX() );
        this.cadrados[3].setY(this.cadrados[3].getY() - (Xogo.LADO_CADRADO*2));
    }
}
