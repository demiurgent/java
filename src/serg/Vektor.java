package serg;
import java.lang.Math;

public class Vektor {
    
    private int vlength = 0;
    private float[] vek;
    
    public Vektor(int vlength) {
        this.vlength = vlength;
        vek = new float[vlength];
    }
    public float getElement(int i) {
        return vek[i];
    }
    public int getLength() {
        return vlength;
    }
    

    public void setElement(int i, float d) {
        vek[i] = d;
    }
}
