
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class Tests {
    private int[] testArray;
    private final int SIZE = 10;
    private final int MAX_NUM = 20;
    private Random generator;


    @Before
    public void setUp() {
        testArray = new int[SIZE];
        generator = new Random();

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = generator.nextInt(MAX_NUM);
        }
    }

    @Test
    public void mergeSortTest() {
        MergeSort merge = new MergeSort();
        merge.sort(testArray);
        for (int i = 0; i < testArray.length - 1; i++) {
            if (testArray[i] > testArray[i + 1]) {
                fail("Merge Failed");
            }
        }
        assertTrue(true);
    }

    @Test
    public void insertionSortTest() {
        InsertionSort insertion = new InsertionSort();
        insertion.sort(testArray);
        for (int i = 0; i < testArray.length - 1; i++) {
            if (testArray[i] > testArray[i + 1]) {
                fail("Insertion Failed");
            }
        }
        assertTrue(true);

    }

}
