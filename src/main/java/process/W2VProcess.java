package process;

import file.ObtainVectors;
import model.SimilarityValue;
import model.VectorModel;
import similarity.CosineSimilarity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mustafa on 12.04.2017.
 */
public class W2VProcess {
    public static void main(String[] args) {
        ObtainVectors obtainVectors = new ObtainVectors();
        List<VectorModel> vectorModelList = obtainVectors.readVector("wiki.tr.vec");

        List<SimilarityValue> smList = new ArrayList<SimilarityValue>();
        CosineSimilarity cs = new CosineSimilarity();

        //ilk kelimen,n her kelimeye uzaklığını hesapla
        VectorModel model = vectorModelList.get(33000);
        System.out.println("Kelime:" + model.getToken());

        for(int i = 0; i < vectorModelList.size(); i++) {
            SimilarityValue sm = new SimilarityValue();
            sm.setToken(vectorModelList.get(i));
            sm.setValue(cs.findSimilarity(model.getVector(), vectorModelList.get(i).getVector()));
            smList.add(sm);
        }

        model.setSimilarityList(smList);

        //sırala
        Collections.sort(model.getSimilarityList(), new SimilarityComparator());

        int i = 0;
        for(SimilarityValue m: model.getSimilarityList()) {
            if(i < 100)
                System.out.println(m.getToken().getToken());
            i++;
        }
    }

    public static class SimilarityComparator implements Comparator<SimilarityValue> {
        public int compare(SimilarityValue s1, SimilarityValue s2) {
            return s1.compareTo(s2);
        }
    }
}
