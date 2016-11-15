import java.io.*;
import java.lang.*;
import java.util.Random;

public class Main {
    private static final int MAX_INTEGER_SIZE = 4500;
    private static final int MAX_ARRAY_SIZE = 4000;
    private static String file = "data.csv";
    private static long startTime;
    private static long endTime;
    private static long totalTime;
    private static MergeSort merge;
    private static InsertionSort insertion;
    private static BufferedWriter output;
    private static long mergeTime;
    private static long insertionTime;

    public static void main(String[] args) {
       run();
    }

    public static void run() {
        Random generator = new Random();
        try {
            output = new BufferedWriter(new FileWriter(file));
            output.write("Array Length,Execution Time Merge Sort,Execution Time Insertion Sort");
            output.newLine();

            for (int i = 1; i <= MAX_ARRAY_SIZE; i++) {
                int[] list = new int[i];
                for (int count = 0; count < list.length; count++) {
                    list[count] = generator.nextInt(MAX_INTEGER_SIZE);
                }
                mergeTime = runMerge(list);
                insertionTime = runInsertion(list);
                output.write(list.length + "," + mergeTime + "," + insertionTime);
                output.newLine();
            }
        } catch (IOException e) {
            System.out.println("Problem writing to the file: " + e);
        } finally {
            try {
                System.out.println("closed");
                output.close();
            } catch (IOException e) {
                System.out.println("Problem closing BufferedWriter: " + e);
            }
        }
    }

    public static long runMerge(int[] list) {

        int[] result;
        merge = new MergeSort();

        startTime = System.nanoTime();
        result = merge.sort(list);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;

        return totalTime;
    }

    public static long runInsertion(int[] list) {

        int[] result;
        insertion = new InsertionSort();

        startTime = System.nanoTime();
        result = insertion.sort(list);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;

        return totalTime;
    }
}
