import java.util.Arrays;

/**
 * Created by johndupuis on 11/13/16.
 */
public class MergeSort {

    public int[] sort(int[] testArray) {
        if (testArray.length == 1) {
            return testArray;
        } else {
            int middle = testArray.length/2;
            int[] first = Arrays.copyOfRange(testArray, 0, middle);
            int[] second = Arrays.copyOfRange(testArray, middle, testArray.length);
            sort(first);
            sort(second);
            return merge(first, second, testArray);
        }
    }

    public int[] merge(int[] first, int[] second, int[] testArray) {
        int firstIndex = 0;
        int secondIndex = 0;
        int index = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                testArray[index++] = first[firstIndex++];
            } else {
                testArray[index++] = second[secondIndex++];
            }
        }

        while (firstIndex < first.length) {
            testArray[index++] = first[firstIndex++];
        }

        while (secondIndex < second.length) {
            testArray[index++] = second[secondIndex++];
        }

        return testArray;

    }


}
