
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
        
    }
}
