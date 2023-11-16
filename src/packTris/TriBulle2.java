package packTris;

import packData.MyData;

/**
 * @author Effantin
 */
public class TriBulle2 extends AbstractTri {

    public TriBulle2(MyData data) {
        super(data);
    }

    @Override
    public int[] next() {
        int taille = this.getDataTab().length;
        for(int i=0; i < taille; i++)
        {
            for(int j=1; j < (taille-i); j++)
            {
                if(this.getDataTab()[j-1] > this.getDataTab()[j])
                {
                    this.getData().exchange(j-1, j);
                    return this.getDataTab();
                }

            }
        }
        return this.getDataTab();
    }
}
