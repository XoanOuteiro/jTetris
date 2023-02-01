package modelo;

import iu.VentanaPrincipal;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Xogo{
    
    public static final int LADO_CADRADO = 20;
    public final int MAX_X = 200;
    public final int MAX_Y = 200;
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
        this.fichaActual = new FichaCadrada(60,60);
        for (int i = 0; i < 4; i++) {
            holder.add(fichaActual.cadrados[i].label_cadrado);
        }
    }
}
