
package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class FichaT extends Ficha{
    //Cadrado
    public Cadrado right;
    public Cadrado masterPiece;
    public Cadrado left;
    public Cadrado centerDown;


    //Color
    public Color tColor = Color.red;
    
    //Player-controlled instancing
    public FichaT(int masterX, int masterY){
        this.masterPiece = new Cadrado(false,masterX,masterY,tColor);
        this.centerDown = new Cadrado(false,masterX,masterY +Xogo.LADO_CADRADO,tColor);
        this.right = new Cadrado(false,masterX +Xogo.LADO_CADRADO,masterY ,tColor);
        this.left = new Cadrado(false,masterX -Xogo.LADO_CADRADO,masterY ,tColor);
    }
   
}
