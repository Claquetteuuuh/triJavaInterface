package packTris;

import packData.MyData;

/**
 * @author Effantin
 */
public class TriSelection extends AbstractTri {

    private int currentI;

    public TriSelection(MyData data) {
        super(data);
        this.currentI = 0;
    }

    @Override
    public int[] next() {
        int index = this.currentI;
        for (int j = this.currentI + 1; j < this.getDataTab().length; j++)
        {
            if (this.getDataTab()[j] > this.getDataTab()[index]){
                index = j;
            }
        }
        int min = this.getDataTab()[index];
        this.getDataTab()[index] = this.getDataTab()[this.currentI];
        this.getDataTab()[this.currentI] = min;
        currentI ++;
        return this.getDataTab();
    }

    @Override
    public void resetTri(MyData data) {
        currentI = 0;
        super.resetTri(data);
    }
}
