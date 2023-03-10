
package modelo;

import java.awt.Color;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class FichaCadrada extends Ficha{
    //Cadrados
    /*
    [0][1]
    [2][3]
    */
    private Color tColor = Color.blue;
    
    //Construction
    public FichaCadrada(int masterX, int masterY){
        this.cadrados[0] = new Cadrado(false,masterX,masterY,tColor);
        this.cadrados[1] = new Cadrado(false,masterX + Xogo.LADO_CADRADO,masterY,tColor);
        this.cadrados[2] = new Cadrado(false,masterX,masterY + Xogo.LADO_CADRADO,tColor);
        this.cadrados[3] = new Cadrado(false,masterX + Xogo.LADO_CADRADO,masterY + Xogo.LADO_CADRADO,tColor);
    }
    
    //Abstract extension
    @Override
    public void rotar(){
        //Squares do not rotate as their rotation will be the same as previous position.
    }
}
