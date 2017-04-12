package file;

import model.VectorModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mustafa on 12.04.2017.
 */
public class ObtainVectors {
    public List<VectorModel> readVector(String fileName) {
        List<VectorModel> vectors = new ArrayList<VectorModel>();
        int i = 0;

        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();

            while(line != null && i < 100000) {
                vectors.add(parseToVectorModel(line));
                line = br.readLine();
                i++;
            }

            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        return vectors;
    }

    private VectorModel parseToVectorModel(String line) {
        String[] tokenStrings = line.split(" ");
        VectorModel vectorModel = new VectorModel();
        vectorModel.setToken(tokenStrings[0]);

        List<Double> vectorList = new ArrayList<Double>();

        for(int i = 1; i < tokenStrings.length; i++) {
            vectorList.add(Double.valueOf(tokenStrings[i]));
        }

        //
        double[] vectorArray = new double[vectorList.size()];
        for(int i = 0; i < vectorList.size(); i++) {
            vectorArray[i] = vectorList.get(i); // getirme karmaşıklığı ?
        }

        vectorModel.setVector(vectorArray);

        return vectorModel;
    }
}
