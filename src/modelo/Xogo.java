package modelo;

import iu.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Xogo {

    public static final int LADO_CADRADO = 20;
    public static final int MAX_X = 240;            //Changed to -20 so that X and Y detection would work
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
    private int score = 0;

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

        if (collidingCurrentToFloor() || fichaActual.isCollideWithLowerLimit()) {
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
        if ((x >= 0) && (x <= (MAX_X-20))) { //-20 so as to keep integrity (label coords are on bottom left)
            clampedOnX = true;
        }

        //Clamped on Y?
        if ((y >= 0) && (y <= MAX_Y)) {
            clampedOnY = true;
        }

        //Is occupied?
        this.it = floor.iterator();
        unOccupied = true;

        while (it.hasNext()) {
            Cadrado j = it.next();

            if (x == j.getX() && y == j.getY()) {
                unOccupied = false;
            }
        }

        //Final operand
        if (clampedOnX && clampedOnY && unOccupied) {
            return true;
        } else {
            return false;
        }
    }

    //Floor methods
    /**
     * Converts each current piece of fichaActual into a floor piece, the calls
     * for creation of a new fichaActual.
     */
    public void fuseCurrentToFloor() {
        for (int i = 0; i < 4; i++) {
            this.floor.add(this.fichaActual.cadrados[i]);
        }

        this.createNewRandomFicha();    //Consider changing this call to other position
        this.contarLineas();
    }

    /**
     *
     * @return
     *
     * Checks if the piece will collide onto a floor piece within the next tick
     */
    public boolean collidingCurrentToFloor() {
        //Build an iterator for floor collection
        this.it = floor.iterator();

        while (it.hasNext()) {

            //Define the square to compare
            Cadrado j = it.next();

            //Compare to Y+l and X in order to check collisions
            for (int i = 0; i < 4; i++) {

                if (j.getY() == this.fichaActual.cadrados[i].getY() + LADO_CADRADO && j.getX() == this.fichaActual.cadrados[i].getX()) {

                    return true;    //Condition to floor fusion

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

    public void killAll() {

        this.fichaActual = null;
        this.floor = null;
    }

    //Line detection and deletion
    public void contarLineas() {

        ArrayList<Cadrado> deletable = new ArrayList();
        int ammDeletedLines = 0;
        int highestLineCounter = 0; //Always start at 0

        for (int i = 0; i <= MAX_Y / LADO_CADRADO; i++) {

            int counter = 0; //Start at 0, goes to maxX/lado
            this.it = floor.iterator(); //Restart iterator pertesting

            while (it.hasNext()) {

                if (it.next().getY() == (i * LADO_CADRADO)) {
                    counter++;
                }

            }

            //DEBUG STATEMENT
            //System.out.println("[Line: " + i + "/" + MAX_Y / LADO_CADRADO + "]" + "[counted: " + counter + " / max: " + MAX_X / LADO_CADRADO + "]");

            //By now we have checked an entire line
            if (counter == MAX_X / LADO_CADRADO) {
                
                if((i*LADO_CADRADO) > highestLineCounter){
                    highestLineCounter = (i*LADO_CADRADO);
                }
                
                //Add line to deleteable arraylist, add 1 tp "ammDeletedLines"
                ammDeletedLines++;

                Iterator<Cadrado> extract = floor.iterator();

                //**** Now we know i is full we can extract all the squares on its Y value
                //DEBUG STATEMENT
                //System.out.println(">>>EXTRACTING LINE");

                while (extract.hasNext()) {

                    Cadrado nextSquare = extract.next();
                        
                    if (nextSquare.getY() == (i * LADO_CADRADO)) {
                        deletable.add(nextSquare);
                    }

                }

                //DEBUG STATEMENT
                //System.out.println(">>>EXTRACTION FINISHED");

                //**** Now deletable owns a reference to all cadrados on Y = i
                //>> The loop continues to next Y = i value;
            }
        }
        //By now we have all filled lines

        //Send deletable to deleteLines method
        if (ammDeletedLines >= 1) {
            
            //Score updates
            this.score += 100*ammDeletedLines;
            this.ventanaPrincipal.getPanelScore1().setText(Integer.toString(score));
            
            
            
            borrarLineas(deletable);
            downYtransform(ammDeletedLines,highestLineCounter);
        }
    }

    private void borrarLineas(ArrayList<Cadrado> arr) {

        //DEBUG STATEMENT
        //System.out.println(">>>BORRAR LINEAS: hasBeenCalled");

        Iterator<Cadrado> it = arr.iterator();

        while (it.hasNext()) {
            
            Cadrado next = it.next();
            
            this.ventanaPrincipal.borrarCadrado(next.getLabel());
            
            floor.remove(next);
        }
    }
    
    private void downYtransform(int amountOfLinesDeleted, int highestLine){
        Iterator <Cadrado> it = floor.iterator();
        
        while(it.hasNext()){
            
            Cadrado next = it.next();
            
            if(next.getY() <= highestLine){
                
                next.setY( next.getY() + (amountOfLinesDeleted*LADO_CADRADO)); 
                
            }
        }
        
        ventanaPrincipal.refreshPanel();
    }

    //Serving method
    /**
     *
     * @return ArrayList <JLabel>
     *
     * Passes an ArrayList containing all labels from floor and from piece
     */
    public ArrayList getAllLabels() {
        ArrayList<JLabel> passable = new ArrayList();
        this.it = floor.iterator();

        while (it.hasNext()) {
            passable.add(it.next().getLabel());
        }

        for (int i = 0; i < this.fichaActual.getCadrados().length; i++) {
            passable.add(this.fichaActual.getCadrados()[i].getLabel());
        }

        return passable;
    }
    
    /**
     * 
     * @return boolean
     * 
     * Returns true if a square on the floor has reached the 40y value
     * indicating for end of game. Returns false otherwise.
     */
    public boolean endOfGameDetection(){
        Iterator <Cadrado> iter = floor.iterator();
        
        while(iter.hasNext()){
            
            Cadrado next = iter.next();
            
            if(next.getY() <= 40){
                return true;
            }
        }
        
        return false;
                
    }
}
