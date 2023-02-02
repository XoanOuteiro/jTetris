package modelo;

import iu.VentanaPrincipal;
import javax.swing.JPanel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Xogo{
    
    public static final int LADO_CADRADO = 20;
    public static final int MAX_X = 200;
    public static final int MAX_Y = 200;
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
        this.fichaActual = new FichaT(60,60);
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
        fichaActual.moverDereita();
    }
    
    public void moverFichaEsquerda(){
        fichaActual.moverEsquerda();
    }
    
    public void moverFichaAbaixo(){
        fichaActual.moverAbaixo();
    }
    
    public void rotarFicha(){
        
    }
    
}
