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
    
    public FichaT fichaActual;
            
    //Construction
    public Xogo(JPanel holder,VentanaPrincipal ventana,int colAm){
        //Match styles
        this.ventanaPrincipal = ventana;
        
        //TEST
        this.fichaActual = new FichaT(60,60);
        holder.add(fichaActual.right.label_cadrado);
        holder.add(fichaActual.masterPiece.label_cadrado);
        holder.add(fichaActual.centerDown.label_cadrado);
        holder.add(fichaActual.left.label_cadrado);
    }
}
