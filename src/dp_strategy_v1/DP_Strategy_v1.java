/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_strategy_v1;
import packData.MyData;
import packTris.TriBulle;
import packVisu.MaFenetre;

import java.util.Arrays;

/**
 * @author brice.effantin
 */
public class DP_Strategy_v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyData donnees = new MyData(20);
        MaFenetre frame = new MaFenetre(donnees);

        TriBulle triBulle = new TriBulle(donnees);


        frame.setVisible(true);
    }
    
}
