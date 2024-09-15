public class BubbleSort {
    public static void BubbleSorting(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            boolean isSwaped = false;
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped){
                System.out.println("Everything is in the correct order");
                break;
            }
        }

    }
    public static void main(String[] args) {
//        int[] arr = {2,1,5,4,3};
        int[] arr = {1,2,3,4,5};
        BubbleSorting(arr);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
