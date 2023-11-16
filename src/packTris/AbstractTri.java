package packTris;

import packData.MyData;

/**
 *
 * @author Effantin
 */
public abstract class AbstractTri {
    private MyData data;

    protected AbstractTri(MyData data){
        this.data = data;

    }
    public int[] next(){
        return new int[0];
    }

    public int[] getDataTab() {
        return data.getData();
    }

    public MyData getData() {
        return data;
    }

    public void resetTri(MyData data){
        this.data = data;
    }
}
