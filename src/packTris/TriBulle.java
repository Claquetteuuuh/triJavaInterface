package packTris;

import packData.MyData;

/**
 * @author Effantin
 */
public class TriBulle extends AbstractTri {

    public TriBulle(MyData data) {
        super(data);
    }

    @Override
    public int[] next() {
        int taille = this.getDataTab().length;
        int tmp = 0;
        for(int i=0; i < taille; i++)
        {
            for(int j=1; j < (taille-i); j++)
            {
                if(this.getDataTab()[j-1] < this.getDataTab()[j])
                {
                    this.getData().exchange(j-1, j);
                    return this.getDataTab();
                }
            }
        }
        return this.getDataTab();
    }

    @Override
    public void resetTri(MyData data) {
        super.resetTri(data);
    }
}
