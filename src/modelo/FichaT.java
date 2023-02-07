package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class FichaT extends Ficha {

    //Cadrado
    /*
     right;       =0   
     masterPiece; =1
     left;        =2
     centerDown;  =3
    
    [0]
    [1][3]
    [2]
     */
    //Color
    public Color tColor = Color.red;
    int curPos;
        
    //Player-controlled instancing
    public FichaT(int masterX, int masterY) {
        this.curPos = 0;    //Always initialize as position 0
        
        this.cadrados[1] = new Cadrado(false, masterX, masterY, tColor);
        this.cadrados[3] = new Cadrado(false, masterX  + Xogo.LADO_CADRADO, masterY, tColor);
        this.cadrados[0] = new Cadrado(false, masterX, masterY - Xogo.LADO_CADRADO, tColor);
        this.cadrados[2] = new Cadrado(false, masterX ,masterY + Xogo.LADO_CADRADO, tColor);
    }

    //Abstract extension
    @Override
    public void rotar() {
        switch (curPos) {
            case 0:
                
                
                
                this.curPos = 1;
                break;
            case 1:
                
                
                
                this.curPos = 2;
                break;
            case 2:
                
                
                
                this.curPos = 3;
                break;
            case 3:
                
                
                
                this.curPos = 0;
                break;
            default:
                break;
        }
    }

}
