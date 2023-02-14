package modelo;

import iu.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Xogo {

    public static final int LADO_CADRADO = 20;
    public static final int MAX_X = 220;            //Changed to -20 so that X and Y detection would work
    public static final int MAX_Y = 580;
    public boolean pausa;
    public VentanaPrincipal ventanaPrincipal;
    public JPanel holder;
    public int numeroLineas;
    public int rowAM;
    public int colAM;
    public int celSiz;//= to lado¿
    public ArrayList<Cadrado> floor;
    public Iterator<Cadrado> it;

    public Ficha fichaActual;

    //Construction
    public Xogo(JPanel holder, VentanaPrincipal ventana, int colAm) {
        //Match styles
        this.ventanaPrincipal = ventana;
        this.holder = holder;

        //Suelo
        this.floor = new ArrayList();

        //TEST
        this.createNewRandomFicha();
    }

    //Getters & Setters
    public Ficha getFichaActual() {
        return fichaActual;
    }

    //Mover
    public void moverFichaDereita() {
        if (ePosicionValida(fichaActual.getMostRightSquare().getX() + LADO_CADRADO, fichaActual.getMostRightSquare().getY())) {
            fichaActual.moverDereita();
        }

    }

    public void moverFichaEsquerda() {
        if (ePosicionValida(fichaActual.getMostLeftSquare().getX() - LADO_CADRADO, fichaActual.getMostLeftSquare().getY())) {
            fichaActual.moverEsquerda();
        }
    }

    public void moverFichaAbaixo() {
        

        if ( collidingCurrentToFloor() || fichaActual.isCollideWithLowerLimit() ) {
            /*
            * Each time the piece is moved down (always using this method by user or and timer)
            * the routine is called and asks if the piece has reached the lower limit, if it has the
            * consequent method is called fusing the pieces squares to the floor and then killing its entity
             */
            this.fuseCurrentToFloor();
            
        } else {
            
            if (ePosicionValida(fichaActual.getMostDownSquare().getX(), fichaActual.getMostDownSquare().getY() + LADO_CADRADO)) {
                fichaActual.moverAbaixo();
            }
            
        }
    }

    public void rotarFicha() {
        fichaActual.rotar();
    }

    //Utility logic
    /**
     *
     * @param x
     * @param y
     * @return boolean
     *
     * Requests a two values of a square (post-transform), if said position is
     * not out of bounds or already occupied it returns "true" as in "this
     * position is valid", else it returns false.
     *
     * This method is used for all transform methods
     */
    public boolean ePosicionValida(int x, int y) {
        //Attributes
        boolean clampedOnX = false;
        boolean clampedOnY = false;
        boolean unOccupied = true;  //Change when collisions are made

        //Clamped on X?
        if ((x >= 0) && (x <= MAX_X)) {
            clampedOnX = true;
        }

        //Clamped on Y?
        if ((y >= 0) && (y <= MAX_Y)) {
            clampedOnY = true;
        }

        //Is occupied?
        //!!!TBI!!!
        //Final operand
        if (clampedOnX && clampedOnY && unOccupied) {
            return true;
        } else {
            return false;
        }
    }

    //Floor methods
    public void fuseCurrentToFloor() {
        for (int i = 0; i < 4; i++) {
            this.floor.add(this.fichaActual.cadrados[i]);
        }

        this.createNewRandomFicha();    //Consider changing this call to other position
    }
    
    public boolean collidingCurrentToFloor(){
        this.it = floor.iterator();
        
        
        for (int i = 0; i < 4; i++) {
       
            while (it.hasNext()){
                
                //System.out.println("[" + Arrays.toString(it.next().getCoordenadas()) + " / " + Arrays.toString(compareArray) + "]");
                //System.out.println(it.next().getY() + "/" + (this.fichaActual.cadrados[i].getY() + LADO_CADRADO));   
                
                Cadrado j = it.next();
                        
                if(j.getY() <= this.fichaActual.cadrados[i].getY() + (LADO_CADRADO*2) && j.getX() == this.fichaActual.cadrados[i].getX()){
                    
                    System.out.println("Checked");
                    
                    return true;
                    
                }        
            }
        }
        
        return false;
        
    }

    //Killer methods and restarts
    public void createNewRandomFicha() {
         Random rand = new Random();
        int index = rand.nextInt(4) + 1;

        switch (index) {
            case 1:

                this.fichaActual = new FichaT(120, 20);
                for (int i = 0; i < 4; i++) {
                    this.holder.add(fichaActual.cadrados[i].label_cadrado);
                }

                break;

            case 2:

                this.fichaActual = new FichaBarra(120, 20);
                for (int i = 0; i < 4; i++) {
                    this.holder.add(fichaActual.cadrados[i].label_cadrado);
                }

                break;

            case 3:

                this.fichaActual = new FichaCadrada(120, 20);
                for (int i = 0; i < 4; i++) {
                    this.holder.add(fichaActual.cadrados[i].label_cadrado);
                }

                break;

            case 4:

                this.fichaActual = new FichaL(120, 20);
                for (int i = 0; i < 4; i++) {
                    this.holder.add(fichaActual.cadrados[i].label_cadrado);
                }

                break;

            default:
                break;
        }
    }
}
