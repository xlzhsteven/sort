
public class SelectionSort {
    public int[] sort (int[] arr){
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = tmp;
        }
        return arr;
    }
}
