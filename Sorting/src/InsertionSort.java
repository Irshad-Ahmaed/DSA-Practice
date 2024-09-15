public class InsertionSort {
    public static void InsertionSorting(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n; i++){
            int j = i;
            while (j>0 && arr[j-1] > arr[j]){
                // swap until j>0

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5};

        InsertionSorting(arr);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
