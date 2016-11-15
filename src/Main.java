import java.io.*;
import java.lang.*;
import java.util.Random;

public class Main {
    private static final int maxIntegerSize = 100;
    private static final int maxArraySize = 10;
    private static String file = "data.csv";
    private static long startTime;
    private static long endTime;
    private static long totalTime;
    private static MergeSort merge;
    private static InsertionSort insertion;
    private static PrintWriter output;

    public static void main(String[] args) {
       run();
    }

    public static void run() {
        Random generator = new Random();
        try {
            output = new PrintWriter(new File("data.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= maxArraySize; i++) {
            int[] list = new int[i];
            for (int count = 0; count < list.length; count++) {
                list[count] = generator.nextInt(maxIntegerSize);
            }
            runMerge(list);
            runInsertion(list);
        }

    }

    public static void runMerge(int[] list) {

        int[] result;
        merge = new MergeSort();

        startTime = System.currentTimeMillis();
        result = merge.sort(list);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;

//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

        System.out.println("Merge Sort, time: " + totalTime + " array size: " + result.length);

    }

    public static void runInsertion(int[] list) {

        int[] result;
        insertion = new InsertionSort();

        startTime = System.currentTimeMillis();
        result = insertion.sort(list);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;

//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

        System.out.println("Insertion Sort, time: " + totalTime + " array size: " + result.length);
    }
}
