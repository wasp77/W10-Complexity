/**
 * Created by johndupuis on 11/13/16.
 */
public class InsertionSort {
    public int[] sort(int[] testArray) {
        if (testArray.length == 1) {
            return testArray;
        } else {
            for (int i = 1; i < testArray.length; i++) {
                for (int index = i; index > 0; index--) {
                    if (testArray[index] < testArray[index - 1]) {
                        int holdingNum = testArray[index];
                        testArray[index] = testArray[index - 1];
                        testArray[index - 1] = holdingNum;
                    }
                }
            }
            return testArray;
        }
    }
}
