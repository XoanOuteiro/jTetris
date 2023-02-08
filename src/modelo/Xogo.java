package modelo;

import iu.VentanaPrincipal;
import javax.swing.JPanel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Xogo{
    
    public static final int LADO_CADRADO = 20;
    public static final int MAX_X = 220;            //Changed to -20 so that X and Y detection would work
    public static final int MAX_Y = 580;
    public boolean pausa;
    public VentanaPrincipal ventanaPrincipal;
    public int numeroLineas;
    public int rowAM ;
    public int colAM ;
    public int celSiz ;//= to lado¿
    
    public Ficha fichaActual;
            
    //Construction
    public Xogo(JPanel holder,VentanaPrincipal ventana,int colAm){
        //Match styles
        this.ventanaPrincipal = ventana;
        
        //TEST
        this.fichaActual = new FichaBarra(60,60);
        for (int i = 0; i < 4; i++) {
            holder.add(fichaActual.cadrados[i].label_cadrado);
        }
    }
    
    //Getters & Setters
    public Ficha getFichaActual() {
        return fichaActual;
    }
    
    //Mover
    public void moverFichaDereita(){
        if(ePosicionValida(fichaActual.getMostRightSquare().getX() + LADO_CADRADO , fichaActual.getMostRightSquare().getY())){
            fichaActual.moverDereita();
        }
        
    }
    
    public void moverFichaEsquerda(){
        if(ePosicionValida(fichaActual.getMostLeftSquare().getX() - LADO_CADRADO , fichaActual.getMostLeftSquare().getY())){
            fichaActual.moverEsquerda();
        }
    }
    
    public void moverFichaAbaixo(){
        if(ePosicionValida(fichaActual.getMostDownSquare().getX() , fichaActual.getMostDownSquare().getY() + LADO_CADRADO))
            fichaActual.moverAbaixo();
    }
    
    public void rotarFicha(){
        fichaActual.rotar();
    } 
    
    //Utility logic
    /**
     * 
     * @param x
     * @param y
     * @return boolean
     * 
     * Requests a two values of a square (post-transform), if said
     * position is not out of bounds or already occupied it returns "true"
     * as in "this position is valid", else it returns false.
     * 
     * This method is used for all transform methods
     */
    public boolean ePosicionValida(int x, int y){
        //Attributes
        boolean clampedOnX = false;
        boolean clampedOnY = false;
        boolean unOccupied = true;  //Change when collisions are made
        
        //Clamped on X?
        if( (x >= 0) && (x <= MAX_X) ){ clampedOnX = true; }
        
        //Clamped on Y?
        if( (y >= 0) && (y <= MAX_Y) ){ clampedOnY = true; }
        
        //Is occupied?
        //!!!TBI!!!
        
        //Final operand
        if(clampedOnX && clampedOnY && unOccupied){
            return true;
        } else {
            return false;
        }
    }
}
