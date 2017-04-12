package sorting;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mustafa on 12.04.2017.
 */
public class SelectionSortTest {
    private double[] arr;

    @Before
    public void createData() {
        arr = new double[5];
        arr[0] = -0.01324;
        arr[1] = 0.011653;
        arr[2] = 0.1545;
        arr[3] = 0.046001;
        arr[4] = -0.0029892;
    }

    @Test
    public void sorting() {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortingOnArray(arr);

        assertEquals(arr[4], -0.0029892);
        assertEquals(arr[0], 0.1545);

    }
}
