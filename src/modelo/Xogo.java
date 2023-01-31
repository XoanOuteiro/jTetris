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
    
    public static final int LADO_CADRADO = 10;
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
        
        //Set placeholder pane as invisible
        holder.setVisible(true);
        
        //Get attributes of shapeholder
        holder.setBounds(holder.getBounds());
        holder.setBackground(holder.getBackground());
        holder.setBorder(holder.getBorder());
        
        //Create grid
        this.colAM = colAm;
        this.celSiz = holder.getBounds().width/colAm;
        this.rowAM = holder.getBounds().height/celSiz; 
        
        //TEST
        this.fichaActual = new FichaT(39,0);
        holder.add(fichaActual.right.label_cadrado);
    }
    
    
    
    /*
            //OVERRIDES
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        drawGrid(g);
    }
    
    public void drawGrid(Graphics g){
        for(int i=0; i< rowAM; i++){
            for (int j = 0; j < colAM; j++) {
                
                 //Grid(style only)
                 g.drawRect(j*celSiz, i*celSiz , celSiz, celSiz);
                }
            }
        }
    }
    */
}
