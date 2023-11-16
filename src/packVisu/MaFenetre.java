package packVisu;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import packData.MyData;
import packTris.*;

public class MaFenetre extends JFrame  {

    private MyData data;
    private AbstractTri tri;
    private JButton autoPlay = new JButton("Autoplay");
    private JButton pauseAutoPlay = new JButton("pause Auto Play");
    private JButton btNext = new JButton("Next");

    private JComboBox combo = new JComboBox();
    private BarGraph barGraph;
    private JButton btRaz = new JButton("Remise à Zero");

    private Timer timer;

    public MaFenetre(MyData data) {

        this.tri = new TriBulle(data);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.data = data;
        barGraph = new BarGraph(data);
        combo.addItem("Tri Bulle 1");
        combo.addItem("Tri Bulle 2");
        combo.addItem("Tri Selection");

        //placement des composants
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill=GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 0;
        this.getContentPane().add(btNext, gc);
        gc.gridy++;
        this.getContentPane().add(barGraph, gc);
        gc.gridy++;
        this.getContentPane().add(combo, gc);
        gc.gridy++;
        this.getContentPane().add(this.btRaz, gc);
        gc.gridy++;
        this.getContentPane().add(this.autoPlay, gc);
        gc.gridy++;
        this.getContentPane().add(this.pauseAutoPlay, gc);

        this.pack();

        // add listeners
        this.btNext.addActionListener(e -> {
            this.tri.next();
            this.repaint();
        });

        this.btRaz.addActionListener(e -> {
            this.data.raz();
            this.tri.resetTri(this.data);
            this.repaint();
        });

        this.combo.addActionListener(e -> {
            String item = combo.getSelectedItem().toString();
            if(item.equalsIgnoreCase("tri bulle 1")){
                this.tri = new TriBulle(this.data);
            }
            if(item.equalsIgnoreCase("tri bulle 2")){
                this.tri = new TriBulle2(this.data);
            }
            if(item.equalsIgnoreCase("tri selection")){
                this.tri = new TriSelection(this.data);
            }
        });

        this.autoPlay.addActionListener(e -> {
            // run player
            this.timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask(){
                @Override
                public void run(){
                    tri.next();
                    repaint();
                }
            },0,500);
        });
        this.pauseAutoPlay.addActionListener(e -> {
            // stop player
            timer.cancel();
        });
    }


}
