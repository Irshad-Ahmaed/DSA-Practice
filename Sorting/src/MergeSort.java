import java.util.*;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int leftPointer = low;
        int rightPointer = mid+1;

        while (leftPointer <= mid && rightPointer <= high){
            if (arr[leftPointer] <= arr[rightPointer]){
                temp.add(arr[leftPointer]);
                leftPointer++;
            }
            else {
                temp.add(arr[rightPointer]);
                rightPointer++;
            }
        }

        while (leftPointer <= mid){
            temp.add(arr[leftPointer]);
            leftPointer++;
        }

        while (rightPointer <= high){
            temp.add(arr[rightPointer]);
            rightPointer++;
        }

        for (int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    public static void mergeSorting(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high)/2;
        mergeSorting(arr, low, mid);
        mergeSorting(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,6,8,1,10,7};
        int n = arr.length-1;
        mergeSorting(arr, 0, n);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
