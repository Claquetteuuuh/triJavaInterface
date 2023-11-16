package packData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyData {
    private Integer nbData;
    private int[] t;
    public MyData(Integer nbData){
        this.nbData = nbData;
        this.t = new int[this.nbData];
        raz();
    }

    public void raz(){
        for (int i = 0; i < nbData; i++) {
            Integer n = Math.toIntExact(Math.round(Math.random() * 30));
            t[i] = n;
        }
    }

    public int[] getData() {
        return t;
    }

    public void exchange(int index1, int index2){
        int temp = this.t[index2];
        this.t[index2] = this.t[index1];
        this.t[index1] = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(t);
    }

    public Integer getNbData() {
        return nbData;
    }
}
