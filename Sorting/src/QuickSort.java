public class QuickSort {
    public static void quickSorting(int[] arr, int low, int high) {
        if (low < high) {

            int pivot = arr[low];
            int i = low;
            int j = high;
            while (i < j) {
                while (arr[i] <= pivot && i <= high-1){
                    i++;
                }
                while (arr[j] > pivot && j >= low+1){
                    j--;
                }
                if (i < j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

            arr[low] = arr[j];
            arr[j] = pivot;


            int partition = j;

            quickSorting(arr, low, partition - 1);
            quickSorting(arr, partition + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,2,7};
        int n = arr.length-1;
        quickSorting(arr, 0, n);

        for (int i=0; i<=n; i++){
            System.out.println(arr[i]);
        }
    }
}
