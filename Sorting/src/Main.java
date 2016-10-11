import java.util.Arrays;
import java.util.Random;

/**
 * Created by Xiaolong on 3/27/16.
 */
public class Main {
    static final int MAX = 100;
    static final int MIN = 0;
    static final int ARRY_SIZE = 10;

    public static void main(String[] args) {
        double startTime;

//        System.out.println("Start Bubble sort");
//		BubbleSort bubbleSort = new BubbleSort();
//		startTime = System.nanoTime();
//		bubbleSort.sort(getRandomIntArray());
//		printBenchMark(startTime, "Bubble");

//		System.out.println("Start Selection sort");
//		SelectionSort selectionSort = new SelectionSort();
//		startTime = System.nanoTime();
//		selectionSort.sort(getRandomIntArray());
//		printBenchMark(startTime, "Selection");

//		System.out.println("Start Insertion sort");
//		InsertionSort insertionSort = new InsertionSort();
//		startTime = System.nanoTime();
//		insertionSort.sort(getRandomIntArray());
//		printBenchMark(startTime, "Insertion");

        System.out.println("Start Merge sort");
        MergeSort mergeSort = new MergeSort();
        startTime = System.nanoTime();
        mergeSort.sort(getRandomIntArray());
//        printBenchMark(startTime, "Merge");
//
//        System.out.println("Start System sort");
//        startTime = System.nanoTime();
//        Arrays.sort(getRandomIntArray());
//        printBenchMark(startTime, "System");
    }

    private static int[] getRandomIntArray() {
        // Provide input array to sort
        Random random = new Random();
        int[] inputs = new int[ARRY_SIZE];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
        return inputs;
    }

    private static void printBenchMark(double startTime, String sortingMethod){
        System.out.printf("Total time taken: %.2f \nEnd %s sort\n\n", (System.nanoTime() - startTime)/1000000000.0, sortingMethod);
    }

    private static void printArr(int[] arr){
        for (int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

}
