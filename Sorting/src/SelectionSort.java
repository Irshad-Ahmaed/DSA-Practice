public class SelectionSort {
    public static void SelectionSorting(int[] arr) {
        int n = arr.length;
//        int min = Integer.MAX_VALUE;
        for (int i=0; i<n-1; i++){
            int min = i;
            for (int j=i; j<n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        SelectionSorting(arr);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
