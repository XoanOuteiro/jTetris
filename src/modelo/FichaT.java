
package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class FichaT extends Ficha{
    //Cadrado
    /*
     right;       =0   
     masterPiece; =1
     left;        =2
     centerDown;  =3
    */
    //Color
    public Color tColor = Color.red;
    
    //Player-controlled instancing
    public FichaT(int masterX, int masterY){
        this.cadrados[1] = new Cadrado(false,masterX,masterY,tColor);
        this.cadrados[3] = new Cadrado(false,masterX,masterY +Xogo.LADO_CADRADO,tColor);
        this.cadrados[0] = new Cadrado(false,masterX +Xogo.LADO_CADRADO,masterY ,tColor);
        this.cadrados[2] = new Cadrado(false,masterX -Xogo.LADO_CADRADO,masterY ,tColor);
    }
   
}
