package sorting;

/**
 * Created by mustafa on 12.04.2017.
 */
public class SelectionSort implements SortingType {

    //büyükten küçüğe sıralar; benzerlik için
    //ileride iki taraflı da sıralayabilsin, 2 farklı metot
    public void sortingOnArray(double[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    double tempt = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempt;
                }
            }
        }
    }
}
