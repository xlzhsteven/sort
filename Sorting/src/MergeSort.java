
public class MergeSort {
    private int[] arr;
    private int length;
    private int[] tmpArr;

    public int[] sort(int[] arr){
        this.arr = arr;
        this.length = arr.length;
        this.tmpArr = new int[length];
        mergeSort(0, length - 1);
        return arr;
    }

    private void mergeSort(int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex) {
            int midIndex = lowerIndex + (higherIndex - lowerIndex)/2;
            mergeSort(lowerIndex, midIndex);
            mergeSort(midIndex + 1, higherIndex);
            merge(lowerIndex, midIndex, higherIndex);
        }
    }

    private void merge(int lowerIndex, int midIndex, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tmpArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = midIndex + 1;
        int k = lowerIndex;
        while (i<=midIndex && j<=higherIndex){
            if (tmpArr[i]<=tmpArr[j]){
                arr[k] = tmpArr[i];
                i++;
            } else {
                arr[k] = tmpArr[j];
                j++;
            }
            k++;
        }
        while (i<=midIndex){
            arr[k] = tmpArr[i];
            i++;
            k++;
        }
    }
}
