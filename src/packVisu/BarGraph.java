package packVisu;

import javax.swing.JPanel;
import packData.MyData;

import java.awt.*;


/**
 * @author Eric
 */
public class BarGraph extends JPanel {
   
    private MyData data;
    private int largeur;
    private int hauteur;
    
    public BarGraph(MyData data){
        this.data = data;
        this.largeur = 30;
        this.hauteur = 500;
        this.setPreferredSize(new Dimension(this.data.getNbData()*this.largeur, this.hauteur));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 0;
        for (int i = 0; i < this.data.getNbData(); i++) {
            g.setColor(Color.BLUE);
            g.fillRect(x, data.getData()[i]*10, this.largeur, this.hauteur);
            g.setColor(Color.BLACK);
            g.drawRect(x, data.getData()[i]*10, this.largeur, this.hauteur);
            x = x + this.largeur;
        }
    }
}
