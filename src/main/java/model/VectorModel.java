package model;

import process.W2VProcess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mustafa on 12.04.2017.
 */
public class VectorModel {
    private String token;
    private double[] vector;
    private List<SimilarityValue> similarityList = new ArrayList<SimilarityValue>();

    //constructor
    public VectorModel() {

    }

    public VectorModel(String token, double[] vector) {
        this.token = token;
        this.vector = vector;
    }

    //getter - setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public List<SimilarityValue> getSimilarityList() {
        return similarityList;
    }

    public void setSimilarityList(List<SimilarityValue> similarityList) {
        this.similarityList = similarityList;
    }
}
