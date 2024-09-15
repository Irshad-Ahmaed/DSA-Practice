public class Sort_Array_0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,0,1,2,0,0,2,1};
        int n = arr.length;

//        Better Approach: ------------------------

//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//
//        for (int i =0; i<n; i++){
//            if (arr[i] == 0){
//                count0++;
//            } else if (arr[i] == 1) {
//                count1++;
//            }
//            else {
//                count2++;
//            }
//        }
//
//        for (int i=0; i<count0; i++){
//            arr[i] = 0;
//        }
//        for (int i=count0; i<count0+count1; i++){
//            arr[i] = 1;
//        }
//        for (int i=count0+count1; i<n; i++){
//            arr[i] = 2;
//        }

//        Optimal Approach: ---------------------------

        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid<=high){
            if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int val: arr){
            System.out.print(val + " ");
        }
    }
}
