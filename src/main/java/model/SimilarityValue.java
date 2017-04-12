package model;

/**
 * Created by mustafa on 12.04.2017.
 */
public class SimilarityValue implements Comparable<SimilarityValue> {
    private double value;
    private VectorModel token;

    //büyükten küçüğe - benzerlik için
    public int compareTo(SimilarityValue o) {
        double oValue = o.getValue();
        if(this.value > oValue)
            return -1;
        else
            return 1;
    }

    //getter - setter
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public VectorModel getToken() {
        return token;
    }

    public void setToken(VectorModel token) {
        this.token = token;
    }

}
