public class Main {

    public static void main(String[] args) {
        int[] list = {1,4,6,78,46,90,23,5,56};
        int[] result = new int[list.length];
        MergeSort mergeSort = new MergeSort();
        InsertionSort insertionSort = new InsertionSort();

        result = insertionSort.sort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(result[i]);
        }
    }
}
