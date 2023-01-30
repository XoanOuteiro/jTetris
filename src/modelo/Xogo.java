package modelo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * by: @XoanOuteiro & @Samuyo
 */
public class Xogo extends JPanel {
    
    public final int LADO_CADRADO = 10;
    public final int MAX_X = 200;
    public final int MAX_Y = 200;
    public boolean pausa;
    public JPanel ventanaPrincipal;
    public int numeroLineas;
    public int rowAM ;
    public int colAM ;
    public int celSiz ;//= to lado¿
    
    //test
    public int[][] testBlock = {{1,0},{1,0},{1,1}};
    public void drawBlock(Graphics g){
        for (int row = 0; row < testBlock.length; row++) {
            for (int col = 0; col < testBlock[0].length; col++) {
                if(testBlock[row][col]==1){
                    g.setColor(Color.red);
                    g.fillRect(col*celSiz, row*celSiz , celSiz, celSiz);
                }
            }
        }
    }
    //end of test
            
    //Construction
    public Xogo(JPanel holder, int colAm){
        //Match styles
        this.ventanaPrincipal = holder;
        
        //Set placeholder pane as invisible
        holder.setVisible(false);
        
        //Get attributes of shapeholder
        this.setBounds(holder.getBounds());
        this.setBackground(holder.getBackground());
        this.setBorder(holder.getBorder());
        
        //Create grid
        this.colAM = colAm;
        this.celSiz = this.getBounds().width/colAm;
        this.rowAM = this.getBounds().height/celSiz; 
    }
    
    //OVERRIDES
    /**
     * 
     * @param g 
     * 
     * Multithreaded permadraw
     */
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        drawGrid(g);
        drawBlock(g);
    }
    
    public void drawGrid(Graphics g){
        for(int i=0; i<rowAM; i++){
            for (int j = 0; j < colAM; j++) {
                
                //Grid(style only)
                g.drawRect(j*celSiz, i*celSiz , celSiz, celSiz);
            }
        }
    }
}
